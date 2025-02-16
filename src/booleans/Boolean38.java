package booleans;

import java.util.Scanner;

public class Boolean38 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print(" x1 = ");
        int x1 = scanner.nextInt();
        System.out.print(" y1 = ");
        int y1 = scanner.nextInt();
        System.out.print(" x2 = ");
        int x2 = scanner.nextInt();
        System.out.print(" y2 = ");
        int y2 = scanner.nextInt();

        boolean res = Math.abs(x2 - x1) == Math.abs(y2 - y1);

        if ( res )
        {
            System.out.print( " Fil harakatlana oladi :)" );
        }
        else
        {
            System.out.print( " Fil harakatlana oladi :)" );
        }
    }
}
