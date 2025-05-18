package com.tb;

public class Program04 {
    public static void main(String[] args) {
        int sum = 0;
        for (int i = 0; i <= 50; i++) {
            if (i % 2 == 0 && (i < 32 || i > 42)) {
                sum += i;
            }
        }
        System.out.println("Tong cac so chan tu 1 - 50, bo khoang 32-42: " + sum);
    }
}
