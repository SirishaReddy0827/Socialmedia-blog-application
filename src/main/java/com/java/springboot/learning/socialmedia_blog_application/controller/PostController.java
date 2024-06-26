package com.java.springboot.learning.socialmedia_blog_application.controller;

import com.java.springboot.learning.socialmedia_blog_application.dto.PostDto;
import com.java.springboot.learning.socialmedia_blog_application.service.PostService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.HttpStatusCode;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/v1/api/posts")
public class PostController {
    @Autowired
    private PostService postService;

    // GET/v1/api/posts
    @GetMapping
    public List<PostDto> getAllPosts(){

        return postService.getAllPosts();
    }
    // POST/v1/api/posts
    @PostMapping
    public ResponseEntity<PostDto> createPost(@RequestBody PostDto postDto) {
        PostDto savedPostDto = postService.createPost(postDto);
        return new ResponseEntity<>(savedPostDto, HttpStatus.CREATED);
    }
    //GET/v1/api/posts/{id}
    @GetMapping("/{id}")
    public ResponseEntity<PostDto> getPostById(@PathVariable long id) {
        PostDto postDto =  postService.getPostById(id);
        return new ResponseEntity<>(postDto, HttpStatus.OK);
    }

     //PUT/v1/api/posts/{id}
    @PutMapping("/{id}")
    public ResponseEntity<PostDto> updatePostById(@PathVariable  long id,@RequestBody PostDto postDto) {
        PostDto updatedPost = postService.updatePost(postDto, id);
        return ResponseEntity.ok(updatedPost);
    }



    //DELETE/v1/api/posts/{id}

    @DeleteMapping("/{id}")
    public ResponseEntity<String> deletePostById(@PathVariable long id) {
        postService.deletePostById(id);
        return new ResponseEntity<>("Deleted Successfully Post Resource::"+ id, HttpStatus.OK);
    }

}
