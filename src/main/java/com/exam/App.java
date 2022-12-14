package com.exam;

import java.util.Scanner;

public class App {
    private Scanner sc;
    private PostController postController;

    App(Scanner sc){
        this.sc = sc;
        postController = new PostController(sc);
    }

    public void run(){

        // title
        System.out.println("== WiseSaying SSG ==");

        outer:
        while (true){
            // cmd
            System.out.print("CMD) ");
            String cmd = sc.nextLine();
            switch (cmd){
                case "exit" -> { break outer;}
                case "register" -> postController.write();

            }
        }

    }

}
