package com.java.springboot.learning.socialmedia_blog_application.service.impl;

import com.java.springboot.learning.socialmedia_blog_application.dto.PostDto;
import com.java.springboot.learning.socialmedia_blog_application.model.PostEntity;
import com.java.springboot.learning.socialmedia_blog_application.repository.PostRepository;
import com.java.springboot.learning.socialmedia_blog_application.service.PostService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class PostServiceImpl implements PostService {


    @Autowired
    private PostRepository postRepository;
    @Override
    public List<PostDto> getAllPosts() {

        List<PostEntity> postEntities = postRepository.findAll();
        if(postEntities != null){
           return postEntities.stream().map(postEntity -> mapEntityToDto(postEntity)).collect(Collectors.toList());


        }

        return  null;

    }



    @Override
    public PostDto getPostById(long id) {
        return null;
    }

    @Override
    public PostDto createPost(PostDto postDto) {
        return null;
    }

    @Override
    public PostDto updatePost(PostDto postDto, long postId) {
        return null;
    }

    @Override
    public void deletePostById(long id) {

    }


    private PostDto mapEntityToDto(PostEntity postEntity) {


        PostDto postDto = new PostDto();

        postDto.setId(postEntity.getId());
        postDto.setTitle(postEntity.getTitle());
        postDto.setDescription(postEntity.getDescription());
        postDto.setContent(postEntity.getContent());

        return postDto;
    }
}
