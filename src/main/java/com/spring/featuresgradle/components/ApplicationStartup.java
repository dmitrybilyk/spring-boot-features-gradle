//package com.spring.featuresgradle.components;
//
//import org.slf4j.Logger;
//import com.spring.featuresgradle.documents.Todo;
//import com.spring.featuresgradle.repositories.TodoRepository;
//import org.slf4j.LoggerFactory;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.context.ApplicationEvent;
//import org.springframework.context.ApplicationListener;
//import org.springframework.stereotype.Component;
//
//@Component
//public class ApplicationStartup implements ApplicationListener {
//    private static final Logger logger = LoggerFactory.getLogger(ApplicationStartup.class);
//
//    @Autowired
//    private TodoRepository todoRepository;
//
//    private void seedData() {
//        Todo todo1 = todoRepository.save(new Todo("Pay car insurance"));
//        logger.info("Created ToDo " + todo1);
//
//        Todo todo2 = todoRepository.save(new Todo("Play more Skyrim"));
//        logger.info("Created ToDo " + todo2);
//    }
//
//    @Override
//    public void onApplicationEvent(ApplicationEvent event) {
//        seedData();
//    }
//}
