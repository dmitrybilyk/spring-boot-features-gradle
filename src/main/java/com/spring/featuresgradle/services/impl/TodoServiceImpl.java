package com.spring.featuresgradle.services.impl;

import com.spring.featuresgradle.documents.Todo;
import com.spring.featuresgradle.repositories.TodoRepository;
import com.spring.featuresgradle.services.TodoService;
import org.bson.types.ObjectId;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class TodoServiceImpl implements TodoService {
    @Autowired
    private TodoRepository todoRepository;

    @Override
    public Iterable listAll() {
        return todoRepository.findAll();
    }

    @Override
    public Todo getById(ObjectId id) {
        return todoRepository.findById(id).orElse(null);
    }

    @Override
    public Todo saveOrUpdate(Todo todo) {
        todoRepository.save(todo);
        return todo;
    }
}
