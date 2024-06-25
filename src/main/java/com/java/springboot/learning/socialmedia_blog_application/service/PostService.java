package com.java.springboot.learning.socialmedia_blog_application.service;

import com.java.springboot.learning.socialmedia_blog_application.dto.PostDto;

import java.util.List;

public interface PostService {


    List<PostDto> getAllPosts();

    PostDto getPostById(long id);
    PostDto createPost(PostDto postDto);
    PostDto updatePost(PostDto postDto , long postId);

    void deletePostById(long id);




}
