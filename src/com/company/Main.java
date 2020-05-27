package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	// write your code here
       System.out.print("Hello World! Enter your name: ");

        Scanner scanner = new Scanner(System.in);
        String name =scanner.nextLine();

        System.out.println("How old are you");
        System.out.println("Hello " + name + ". It's nice to you!");
        System.out.printf("Hello %s. ");



    }
}
