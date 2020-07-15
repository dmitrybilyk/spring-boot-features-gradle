package com.spring.featuresgradle.controllers;

import com.spring.featuresgradle.documents.Todo;
import com.spring.featuresgradle.repositories.TodoRepository;
import com.spring.featuresgradle.services.TodoService;
import org.apache.catalina.connector.Response;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class TodoController {
    @Autowired
    private TodoService todoService;
    @Autowired
    private TodoRepository todoRepository;

    @GetMapping("/")
    public String index(Model model){
        seedData();
        model.addAttribute("todos", todoService.listAll());
        return "index";
    }

    @GetMapping("/todo/complete/{id}")
    public String complete(@PathVariable String id) {
//        Todo todo = todoService.getById(id);
//        if (todo != null) {
//            todo.setCompleted(Boolean.TRUE);
//            todoService.saveOrUpdate(todo);
//        }
        return "redirect:/";
    }

    private void seedData() {
//        Todo todo1 = todoRepository.save(new Todo("Pay car insurance"));
//        Todo todo2 = todoRepository.save(new Todo("Play more Skyrim"));
    }
}
