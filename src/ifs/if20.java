package ifs;

import java.util.Scanner;

public class if20 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print( " A = " );
        int a = scanner.nextInt();
        System.out.print( " B = " );
        int b = scanner.nextInt();
        System.out.print( " C = " );
        int c = scanner.nextInt();

        int sb = Math.abs(a-b);
        int sc = Math.abs(a-c);

        if ( sb > sc ) System.out.println( " A , Cga yaqinroq, orasida " + sc + "birlik bor. " );
        else if ( sb < sc ) System.out.println( " A , Bga yaqinroq, orasida " + sb + "birlik bor. "  );
        else System.out.println( " A , B va C o'rtasida yotibdi, orasida " + sb + "birlik bor. "  );
    }
}
