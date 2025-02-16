package booleans;

import java.util.Scanner;

public class Boolean24 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print(" A = ");
        int a = scanner.nextInt();
        System.out.print(" B = ");
        int b = scanner.nextInt();
        System.out.print(" C = ");
        int c = scanner.nextInt();

        boolean res = (b*b - 4*a*c >= 0);

        System.out.print( res );
    }
}
