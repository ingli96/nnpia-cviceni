package org.example.ingli;

public class Application {

    UserService userService;
    AiService aiService;

    public Application() {
        BlogService blogService = new BlogService();
        userService = new UserService(blogService);
        aiService = new AiService(blogService);

    }

    public static void main(String[] args) {
        Application application = new Application();
        application.process();
    }

    private void process(){
        userService.newPost();
        aiService.newPost();
    }
}
