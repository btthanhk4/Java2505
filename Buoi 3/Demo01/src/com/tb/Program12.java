package com.tb;

import java.util.Locale;

public class Program12 {
    public static void main(String[] args) {
        String chuoi = "chuong trinh";

        //in ra chu viet hoa
        String result1 = chuoi.toUpperCase();
        System.out.println("result1: " + result1);

        //in ra chuoi viet hoa chu dau
        String result2 = chuoi.toUpperCase();
        System.out.println("result2: " + result2);

        //thay the ki tu n va g bang a
        String result3 = chuoi.replaceAll("n", "a").replaceAll("g", "a");
        System.out.println("result3: " + result3);

    }
}
