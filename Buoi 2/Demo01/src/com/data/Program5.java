package com.data;

import java.util.Scanner;

public class Program5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Nhap diem toan");
        double toan = sc.nextDouble();
        System.out.println("Nhap diem ly");
        double ly = sc.nextDouble();
        System.out.println("Nhap diem hoa");
        double hoa = sc.nextDouble();

        System.out.println("Xep loai hoc luc:");
        double avr = (toan + ly + hoa)/3;
        if (avr >= 8) {
            System.out.println("Gioi");
        } else if (avr >= 6.5) {
            System.out.println("Kha");
        } else if (avr >= 5) {
            System.out.println("Trung binh");
        } else {
            System.out.println("Yeu");
        }
    }
}
