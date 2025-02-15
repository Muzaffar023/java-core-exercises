package integers;

import java.util.Scanner;

public class Integer29 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print(" a = ");
        int a = scanner.nextInt();
        System.out.print(" b = ");
        int b = scanner.nextInt();
        System.out.print(" c = ");
        int c = scanner.nextInt();

        int x = a/c;
        int y = b/c;

        int z =( a * b )-( x*y*c*c );

        System.out.print(" ko'pi bilan " + (x*y) + " ta kvadrat sig'adi," );
        System.out.print(" ortib qolgan joy: " + z );
    }
}
