package booleans;

import java.util.Scanner;

public class Boolean35 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner( System.in);

        System.out.println(" shaxmat doskasi koordinatalarni kiriting " );

        System.out.print(" x1 = ");
        int x1 = scanner.nextInt();
        System.out.print(" y1 = ");
        int y1 = scanner.nextInt();
        System.out.print(" x2 = ");
        int x2 = scanner.nextInt();
        System.out.print(" y2 = ");
        int y2 = scanner.nextInt();

        boolean res ;
        res =( (x1+y1)%2 == 0 &&  ( x2+y2)%2 == 0)  ;

        System.out.print( " katakchalar rangi bir xil " + res );

    }
}
