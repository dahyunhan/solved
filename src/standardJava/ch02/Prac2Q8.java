package standardJava.ch02;

public class Prac2Q8 {

    public static void main(String[] args) {
        int x = 1;
        int y = 2;
        int z = 3;

        int temp = x;
        int temp2 = y;

        y = z;
        x = temp2;
        z = temp;

        System.out.println(x);
        System.out.println(y);
        System.out.println(z);
    }
}
