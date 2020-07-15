package com.spring.featuresgradle.services;

import com.spring.featuresgradle.documents.Todo;
import org.bson.types.ObjectId;

public interface TodoService {
    Iterable listAll();
    Todo getById(ObjectId id);
    Todo saveOrUpdate(Todo todo);
}
