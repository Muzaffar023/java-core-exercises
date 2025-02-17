package switchcases;

import java.util.Scanner;

public class case01 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print(" son: ");
        int son = scanner.nextInt();

        if ( son < 8 && son >0 )
        {
            switch ( son )
            {
                case 1 -> System.out.print( " Dushanba " );
                case 2 -> System.out.print( " Seshanba " );
                case 3 -> System.out.print( " Chorshanba " );
                case 4 -> System.out.print( " Payshanba " );
                case 5 -> System.out.print( " Juma " );
                case 6 -> System.out.print( " Shanba " );
                case 7 -> System.out.print( " Yakshanba " );
            }
        }
        else System.out.print( "error bunday hafta kuni yo'q " );

    }
}
