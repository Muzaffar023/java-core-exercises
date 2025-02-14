package integers;

import java.util.Scanner;

public class Integer30 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println( " yil: " );
        int yil = scanner.nextInt();

        int asr = yil/100;
        int nom = yil%100;
        if ( nom < 20 )
        {
            System.out.println( asr + "asr boshi, " + yil + " yil. " );
        }
        else if ( nom > 80 )
        {
            System.out.println( asr + "asr oxiri, " + yil + " yil. " );
        }
        else
        {
            System.out.println( asr + "asr o'rtalari, " + yil + " yil. " );
        }
    }
}
