package ifs;

import java.util.Scanner;

public class If18 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println( " 3ta son kiriting hohlagan 2tasi teng bo'lsin " );
        System.out.print( " 1-son: " );
        int a = scanner.nextInt();
        System.out.print( " 2-son: " );
        int b = scanner.nextInt();
        System.out.print( " 3-son: " );
        int c = scanner.nextInt();

        if ( a == b && a == c ) System.out.println( " Barcha sonlar o'zaro teng. " );
        else if ( a == b ) System.out.println( " 3-son boshqacha. " );
        else if ( a == c ) System.out.println( " 2-son boshqacha. " );
        else if ( b == c ) System.out.println( " 1-son boshqacha " );
        else System.out.println( " Barcha sonlar turi xil. " );
    }
}
