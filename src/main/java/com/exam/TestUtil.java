package com.exam;

import java.io.*;
import java.util.Scanner;

public class TestUtil {
    // Generate Scanner
    public static Scanner genScanner(String input) {
        // input 데이터를 바이트로
        InputStream in = new ByteArrayInputStream(input.getBytes());

        return new Scanner(in);
    }

    public static ByteArrayOutputStream setOutToByteArray() {
        // System.out: 원래 default값이 console로 반환하는 PrintStream
        // System.setOut: PrintStream의 값을 바꿈
        final ByteArrayOutputStream output = new ByteArrayOutputStream();
        System.setOut(new PrintStream(output));
        return output;
    }

    public static void clearSetOutToByteArray(ByteArrayOutputStream output) {
        System.setOut(new PrintStream(new FileOutputStream(FileDescriptor.out)));
        try {
            output.close();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
