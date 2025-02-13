package begins;

import java.util.Scanner;

public class Begin05 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print( " a = ");
        int a = scanner.nextInt();
        int v = a*a*a;
        int s = 6*a*a;
        System.out.println(" V = " + v );
        System.out.print(" S = " + s );
    }
}
