package org.example.ingli;

import org.example.ingli.services.AiService;
import org.example.ingli.services.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.stereotype.Component;

@Component
public class Application {

    @Autowired
    UserService userService;

    @Autowired
    AiService aiService;


    public static void main(String[] args) {

        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext("org.example.ingli");

        context.getBean(Application.class).process();
    }


    public void process(){
        userService.newPost();
        aiService.newPost();
    }
}
