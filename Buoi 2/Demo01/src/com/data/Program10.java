package com.data;

import java.util.Scanner;

public class Program10 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        tamGiac(sc);
    }

    public static void tamGiac(Scanner sc) {
        System.out.println("Nhap canh thu nhat");
        int canh1 = sc.nextInt();

        System.out.println("Nhap canh thu hai");
        int canh2 = sc.nextInt();

        System.out.println("Nhap canh thu ba");
        int canh3 = sc.nextInt();

        int chuVi = canh1 + canh2 + canh3;

        if (canh1+canh2 > canh3 && canh1+canh3>canh2 && canh2+canh3>canh1) {
            System.out.println("Chu vi tam giac la: " + chuVi);
        } else {
            System.out.println("Khong ton tai tam giac tren");
        }
    }
}
