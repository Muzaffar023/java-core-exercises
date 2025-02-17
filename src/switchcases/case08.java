package switchcases;

import java.util.Scanner;

public class case08 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print( " kun: " );
        int kun = scanner.nextInt();

        System.out.print( " oy: " );
        int oy = scanner.nextInt();

        if ( kun > 0 && kun <= 31 && 13 > oy && oy > 0 )
        {
            switch ( oy )
            {
                case 1 -> System.out.println( kun + "-Yanvar " );
                case 3 -> System.out.println( kun + "-Mart " );
                case 5 -> System.out.println( kun + "-May " );
                case 7 -> System.out.println( kun + "-Iyul " );
                case 8 -> System.out.println( kun + "-August " );
                case 10 -> System.out.println( kun + "-Oktyabr " );
                case 12 -> System.out.println( kun + "-Dekabr " );
                case 2 ->
                {
                    if ( kun <= 29 )
                    {
                        System.out.println( kun + "-Fevral " );
                    }
                    else {
                        System.out.println( " error " );
                    }
                }
                case 4 ->{
                    if ( kun <=30 )
                    {
                        System.out.println( kun + "-Aprel " );
                    }
                }
                case 6 ->{
                    if ( kun <=30 )
                    {
                        System.out.println( kun + "-Iyun " );
                    }
                }
                case 9 ->{
                    if ( kun <=30 )
                    {
                        System.out.println( kun + "-Sentyabr " );
                    }
                }
                case 11 ->{
                    if ( kun <=30 )
                    {
                        System.out.println( kun + "-Noyabr " );
                    }
                }
            }
        }
        else
        {
            System.out.println( " error " );
        }
    }
}
