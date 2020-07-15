package com.spring.featuresgradle;

import com.spring.featuresgradle.documents.Todo;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

@SpringBootApplication
public class FeaturesGradleApplication {

	public static void main(String[] args) {
		ConfigurableApplicationContext context = SpringApplication.run(FeaturesGradleApplication.class);
		Todo todo = context.getBean(Todo.class);
		todo.display();
//		SpringApplication.run(FeaturesGradleApplication.class, args);
	}

}
