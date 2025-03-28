package com.dydko.runnerzwebapp.repository;

import com.dydko.runnerzwebapp.model.Comment;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CommentRepository extends JpaRepository<Comment, Long> {
}
