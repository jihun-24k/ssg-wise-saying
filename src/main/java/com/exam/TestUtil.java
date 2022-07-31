package com.exam;

import java.io.ByteArrayInputStream;
import java.io.InputStream;
import java.util.Scanner;

public class TestUtil {
    // Generate Scanner
    public static Scanner genScanner(String input) {
        // input 데이터를 바이트로
        InputStream in = new ByteArrayInputStream(input.getBytes());

        return new Scanner(in);
    }
}
