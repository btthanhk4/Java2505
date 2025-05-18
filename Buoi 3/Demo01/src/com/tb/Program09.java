package com.tb;

import java.util.Scanner;

public class Program09 {
    public static void main(String[] args) {
        //toan tu 3 ngoi
        Scanner sc = new Scanner(System.in);
        System.out.println("Hay nhap address: ");
        String address = sc.nextLine();

//        int maXe = 0;
//        if (address.equals("HN")) {
//            maXe = 29;
//        } else {
//            maXe = 0;
//        }
//        System.out.println(maXe);
        //neu address la HN thi maXe la 29
        int maXe = address.equals("HN") ? 29 : 0;
        System.out.println("Ma xe: " + maXe);
    }
}
