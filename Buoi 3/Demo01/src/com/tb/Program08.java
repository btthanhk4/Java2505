package com.tb;

import java.util.Scanner;

public class Program08 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Nhap gia tri menu: ");
        int menu = sc.nextInt();

        while (menu < 1 || menu > 4) {
            System.out.println("Gia tri menu chua dung");
            System.out.println("Nhap gia tri menu: ");
            menu = sc.nextInt();
        }
        switch (menu) {
            case 1:
                System.out.println("Login");
                break;
            case 2:
                System.out.println("Xem Product");
                break;
            case 3:
                System.out.println("Xem Profile");
                break;
            case 4:
                System.out.println("Logout");
                break;
            default:
                break;
        }
    }

}
