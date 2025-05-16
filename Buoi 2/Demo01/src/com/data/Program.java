package com.data;

import java.util.Scanner;

public class Program {
    public static void main(String[] args) {
        System.out.println("Success");

        int moneyTcb = 120000;
        int moneyVcb = 230000;

        int total = moneyTcb + moneyVcb;
        System.out.println("Total: " + total);

        Scanner sc = new Scanner(System.in);
        System.out.println("Nhap ho ten:");
        String fullName = sc.nextLine();
        System.out.println("Ho ten vua nhap: " + fullName);

        //Nhập vào một số và in ra giá trị gấp 10 lần
        System.out.println("Bai 1");
        System.out.println("Nhap vao 1 so:");
        sc = new Scanner(System.in);
        int num1 = sc.nextInt();
        //System.out.println("num1");
        System.out.println("So gap 10 lan so vua nhập: ");
        System.out.println(num1*10);


        //chia lay du: %
        System.out.println("Chia lay du");
        int result2 = 10%4; //2
        int result3 = 100%9; //1
        int result4 = 4%9; //4
        System.out.println(result4);
    }
}
