package com.java.springboot.learning.socialmedia_blog_application.dto;

import lombok.Data;

@Data
public class PostDto {

    private Long id;
    private String title;
    private  String description;
    private String content;

}
