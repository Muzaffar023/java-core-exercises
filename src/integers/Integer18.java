package integers;

import java.util.Scanner;

public class Integer18 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print( " N > 999 | N = " );
        int n = scanner.nextInt();

        int son = n%10000;

        son/=1000;

        System.out.println( " minglar xonasidagi raqam: " + son );
    }
}
