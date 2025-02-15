package integers;

import java.util.Scanner;

public class Integer24 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print( " K = " );
        int k = scanner.nextInt();

        int q = k%7 ;

        switch ( q )
        {
            case 0:
                System.out.println(" Yakshanba "); break;
            case 1:
                System.out.println(" Dushanba"); break;
            case 2:
                System.out.println(" Seshanba "); break;
            case 3:
                System.out.println(" Chorshanba "); break;
            case 4:
                System.out.println(" Payshanba "); break;
            case 5:
                System.out.println(" Juma "); break;
            case 6:
                System.out.println(" Shanba "); break;
        }
    }
}
