package switchcases;

import java.util.Scanner;

public class case04 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print( " son " );
        int son = scanner.nextInt();

        if ( 13 > son && son > 0 )
        {
            switch ( son )
            {
                case 1 , 3 , 5 , 7 , 8 , 10 , 12 -> System.out.println( son + "-oy 31 kunlik " );
                case 4 , 6 , 9 , 11 -> System.out.println( son + "-oy 30 kunlik " );
                case 2 -> System.out.println( son + "-oy 28(29) kunlik ");
            }
        }
        else System.out.println( " error " );

    }
}
