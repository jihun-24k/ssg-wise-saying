package com.exam;

import java.util.ArrayList;
import java.util.List;

public class PostRepository {
    private long lastId;
    private List<PostDto> posts;

    public PostRepository(){
        lastId = 0;
        posts = new ArrayList<>();
    }

    public PostDto write(String ws, String author) {
        lastId++;
        PostDto newPost = new PostDto(lastId, ws,author);
        posts.add(newPost);
        return newPost;
    }
}
