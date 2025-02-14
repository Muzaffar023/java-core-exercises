package begins;
import java.util.Scanner;

public class Begin03 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print(" a = ");
        int a = scanner.nextInt();
        System.out.print(" b = ");
        int b = scanner.nextInt();
        int p = (a+b)*2;
        int s = a*b;
        System.out.println(" p = " + p );
        System.out.println(" S = " + s );


    }
}
