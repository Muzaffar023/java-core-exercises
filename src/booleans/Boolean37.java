package booleans;

import java.util.Scanner;

public class Boolean37 {
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

        if ( ( x2 == x1 && ( y2 == y1-1 || y2 == y1+1 ) ) || ( x2 == x1+1 && ( y2 == y1-1 || y2 == y1 || y2 == y1+1 ) ) || ( x2 == x1-1 && ( y2 == y1-1 || y2 == y1 || y2 == y1+1  )) )
        {
            System.out.print(" Shoh harakatlana oladi ");
        }
        else
        {
            System.out.print(" Shoh harakatlana olmaydi ");
        }
    }
}
