package integers;

import java.util.Scanner;

public class Integer25 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println( " 1-yanvar payshanba kuniga to'g'ri keladi " );
        System.out.print( " K = " );
        int k = scanner.nextInt();

        int q = (k+4-1)%7 ;

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

        /// 1 - yanvar ==> payshanba

        /// 2 - juma
        /// 3 - shanba
        /// 4 - yakshanba
        /// 5 - dushanba
        /// 6 - seshanba
        /// 7 - chorshanba




    }
}
