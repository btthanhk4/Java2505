package com.data;

import java.util.Scanner;

public class Program2 {
    public static void main(String[] args) {
        System.out.println("Chuong trinh tinh thue thu nhap");
        Scanner sc = new Scanner(System.in);

        System.out.println("Nhap ho va ten nhan vien:");
        String fullName = sc.nextLine();

        System.out.println("Nhap luong nhan vien:");
        double salary = sc.nextDouble();

        System.out.println(fullName);
        System.out.println(salary);

        double tax = 0;
        double salaryRemain = 0;

        if (salary < 7000000) {
            tax = salary * 10 /100;
        } else if (salary >= 7000000 && salary <= 15000000) {
            tax = salary * 30 /100;
        } else {
            tax = salary *30 /100;
        }
        System.out.println("Tax: " + tax);

        salaryRemain = salary - tax;
        System.out.println("Salary remain: " + salaryRemain);
    }
}
