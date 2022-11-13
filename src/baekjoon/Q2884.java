package baekjoon;

import java.util.Scanner;

public class Q2884 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int h, m;
        h = scanner.nextInt();
        m = scanner.nextInt();

        if (m < 45) {
            if (h < 1) {
                System.out.println((h - 1 + 24) + " " + (m + 15));

            } else {

                System.out.println(h - 1 + " " + (m + 15));
            }
        } else {
            System.out.println(h + " " + (m + 15 - 60));
        }
    }
}

