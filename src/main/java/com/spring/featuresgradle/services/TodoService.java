package com.spring.featuresgradle.services;

import com.spring.featuresgradle.documents.Todo;

public interface TodoService {
    Iterable listAll();
    Todo getById(String id);
    Todo saveOrUpdate(Todo todo);
}
