package begins;

import java.util.Scanner;

public class Begin02 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("a = ");
        int butunSon = scanner.nextInt();

        int natija = butunSon*4;

        System.out.println("peremetri = 4*a = 4*" + butunSon + " = " + natija );
    }
}
