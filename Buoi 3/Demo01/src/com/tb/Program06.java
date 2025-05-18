package com.tb;

public class Program06 {
    public static void main(String[] args) {
        //in ra cac so chan va chia het cho 3 tu 1 den 1000
        int number = 1;
        while (number <=1000) {
            if (number % 6 == 0) {
                System.out.println(number);
            }
            number ++;
        }
    }
}
