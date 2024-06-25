package com.java.springboot.learning.socialmedia_blog_application.controller;

import com.java.springboot.learning.socialmedia_blog_application.dto.PostDto;
import com.java.springboot.learning.socialmedia_blog_application.service.PostService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/v1/api/posts")
public class PostController {
    @Autowired
    private PostService postService;

    // /v1/api/posts
    @GetMapping
    public List<PostDto> getAllPosts(){

        return postService.getAllPosts();
    }

}
