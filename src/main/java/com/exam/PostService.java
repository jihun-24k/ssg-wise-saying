package com.exam;

public class PostService {
    private PostRepository postRepository;

    PostService(){
        postRepository = new PostRepository();
    }

    public PostDto write(String ws, String author) {
        return postRepository.write(ws,author);
    }
}
