package com.springboot.blog.payload;

import lombok.Data;

import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.Size;
import java.util.Set;

@Data
public class PostDto {

    private long id;
    //using validation dependency
    //spring-boot-starter-validation
    //title should not be null or empty
    //must add @Valid in PostController post api
    @NotEmpty
    @Size(min = 2, message = "Post title should have at least 2 characters")
    private String title;
    //description should not be null or empty
    @NotEmpty
    @Size(min = 10, message = "Post description should have at least 10 characters")
    private String description;
    @NotEmpty
    private String content;
    private Set<CommentDto> comments;

}
