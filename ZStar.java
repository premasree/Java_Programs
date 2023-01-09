package com.oceanacademy;

import java.util.Scanner;

public class ZStar {
    public static void main(String[] args) {
        Scanner sc = new Scanner((System.in));
        int n = sc.nextInt();

        for (int i = 1; i <= n; i++) {
            for (int j = 1; j<=5; j++) {
                if((i ==1 ) || ((i+j)==(n+1)) || (i == 5)) {
                    System.out.print("x");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println(" ");
        }
    }

    public static class CrossDiganalTernary {
        public static void main(String[] args) {
            int x = 12;
            int y = 21;

            int a = x/10;
            int b = x%10;
            int c = y/10;
            int d = y%10;

            System.out.println (((a==d) && (b==c))? ((a+d) + " " + (b+c)) : ((a-d) + " " + (b-c)));

        }
    }
}
