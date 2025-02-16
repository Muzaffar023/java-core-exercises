package ifs;

import java.util.Scanner;

public class If17 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print( " 1-son: " );
        int a = scanner.nextInt();
        System.out.print( " 2-son: " );
        int b = scanner.nextInt();
        System.out.print( " 3-son: " );
        int c = scanner.nextInt();

        if ( ( a > b && b > c ) || ( a < b && b < c ) )
        {
            System.out.println( " sonlar ikkilantirildi. " );
            System.out.println( " 1-son " + (a *= 2) );
            System.out.println( " 2-son " + (b *= 2) );
            System.out.println( " 3-son " + (c *= 2) );
        }
        else
        {
            System.out.println( " sonlarni ishorasi o'zgardi. " );
            System.out.println( " 1-son " + ( a *= -1 ) );
            System.out.println( " 2-son " + ( b *= -1 ) );
            System.out.println( " 3-son " + ( c *= -1 ) );
        }
    }
}
