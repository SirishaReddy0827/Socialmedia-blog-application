package com.java.springboot.learning.socialmedia_blog_application.service;

import com.java.springboot.learning.socialmedia_blog_application.dto.CommentDto;

import java.util.List;

public interface CommentService  {

    CommentDto createComment(long postId, CommentDto commentDto);

    List<CommentDto> getAllCommentsByPostId(long postId);

    CommentDto getCommentByPostIdAndCommentId(long postId, long commentId);

    CommentDto updateCommentByPostIdAndCommentId(long postId, long commentId, CommentDto commentDto);

    String deleteCommentByPostIdAndCommentId(long postId ,long commentId);
}
