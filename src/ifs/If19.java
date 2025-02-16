package ifs;

import java.util.Scanner;

public class If19 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println( " 4ta son kiriting hohlagan 3tasi teng bo'lsin " );
        System.out.print( " 1-son: " );
        int a = scanner.nextInt();
        System.out.print( " 2-son: " );
        int b = scanner.nextInt();
        System.out.print( " 3-son: " );
        int c = scanner.nextInt();
        System.out.print( " 4-son: " );
        int d = scanner.nextInt();

        if ( a == b && a == c && a == d ) System.out.println( " Barcha sonlar o'zaro teng. " );
        else if ( a == b && b == d ) System.out.println( " 3-son boshqacha. " );
        else if ( a == c && c == d ) System.out.println( " 2-son boshqacha. " );
        else if ( b == c && c == d ) System.out.println( " 1-son boshqacha " );
        else if ( a == b && a == c ) System.out.println( " 4-son boshqacha " );

        else if ( a == b ) System.out.println( " 3-son va 4-son boshqacha. " );
        else if ( a == c ) System.out.println( " 2-son va 4-son boshqacha. " );
        else if ( a == d ) System.out.println( " 2-son va 3-son boshqacha " );
        else if ( b == c ) System.out.println( " 1-son va 4-son boshqacha " );
        else if ( b == d ) System.out.println( " 1-son va 3-son boshqacha " );
        else if ( c == d ) System.out.println( " 1-son va 2-son boshqacha " );

        else System.out.println( " Barcha sonlar turi xil. " );
    }
}
