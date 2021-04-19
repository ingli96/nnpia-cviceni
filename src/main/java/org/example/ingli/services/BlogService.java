package org.example.ingli.services;

import org.springframework.stereotype.Service;

@Service
public class BlogService {

    public BlogService() {
        System.out.println("Created");
    }

    public void pushArticle(String author, String title) {
        System.out.println("New article " + title + " by " + author);
    }
}
