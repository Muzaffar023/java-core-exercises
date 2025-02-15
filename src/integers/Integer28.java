package integers;

import java.util.Scanner;

public class Integer28 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print( " 1-yanvar qaysi kunga to'g'ri kelishini kirit N = " );
        int n = scanner.nextInt();

        System.out.print( " Yilning nechinchi kuni kerak? (1-365) K = " );
        int k = scanner.nextInt();

        int q = ((k + (n - 1)) % 7) + 1 ;

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
