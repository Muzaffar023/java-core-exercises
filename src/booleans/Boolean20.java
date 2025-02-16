package booleans;

import java.util.Scanner;

public class Boolean20 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print( " 3 xonali son: ");
        int a = scanner.nextInt();

        int x = a%10;
        int y = (a/10)%10;
        int z = (a/100)%10;

        boolean res = (x != y && y != z );

        System.out.print( res );
    }
}
