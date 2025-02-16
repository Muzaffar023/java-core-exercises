package ifs;

import java.util.Scanner;

public class If28 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print( " Yil: " );
        int yil = scanner.nextInt();

        if ( yil / 4 == 0 ) System.out.println( yil + "-yil kabisa yili 366 kun bor. " );
        else System.out.println( yil + "-yil 355 kundan iborat " );
    }
}
