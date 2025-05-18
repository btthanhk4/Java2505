package com.tb;

import java.util.Scanner;

public class Program10 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Hay nhap so a: ");
        int a = sc.nextInt();
        System.out.println("Hay nhap so b: ");
        int b = sc.nextInt();

        int soSanh = a > b ? 0 : 1;
        if (soSanh == 0){
            System.out.println(a + " la so lon hon");
        } else {
            System.out.println(b + " la so lon hon");
        }
    }
}
