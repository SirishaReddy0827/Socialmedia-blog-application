package com.java.springboot.learning.socialmedia_blog_application.dto;

import lombok.Data;

@Data
public class CommentDto {

    private long id;
    private String userName;
    private String email;
    private String body;
}
