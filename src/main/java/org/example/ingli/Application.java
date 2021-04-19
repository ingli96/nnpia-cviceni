package org.example.ingli;

public class Application implements BlogApp {

    UserService userService;
    AiService aiService;

    public Application(UserService userService, AiService aiService) {
        this.userService = userService;
        this.aiService = aiService;

    }

    public static void main(String[] args) {
        BlogApp application = DI.getBlogApp();
        application.process();
    }

    @Override
    public void process(){
        userService.newPost();
        aiService.newPost();
    }
}
