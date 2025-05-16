package com.data;

import java.util.Scanner;

public class Program3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        //Nhap 1 so tu ban phim
        System.out.println("Nhap so cua ban:");
        int num1 = sc.nextInt();
        if (num1 > 0) {
            System.out.println("So nay lon hon 0");
        } else if (num1 < 0 ) {
            System.out.println("So nay nho hon 0");
        } else {
            System.out.println("Day la so 0");
        }
    }
}
