package org.example.ingli;

public class UserService {

    private BlogService blogService;

    public UserService(BlogService blogService) {
        this.blogService = blogService;
    }

    public void newPost() {


        blogService.pushArticle("Oleksandr", "New Article");
    }

}
