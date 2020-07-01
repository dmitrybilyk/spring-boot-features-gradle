package com.spring.featuresgradle.repositories;

import com.spring.featuresgradle.documents.Todo;
import org.springframework.data.repository.CrudRepository;

public interface TodoRepository extends CrudRepository<Todo, String> {
}
