package switchcases;

import java.util.Scanner;

public class case06 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print(" son: ");
        double a = scanner.nextInt();
        System.out.println( " 1-dm , 2-km , 3-m , 4-mm , 5-sm " );
        System.out.print( " birligi: " );
        int s = scanner.nextInt();
        switch ( s )
        {
            case 1 -> System.out.println( a + "dm = " + a/10 + "m " );
            case 2 -> System.out.println( a + "km = " + a*1000 + "m " );
            case 3 -> System.out.println( a + "m = " + a + "m " );
            case 4 -> System.out.println( a + "mm = " + a/1000 + "m " );
            case 5 -> System.out.println( a + "sm = " + a/100 + "m " );
        }
    }
}
