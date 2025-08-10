package br.com.portfolio.gerenciadortarefas.controller;

import br.com.portfolio.gerenciadortarefas.model.Tarefa;
import br.com.portfolio.gerenciadortarefas.repository.TarefaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.List;

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
}
