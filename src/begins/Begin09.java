package begins;

import java.util.Scanner;

public class Begin09 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print( " a = " );
        double a = scanner.nextDouble();
        System.out.print( " b = " );
        double b = scanner.nextDouble();
        double c = a*b;
        double res = Math.sqrt( c );
        System.out.printf(" o'rta geometrigi: %.2f", res );
    }
}
