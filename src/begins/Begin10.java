package begins;

import java.util.Scanner;

public class Begin10 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println( " a != 0 && b != 0 ");
        System.out.print( " a = ");
        int a = scanner.nextInt();
        System.out.print( " b = ");
        int b = scanner.nextInt();
        System.out.println(" yig'indisi: " + (a+b) );
        System.out.println(" ko'paytmasi: " + a*b );
        System.out.println(" a^2 = " + Math.pow( a,2 ) );
        System.out.println(" b^2 = " + Math.pow( b,2 ) );
    }
}
