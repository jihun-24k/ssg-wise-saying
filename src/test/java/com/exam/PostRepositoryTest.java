package com.exam;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class PostRepositoryTest {
    private PostRepository postRepository;
    @BeforeEach
    void beforeEach(){
        postRepository = new PostRepository();
    }
    @Test
    public void writeTest(){
        PostDto rs1 = postRepository.write("학익진!","이순신");
        PostDto rs2 = postRepository.write("내 어린시절 우연히~","김종민");

        assertEquals(rs1.getId(), 1);
        assertEquals(rs1.getWiseSaying(), "학익진!");
        assertEquals(rs1.getAuthor(),"이순신");

        assertEquals(rs2.getId(), 2);
        assertEquals(rs2.getWiseSaying(), "내 어린시절 우연히~");
        assertEquals(rs2.getAuthor(),"김종민");
    }
}
