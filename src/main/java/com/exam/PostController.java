package com.exam;

public class PostController {
    private PostService postService;

    PostController(){
        postService = new PostService();
    }
}
