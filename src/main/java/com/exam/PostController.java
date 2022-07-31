package com.exam;

import java.util.Scanner;

public class PostController {
    Scanner sc;
    private PostService postService;

    PostController(Scanner sc){
        this.sc = sc;
        postService = new PostService();
    }

    public void write() {
        System.out.print("wiseSaying: ");
        String ws = sc.nextLine().trim();
        System.out.print("author: ");
        String author = sc.nextLine().trim();
        PostDto registedPost = postService.write(ws,author);
        System.out.printf("%d번 글이 등록되었습니다.\n",registedPost.getId());
    }
}
