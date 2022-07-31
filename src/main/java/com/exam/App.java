package com.exam;

import java.util.Scanner;

public class App {
    private Scanner sc;

    App(Scanner sc){
        this.sc = sc;
    }

    public void run(){

        // title
        System.out.println("== 명언 SSG ==");

        outer:
        while (true){
            // cmd
            System.out.print("명령) ");
            String cmd = sc.nextLine();
            switch (cmd){
                case "exit" -> { break outer;}
            }
        }

    }
}
