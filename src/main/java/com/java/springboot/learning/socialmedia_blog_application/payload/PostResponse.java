package com.java.springboot.learning.socialmedia_blog_application.payload;

import com.java.springboot.learning.socialmedia_blog_application.dto.PostDto;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;
@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class PostResponse {

    private List<PostDto> content;
    private int pageNo;
    private int pageSize;
    private int  totalPages;
    private long totalElements;
    private boolean isLastPage;
}
