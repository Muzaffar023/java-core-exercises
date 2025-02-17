package switchcases;

import java.util.Scanner;

public class case02 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print(" son: ");
        int son = scanner.nextInt();

        if ( son < 6 && son > 0 )
        {
            switch ( son )
            {
                case 1 -> System.out.print( " Yomon " );
                case 2 -> System.out.print( " Qoniqarsiz " );
                case 3 -> System.out.print( " Qoniqarli " );
                case 4 -> System.out.print( " Yaxshi " );
                case 5 -> System.out.print( " A'lo " );
            }
        }
        else System.out.print( " xato " );

    }
}
