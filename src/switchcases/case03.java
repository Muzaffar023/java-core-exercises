package switchcases;

import java.util.Scanner;

public class case03 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print(" son: ");
        int son = scanner.nextInt();

        if ( son < 13 && son >0 )
        {
            switch ( son )
            {
                case 1 , 2 , 12 -> System.out.print( son + "-oy Qish " );
                case 3 , 4 , 5 -> System.out.print( son + "-oy Bahor " );
                case 6 , 7 , 8 -> System.out.print( son + "-oy Yoz " );
                case 9 , 10 , 11 -> System.out.print( son + "-oy Kuz " );
            }
        }
        else System.out.print( "error " );

    }
}
