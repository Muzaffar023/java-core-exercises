package ifs;

import java.util.Scanner;

public class if22 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println(" Kiritilgan koordinataning choragini aniqlab beradi ");

        System.out.print( " x1 = ");
        int x1 = scanner.nextInt();

        System.out.print( " y1 = ");
        int y1 = scanner.nextInt();

        if ( x1 > 0 && y1 > 0 )
        {
            System.out.print( " 1-chorak ");
        }
        else if ( x1 < 0 && y1 > 0 )
        {
            System.out.print(" 2 - chorak ");
        }
        else if ( x1 < 0 && y1 < 0 )
        {
            System.out.print(" 3 - chorak ");
        }
        else if ( x1 > 0 && y1 < 0 )
        {
            System.out.print(" 4 - chorak ");
        }
        else
        {
            System.out.print(" error ");
        }
    }
}
