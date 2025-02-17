package switchcases;

import java.util.Scanner;

public class case15 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print( " son: " );
        int son = scanner.nextInt();

        System.out.print( " turi: " );
        int tip = scanner.nextInt();

        if ( (son >=6 && son <= 14) && (tip > 0 && tip < 5) )
        {
            switch ( son )
            {
                case 6 -> System.out.print( " olti" );
                case 7 -> System.out.print( " yetti" );
                case 8 -> System.out.print( " sakkiz" );
                case 9 -> System.out.print( " to'qqiz" );
                case 10 -> System.out.print( " o'n" );
                case 11 -> System.out.print( " valet" );
                case 12 -> System.out.print( " dama" );
                case 13 -> System.out.print( " qirol" );
                case 14 -> System.out.print( " tuz" );
            }
            switch ( tip )
            {
                case 1 -> System.out.println( " g'isht " );
                case 2 -> System.out.println( " olma " );
                case 3 -> System.out.println( " chillak " );
                case 4 -> System.out.println( " qarg'a " );
            }
        }
        else {
            System.out.print(" error ");
        }
    }
}
