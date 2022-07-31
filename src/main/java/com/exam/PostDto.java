package com.exam;

public class PostDto {
    private long id;
    private String wiseSaying;
    private String author;

    public PostDto(long id, String wiseSaying, String author) {
        this.id = id;
        this.wiseSaying = wiseSaying;
        this.author = author;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getWiseSaying() {
        return wiseSaying;
    }

    public void setWiseSaying(String wiseSaying) {
        this.wiseSaying = wiseSaying;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    @Override
    public String toString() {
        return "PostDto{" +
                "id=" + id +
                ", wiseSaying='" + wiseSaying + '\'' +
                ", author='" + author + '\'' +
                '}';
    }
}
