package com.data;

import java.util.Scanner;

public class Program7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);


        System.out.println("Nhap ho ten");
        String hoTen = sc.nextLine();

        System.out.println("Nhap tuoi");
        int tuoi = sc.nextInt();

        sc = new Scanner(System.in);
        System.out.println("Nhap dia chi");
        String diaChi = sc.nextLine();

        if (tuoi > 30 || diaChi.equals("Ha Noi")) {
            System.out.println("Du dieu kien");
        } else {
            System.out.println("Khong du dieu kien");
        }
    }
}
