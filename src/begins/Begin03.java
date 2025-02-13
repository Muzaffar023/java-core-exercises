package begins;

import java.util.Scanner;

public class Begin03 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("a = ");
        int son = scanner.nextInt();
        int yuzasi = son*son;
        System.out.printf("Yuzasi = a^2 = " + yuzasi );
    }
}
