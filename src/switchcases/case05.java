package switchcases;

import java.util.Scanner;

public class case05 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print( " a = " );
        int a = scanner.nextInt();
        System.out.print( " b = " );
        int b = scanner.nextInt();

        System.out.print("ishora (+, -, *, /) = ");
        char s = scanner.next().charAt(0);

        switch ( s )
        {
            case '+' -> System.out.println( " " + a + " + " + b + " = " + (a+b));
            case '-' -> System.out.println( " " + a + " + " + b + " = " + (a-b));
            case '/' ->
            {
                if (b != 0 )
                {
                    System.out.println(" " + a + " + " + b + " = " + (a / b));
                } else
                {
                    System.out.println(" error 0 (nol)ga bo'lish mumkun emas ");
                }
            }
            case '*' -> System.out.println( " " + a + " + " + b + " = " + (a*b));
            default -> System.out.println( " error " );
        }
    }
}
