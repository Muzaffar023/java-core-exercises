package ifs;

import java.util.Scanner;
public class If29 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print( " son: " );
        int son = scanner.nextInt();

        if ( son > 0 )
        {
            if ( son % 2 == 0 ) System.out.println( " Musbat juft son. " );
            else System.out.println( " Musbat toq son. " );
        }
        else if ( son < 0 )
        {
            if ( son % 2 == 0 ) System.out.println( " Manfiy juft son. " );
            else System.out.println( " Manfiy toq son. " );
        }
        else System.out.println( " son nolga teng. " );
    }
}
