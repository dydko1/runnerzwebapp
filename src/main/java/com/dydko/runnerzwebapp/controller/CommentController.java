package com.dydko.runnerzwebapp.controller;

import com.dydko.runnerzwebapp.model.Comment;
import com.dydko.runnerzwebapp.service.CommentService;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.Optional;

@RestController
@AllArgsConstructor
public class CommentController {

    private final CommentService commentService;

    @GetMapping("/comments")
    public List<Comment> getComments() {
        return commentService
                .getComments();
    }

    @GetMapping("/comments/{id}")
    public Optional<Comment> getSingleComment(@PathVariable Long id) {
        return commentService
                .getSingleComment(id);
    }

}
