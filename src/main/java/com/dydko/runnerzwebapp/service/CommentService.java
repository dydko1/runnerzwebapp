package com.dydko.runnerzwebapp.service;

import com.dydko.runnerzwebapp.model.Comment;
import com.dydko.runnerzwebapp.repository.CommentRepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
@AllArgsConstructor
public class CommentService {

    private final CommentRepository commentRepository;

    public List<Comment> getComments() {
        return commentRepository
                .findAll();
    }

    public Optional<Comment> getSingleComment(Long id) {
        return commentRepository
                .findById(id);
    }
}
