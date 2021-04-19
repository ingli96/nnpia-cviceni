package org.example.ingli;

public class BlogService {

    public BlogService() {
        System.out.println("Created");
    }

    public void pushArticle(String author, String title) {
        System.out.println("New article " + title + " by " + author);
    }
}
