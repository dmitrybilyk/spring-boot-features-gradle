package com.spring.featuresgradle.documents;

import org.bson.types.ObjectId;
import org.springframework.stereotype.Component;

@Component
public class Todo {
    private ObjectId id;
    private String name;
    private Boolean completed;

//    public Todo(String name) {
//        this.name = name;
//        this.completed = Boolean.FALSE;
//    }

    public ObjectId getId() {
        return id;
    }

    public void setId(ObjectId id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Boolean getCompleted() {
        return completed;
    }

    public void setCompleted(Boolean completed) {
        this.completed = completed;
    }

    @Override
    public String toString() {
        return "Todo{" +
            "id=" + id +
            ", name='" + name + "'" +
            ", completed=" + completed +
            '}';
    }

    public void display() {
        System.out.println("Returned todo");
    }
}
