package booleans;

import java.util.Scanner;

public class Boolean36 {
    public static void main(String[] args) {
        Scanner  scanner = new Scanner(System.in);

        System.out.print(" x1 = ");
        int x1 = scanner.nextInt();
        System.out.print(" y1 = ");
        int y1 = scanner.nextInt();
        System.out.print(" x2 = ");
        int x2 = scanner.nextInt();
        System.out.print(" y2 = ");
        int y2 = scanner.nextInt();

        if ( x1 == x2 || y1 == y2 )
        {
            System.out.println(" Rux harakatlana oladi :) ");
        }
        else
        {
            System.out.print( " Rux harkatlana olmaydi :( ");
        }
    }
}
