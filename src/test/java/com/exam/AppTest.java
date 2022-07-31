package com.exam;

import org.junit.jupiter.api.Test;

import java.io.ByteArrayOutputStream;
import java.util.Scanner;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class AppTest {
    @Test
    public void NotKeyboard_YesString_inScanner() {
        Scanner sc = TestUtil.genScanner("안녕");

        String cmd = sc.nextLine().trim();
        assertEquals("안녕", cmd);
    }
    @Test
    public void Print_NotMonitor_YesString() {
        // ByteArrayOutputStream이 있는 상황엔 모니터의 문자열이 안에 output에 저장된다.
        ByteArrayOutputStream output = TestUtil.setOutToByteArray();
        System.out.print("안녕");
        String rs = output.toString();
        TestUtil.clearSetOutToByteArray(output);

        assertEquals("안녕", rs);
    }

    @Test
    public void titleCmdTest(){
        Scanner sc = TestUtil.genScanner("exit");
        ByteArrayOutputStream output = TestUtil.setOutToByteArray();

        new App(sc).run();

        String rs = output.toString();
        TestUtil.clearSetOutToByteArray(output);

        assertTrue(rs.contains("== 명언 SSG =="));
        assertTrue(rs.contains("명령)"));
    }

    @Test
    public void registerTest(){
        Scanner sc = TestUtil.genScanner("""
                register
                내 죽음을 적에게 알리지마라
                이순신
                exit
                """);
        ByteArrayOutputStream output = TestUtil.setOutToByteArray();

        new App(sc).run();

        String rs = output.toString();
        TestUtil.clearSetOutToByteArray(output);

        assertTrue(rs.contains("wiseSaying: "));
        assertTrue(rs.contains("author: "));
    }
}
