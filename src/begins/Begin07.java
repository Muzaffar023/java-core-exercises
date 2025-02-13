package begins;

import java.util.Scanner;

public class Begin07 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print(" R = ");
        int r = scanner.nextInt();
        double s = Math.PI * r * r ;
        double l = Math.PI * 2 * r ;
        System.out.println( " S = " + s );
        System.out.println( " L = " + l );
    }
}
