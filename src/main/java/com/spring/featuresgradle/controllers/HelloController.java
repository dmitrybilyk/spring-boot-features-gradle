package com.spring.featuresgradle.controllers;

import com.spring.featuresgradle.documents.Todo;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.LinkedList;
import java.util.List;

@Controller
public class HelloController {

    @PostMapping("/hello")
    @ResponseBody
    public Todo hello(@RequestBody Todo todo) {
        List<String> linkedList = new LinkedList<>();
        linkedList.add("dfdf");
        linkedList.add("ddd");
        System.out.println(linkedList.get(1));
        return todo;
    }

    @RequestMapping("/postHello")
    @ResponseBody
    public Todo postHello() {
        return new Todo();
    }

    @GetMapping("/ifExistsByName")
    @ResponseBody
    public boolean postHello(String name) {
        return true;
    }
}
