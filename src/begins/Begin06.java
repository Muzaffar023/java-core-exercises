package begins;

import java.util.Scanner;

public class Begin06 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print( " a = ");
        int a = scanner.nextInt();
        System.out.print( " b = ");
        int b = scanner.nextInt();
        System.out.print( " c = ");
        int c = scanner.nextInt();
        int v = a*b*c;
        int s = 2*( a*b + a*c + b*c );
        System.out.println( " V = " + v );
        System.out.println( " S = " + s );
    }
}
