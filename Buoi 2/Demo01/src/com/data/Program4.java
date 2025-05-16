package com.data;

import java.util.Scanner;

public class Program4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Nhap tuoi:");
        int num1 = sc.nextInt();
        if (num1 >= 6 && num1 <=7) {
            System.out.println("Du tuoi vao lop 1");
        } else if (num1 > 7){
            System.out.println("Qua tuoi");
        } else {
            System.out.println("Chua du tuoi");
        }
    }
}
