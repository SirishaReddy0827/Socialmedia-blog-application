package com.java.springboot.learning.socialmedia_blog_application.controller;

import com.java.springboot.learning.socialmedia_blog_application.dto.CommentDto;
import com.java.springboot.learning.socialmedia_blog_application.service.CommentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/v1/api")
public class CommentController {


    @Autowired
    private CommentService commentService;

    // POST /v1/api/posts/{postId}/comments
    @PostMapping("/posts/{postId}/comments")
    public ResponseEntity<CommentDto> createComment(@PathVariable long postId, @RequestBody CommentDto commentDto) {
        CommentDto savedCommentDto = commentService.createComment(postId, commentDto);
        return new ResponseEntity<>(savedCommentDto, HttpStatus.CREATED);
    }

    //GET /v1/api/posts/{postId}/comments
    @GetMapping("/posts/{postId}/comments")
    public ResponseEntity<List<CommentDto>> fetchAllCommentsByPostId(@PathVariable long postId) {
        List<CommentDto> commentDtoList = commentService.getAllCommentsByPostId(postId);
        return new ResponseEntity<>(commentDtoList, HttpStatus.OK);
    }

    //GET /v1/api/posts/{postId}/comments/{commentId}
    @GetMapping("/posts/{postId}/comments/{commentId}")
    public ResponseEntity<CommentDto> fetchCommentByPostIdAndCommentId(@PathVariable long postId, @PathVariable long commentId) {
        CommentDto commentDto = commentService.getCommentByPostIdAndCommentId(postId, commentId);
        return new ResponseEntity<>(commentDto, HttpStatus.OK);
    }

    //PUT /v1/api/posts/{postId}/comments/{commentId}
    @PutMapping("/posts/{postId}/comments/{commentId}")
    public ResponseEntity<CommentDto> updateCommentByPostIdAndCommentId(@PathVariable long postId, @PathVariable long commentId, @RequestBody CommentDto commentDto) {
        CommentDto updatedCommentDto = commentService.updateCommentByPostIdAndCommentId(postId, commentId, commentDto);
        return new ResponseEntity<>(updatedCommentDto, HttpStatus.OK);
    }

    //Delete particular Comment by postId and commentId
    //DELETE /v1/api/posts/{postId}/comments/{commentId}

    @DeleteMapping("/posts/{postId}/comments/{commentId}")
    public ResponseEntity<String> deleteCommentByCommentIdAndPostId(@PathVariable long postId ,@PathVariable long commentId) {
        commentService.deleteCommentByPostIdAndCommentId( postId ,commentId);
        return new ResponseEntity<>("Deleted Successfully comment by postId::"+ postId, HttpStatus.OK);
    }



    // Delete all comments under particular post by PostId
    //DELETE /v1/api/posts/{postId}/comments

}
