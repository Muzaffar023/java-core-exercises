package booleans;

import java.util.Scanner;

public class Boolean34 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print(" x = ");
        int x = scanner.nextInt();
        System.out.print(" y = ");
        int y = scanner.nextInt();

        if ( (x + y)%2 == 0 )
        {
            System.out.print( " bu katakcha qora !" );
        }
        else
        {
            System.out.print( " bu katakcha oq !");
        }
    }
}
