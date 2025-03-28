package com.dydko.runnerzwebapp.service;

import com.dydko.runnerzwebapp.model.Post;
import com.dydko.runnerzwebapp.repository.PostRepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
@AllArgsConstructor
public class PostService {

    private final PostRepository postRepository;

    public List<Post> getPosts() {
        return postRepository
                .findAll();
    }


    public Optional<Post> getSinglePost(long id) {
        return postRepository
                .findById(id);
    }
}
