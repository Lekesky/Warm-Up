package com.company;

import java.sql.SQLOutput;

public class Main {

    public static void main(String[] args) {
        close10(8, 13);
        close10(13, 8);
        close10(13, 7);
    }

    static int close10(int a, int b) {
        int absA = Math.abs(10 - a);
        int absB = Math.abs(10 - b);

        if (absA < absB) {
            System.out.println(a);
            return a;
        }else if (absA > absB) {
            System.out.println(b);
            return b;
        }else
            System.out.println("0");
            return 0;
    }
}

