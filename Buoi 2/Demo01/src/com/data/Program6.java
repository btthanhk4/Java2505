package com.data;

import java.util.Scanner;

public class Program6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        //level 1 -> 5
        int level = 3;
        switch (level) {
            case 1:
                System.out.println("Level thap");
                break;
            case 2:
                System.out.println("Level ga");
                break;
            case 3:
                System.out.println("Level on");
                break;
            case 4:
                System.out.println("Level gioi");
                break;
            default:
                System.out.println("Master");
        }
    }
}
