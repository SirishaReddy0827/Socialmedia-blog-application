package com.java.springboot.learning.socialmedia_blog_application.controller;

import com.java.springboot.learning.socialmedia_blog_application.payload.PostResponse;
import com.java.springboot.learning.socialmedia_blog_application.service.PostService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/v2/api/posts")
public class PostControllerV2 {

    @Autowired
    private PostService postService;

    @GetMapping
    public PostResponse getAllPosts(@RequestParam(value = "pageNo", defaultValue = "0", required = false) int pageNo,
                                    @RequestParam(value = "pageSize", defaultValue = "10", required = false) int pageSize,
                                    @RequestParam(value = "sortBy", defaultValue = "id", required = false) String sortBy,
                                    @RequestParam(value = "sortDirection", defaultValue = "ASC", required = false) String sortDirection) {
        return postService.getAllPosts(pageNo, pageSize,sortBy,sortDirection);
    }

}
