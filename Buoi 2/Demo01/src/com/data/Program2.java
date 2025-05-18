package com.data;

import java.util.Scanner;

public class Program2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhap 1 so tu ban phim:");
        int num1 = sc.nextInt();
        if (num1 > 100) {
            System.out.println("Gia tri lon hon 100, OK");
        } else {
            System.out.println("Gia tri be hon 100");
        }
    }
}
