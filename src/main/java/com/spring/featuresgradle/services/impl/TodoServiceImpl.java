package com.spring.featuresgradle.services.impl;

import com.spring.featuresgradle.documents.Todo;
import com.spring.featuresgradle.services.TodoService;
import org.bson.types.ObjectId;
import org.springframework.stereotype.Service;

import java.util.Arrays;

@Service
public class TodoServiceImpl implements TodoService {

    @Override
    public Iterable listAll() {
        return Arrays.asList();
    }

    @Override
    public Todo getById(ObjectId id) {
        return new Todo();
    }

    @Override
    public Todo saveOrUpdate(Todo todo) {
//        todoRepository.save(todo);
        return todo;
    }
}
