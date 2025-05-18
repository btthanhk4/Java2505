package com.tb;

public class Program11 {
    public static void main(String[] args) {
        //Ham xu ly chuoi
        String courseName = "Java core with Database";
        //length
        int len = courseName.length();
        System.out.println("Do dai chuoi: " + len);

        String result2 = courseName.substring(0, 2);
        System.out.println("result2: " + result2);

        String result3 = courseName.substring(3, 6);
        System.out.println("result3: " + result3);

        //Ham replace: thay the chuoi
        String result4 = courseName.replaceAll("a", "c");
        System.out.println("redult4: " + result4);

    }
}
