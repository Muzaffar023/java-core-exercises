package switchcases;

import java.util.Scanner;

public class case07 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print(" son: ");
        double a = scanner.nextInt();
        System.out.println( " 1-kg , 2-mg , 3-gramm , 4-t , 5-sr " );
        System.out.print( " birligi: " );
        int s = scanner.nextInt();
        switch ( s )
        {
            case 1 -> System.out.println( a + "kg = " + a + "kg " );
            case 2 -> System.out.println( a + "mg = " + a/1000000 + "kg " );
            case 3 -> System.out.println( a + "gramm = " + a/1000 + "kg " );
            case 4 -> System.out.println( a + "t = " + a*1000 + "kg " );
            case 5 -> System.out.println( a + "sr = " + a*100 + "kg " );
        }
    }
}
