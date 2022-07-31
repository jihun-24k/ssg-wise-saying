package com.exam;

public class PostService {
    private PostRepository postRepository;

    PostService(){
        postRepository = new PostRepository();
    }
}
