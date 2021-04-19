package org.example.ingli.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class AiService {

    @Autowired
    private BlogService blogService;

    public void newPost() {
        blogService.pushArticle("Umela Intelegence", "Super Article");
    }

}
