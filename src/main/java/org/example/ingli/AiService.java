package org.example.ingli;

public class AiService {

    private BlogService blogService;

    public AiService(BlogService blogService) {
        this.blogService = blogService;
    }

    public void newPost() {


        blogService.pushArticle("Umela Intelegence", "Super Article");
    }

}
