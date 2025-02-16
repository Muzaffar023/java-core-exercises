package booleans;

import java.util.Scanner;

public class Boolean23 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print( " 3 xonali son: ");
        int a = scanner.nextInt();

        int x = a%10;
        int z = (a/100)%10;

        boolean res = ( x == z );

        System.out.print(res);
    }
}
