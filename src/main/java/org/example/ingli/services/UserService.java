package org.example.ingli.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserService {

    @Autowired
    private BlogService blogService;

    public void newPost() {
        blogService.pushArticle("Oleksandr", "New Article");
    }

}
