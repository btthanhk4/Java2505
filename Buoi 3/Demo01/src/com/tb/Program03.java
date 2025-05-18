package com.tb;

public class Program03 {
    public static void main(String[] args) {
        int sum = 0;
        for (int i = 0; i <= 100; i++) {
            if (i % 2 != 0) {
                sum += i;
            }
        }
        System.out.println("Tong cac so le tu 1 - 100: " + sum);
    }
}
