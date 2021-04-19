package org.example.ingli;

public class DI {
    private static UserService userService;
    private static BlogService blogService;
    private static AiService aiService;

    public static BlogApp getBlogApp() {
        return new Application(getUserService(), gerAiService());
    }

    private static AiService gerAiService() {
        if (aiService == null) aiService = new AiService(getBlogService());
        return aiService;
    }

    private static UserService getUserService() {
        if (userService == null) userService = new UserService(getBlogService());
        return userService;
    }

    private static BlogService getBlogService() {
        if (blogService == null) blogService = new BlogService();
        return blogService;
    }

}
