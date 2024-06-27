package com.java.springboot.learning.socialmedia_blog_application.service;

import com.java.springboot.learning.socialmedia_blog_application.dto.PostDto;
import com.java.springboot.learning.socialmedia_blog_application.payload.PostResponse;

import java.util.List;

public interface PostService {


    List<PostDto> getAllPosts();
    PostResponse getAllPosts(int pageNo, int pageSize);

    PostResponse getAllPosts(int pageNo, int pageSize, String sortBy, String sortDirection);

    PostDto getPostById(long id);
    PostDto createPost(PostDto postDto);
    PostDto updatePost(PostDto postDto , long postId);

    void deletePostById(long id);




}
