package com.data;

import java.util.Locale;
import java.util.Scanner;

public class Program8 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Nhap tai khoan:");
        String taiKhoan = sc.nextLine();

        System.out.println("Nhap mat khau:");
        String matKhau = sc.nextLine();

        if (taiKhoan.toLowerCase().equals("admin") && matKhau.equals("123456")) {
            System.out.println("Dang nhap thanh cong");
        } else {
            System.out.println("Dang nhap khong thanh cong");
        }
    }
}
