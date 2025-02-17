package switchcases;

import java.util.Scanner;

public class case18 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println( " 0 < n < 1000 " );

        System.out.print( " n = " );
        int n = scanner.nextInt();

        int a = (n/100) % 10 ;
        int b = (n/10) % 10 ;
        int c = n % 10 ;

        switch ( a )
        {
            case 1 -> System.out.print( " bir yuz" );
            case 2 -> System.out.print( " ikki yuz" );
            case 3 -> System.out.print( " uch yuz" );
            case 4 -> System.out.print( " to'rt yuz" );
            case 5 -> System.out.print( " besh yuz" );
            case 6 -> System.out.print( " olti yuz" );
            case 7 -> System.out.print( " yetti yuz" );
            case 8 -> System.out.print( " sakkiz yuz" );
            case 9 -> System.out.print( " to'qqiz yuz" );
        }
        switch ( b )
        {
            case 1 -> System.out.print( " o'n" );
            case 2 -> System.out.print( " yigirma" );
            case 3 -> System.out.print( " o'ttiz" );
            case 4 -> System.out.print( " qirq ");
            case 5 -> System.out.print( " ellik" );
            case 6 -> System.out.print( " oltmish" );
            case 7 -> System.out.print( " yetmish" );
            case 8 -> System.out.print( " sakson" );
            case 9 -> System.out.print( " to'qson" );
        }
        switch ( c )
        {
            case 1 -> System.out.print( " bir" );
            case 2 -> System.out.print( " ikki" );
            case 3 -> System.out.print( " uch" );
            case 4 -> System.out.print( " to'rt" );
            case 5 -> System.out.print( " besh" );
            case 6 -> System.out.print( " olti" );
            case 7 -> System.out.print( " yetti" );
            case 8 -> System.out.print( " sakkiz" );
            case 9 -> System.out.print( " to'qqiz" );
        }

    }
}
