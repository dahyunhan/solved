package baekjoon;

import java.util.Scanner;

public class Q2552 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int mh, mm, m, em;
        mh = scanner.nextInt();
        mm = scanner.nextInt();
        m = scanner.nextInt();
        em = m + mm;

        if (mm + m < 60) {
            System.out.println(mh + " " + em);
        } else {

            if (em % 60 == 0) {

                if (mh + (em / 60) > 23) {
                    System.out.println(mh + (em / 60) - 24 + " " + "0");

                } else {
                    System.out.println(mh + (em / 60) + " " + "0");
                }
            } else {

                if (mh + (em / 60) > 23) {
                    System.out.println(mh + (em / 60) - 24 + " " + (em % 60));

                } else {
                    System.out.println(mh + (em / 60) + " " + (em % 60));
                }
            }
        }
    }
}
