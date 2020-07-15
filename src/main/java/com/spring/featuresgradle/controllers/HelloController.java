package com.spring.featuresgradle.controllers;

import com.spring.featuresgradle.documents.Todo;
import com.spring.featuresgradle.repositories.TodoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.LinkedList;
import java.util.List;

@Controller
public class HelloController {

    private final TodoRepository todoRepository;

    public HelloController(TodoRepository todoRepository) {
        this.todoRepository = todoRepository;
    }

    @PostMapping("/hello")
    @ResponseBody
    public Todo hello(@RequestBody Todo todo) {
        List<String> linkedList = new LinkedList<>();
        linkedList.add("dfdf");
        linkedList.add("ddd");
        System.out.println(linkedList.get(1));
        Todo t = todoRepository.save(todo);
        Todo todoFromDB = todoRepository.findById(t.getId()).orElse(null);
        return todoFromDB;
    }

    @RequestMapping("/postHello")
    @ResponseBody
    public Todo postHello() {
        return new Todo();
    }

    @GetMapping("/ifExistsByName")
    @ResponseBody
    public boolean postHello(String name) {
        return todoRepository.existsByName(name);
    }
}
