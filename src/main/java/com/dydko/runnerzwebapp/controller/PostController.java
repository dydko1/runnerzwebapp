package com.dydko.runnerzwebapp.controller;

import com.dydko.runnerzwebapp.model.Post;
import com.dydko.runnerzwebapp.service.PostService;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.Optional;

@RestController
@AllArgsConstructor
public class PostController {

    private PostService postService;

    @GetMapping("/posts")
    public List<Post> getPosts() {
        return postService
                .getPosts();
    }

    @GetMapping("/posts/{id}")
    public Optional<Post> getSimplePost(@PathVariable Long id) {
       return postService
               .getSinglePost(id);
    }
}
