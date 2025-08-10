# Gerenciador de Tarefas Simples

![Status do Projeto](https://img.shields.io/badge/Status-Concluído-brightgreen)

Aplicação web simples, no estilo CRUD (Create, Read, Update, Delete), para gerenciamento de tarefas diárias. Este projeto foi desenvolvido como parte de um estudo prático sobre o ecossistema Spring, demonstrando a criação de uma aplicação full-stack do zero.

---

### Demonstração

![Demonstração do Projeto](https://github.com/HenriqueVieira03/gerenciador-tarefas/issues/1#issue-3307810135)

---

### Funcionalidades

- **Criar** novas tarefas com uma descrição.
- **Visualizar** todas as tarefas em uma lista clara e organizada.
- **Atualizar** o status de uma tarefa para "concluída" ou "não concluída" com um único clique.
- **Excluir** uma tarefa permanentemente da lista.
- A data de criação é registrada automaticamente para cada nova tarefa.

---

### Tecnologias Utilizadas

- **Linguagem:** Java 17
- **Framework:** Spring Boot
- **Template Engine (Frontend):** Thymeleaf
- **Persistência de Dados:** Spring Data JPA
- **Banco de Dados (Desenvolvimento):** H2 In-Memory Database
- **Build Tool:** Maven
- **Servidor:** Tomcat Embutido

---

### Como Executar o Projeto

#### Pré-requisitos

Antes de começar, você vai precisar ter instalado em sua máquina as seguintes ferramentas:
* [JDK 17](https://www.oracle.com/java/technologies/javase/jdk17-archive-downloads.html)
* [Maven](https://maven.apache.org/download.cgi)

#### Rodando o projeto

```bash
# Clone este repositório
$ git clone [https://github.com/SEU-USUARIO/gerenciador-tarefas.git](https://github.com/SEU-USUARIO/gerenciador-tarefas.git)

# Acesse a pasta do projeto no terminal/cmd
$ cd gerenciador-tarefas

# Execute o projeto com o Maven
$ mvn spring-boot:run

# A aplicação estará disponível no seu navegador em http://localhost:8080/tarefas
```
---

### Licença

Este projeto está sob a licença MIT. Veja o arquivo [LICENSE](LICENSE.md) para mais detalhes.
