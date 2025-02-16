package ifs;
import java.util.Scanner;

public class If30 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print(" son: ");
        int son = scanner.nextInt();
        if ( son > 1 && son < 1000 )
        {
            if ( son > 9 && son < 100 )
            {
                if ( son % 2 == 0 )  System.out.println(" ikki xonali juft son. ");
                else  System.out.println(" ikki xonali toq son. ");
            }
            else if ( son > 99 )
            {
                if ( son % 2 == 0  ) System.out.println(" uch xonali juft son. ");
                else System.out.println( " uch xonali toq son. " );
            }
        }
    }
}
