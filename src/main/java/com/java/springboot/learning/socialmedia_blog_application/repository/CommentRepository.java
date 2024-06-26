package com.java.springboot.learning.socialmedia_blog_application.repository;

import com.java.springboot.learning.socialmedia_blog_application.model.CommentEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;
@Repository
public interface CommentRepository extends JpaRepository<CommentEntity, Long> {

    @Query(value = "SELECT * FROM comments WHERE post_id = ?1", nativeQuery = true)
    List<CommentEntity> findByPostId(long postId);
}
