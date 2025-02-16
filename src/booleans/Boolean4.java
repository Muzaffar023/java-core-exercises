package booleans;

import java.util.Scanner;

public class Boolean4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print( " A = ");
        int a = scanner.nextInt();
        System.out.print( " B = ");
        int b = scanner.nextInt();

        boolean res = ( a > 2 && b <= 3);

        System.out.println( res );
    }
}
