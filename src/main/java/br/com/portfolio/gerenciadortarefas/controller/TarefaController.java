package br.com.portfolio.gerenciadortarefas.controller;

import br.com.portfolio.gerenciadortarefas.model.Tarefa;
import br.com.portfolio.gerenciadortarefas.repository.TarefaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

import java.util.List;
import java.util.Optional;

@Controller
public class TarefaController {

    @Autowired
    private TarefaRepository tarefaRepository;

    @GetMapping("/tarefas")
    public String listarTarefas(Model model) {
        List<Tarefa> tarefas = tarefaRepository.findAll();

        model.addAttribute("tarefas", tarefas);

        return "tarefas-lista";
    }

    @GetMapping("/tarefas/nova")
    public String mostrarFormularioDeNovaTarefa(Model model) {
        model.addAttribute("tarefa", new Tarefa());

        return "tarefa-form";
    }

    @PostMapping("/tarefas")
    public String salvarTarefa(@ModelAttribute("tarefa") Tarefa tarefa) {
        tarefaRepository.save(tarefa);

        return "redirect:/tarefas";
    }

    @PostMapping("/tarefas/concluir/{id}")
    public String concluirTarefa(@PathVariable("id") Long id) {
        Optional<Tarefa> tarefaOpt = tarefaRepository.findById(id);

        if (tarefaOpt.isPresent()) {
            Tarefa tarefa = tarefaOpt.get();
            tarefa.setConcluida(!tarefa.isConcluida());
            tarefaRepository.save(tarefa);
        }

        return "redirect:/tarefas";
    }
    @PostMapping("/tarefas/excluir/{id}")
    public String excluirTarefa(@PathVariable("id") Long id) {
        tarefaRepository.deleteById(id);

        return "redirect:/tarefas";
    }
}
