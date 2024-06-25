package com.java.springboot.learning.socialmedia_blog_application.repository;

import com.java.springboot.learning.socialmedia_blog_application.model.PostEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PostRepository extends JpaRepository<PostEntity ,Long> {
}
