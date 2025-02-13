package begins;

import java.util.Scanner;

public class Begin08 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print(" a = ");
        double a = scanner.nextInt();
        System.out.print(" b = ");
        double b = scanner.nextInt();

        double res = (a+b)/2;

        System.out.println(" O'rta arifmetigi: " + res );
    }
}
