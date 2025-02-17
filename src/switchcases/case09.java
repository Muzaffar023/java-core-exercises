package switchcases;

import java.util.Scanner;

public class case09 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Kunni kiriting (D): ");
        int D = scanner.nextInt();
        System.out.print("Oyni kiriting (M): ");
        int M = scanner.nextInt();

        int kunlar; // Oydagi kunlar soni

        switch (M) {
            case 2:  // Fevral (kabisa emas)
                kunlar = 28;
                break;
            case 4:
            case 6:
            case 9:
            case 11: // 30 kunlik oylar
                kunlar = 30;
                break;
            case 1:
            case 3:
            case 5:
            case 7:
            case 8:
            case 10:
            case 12: // 31 kunlik oylar
                kunlar = 31;
                break;
            default:
                System.out.println("Xato! Oy 1 dan 12 gacha bo‘lishi kerak.");
                return;
        }

        // Keyingi kunni hisoblash
        if (D < kunlar) {
            D++; // Oddiy kunlar uchun
        } else if (D == kunlar) { // Agar oy tugasa
            D = 1;
            if (M == 12) M = 1; // Dekabr tugasa, yangi yil boshlanadi
            else M++;
        } else {
            System.out.println("Xato! Kiritilgan kun noto‘g‘ri.");
            return;
        }
        // Natijani chiqarish
        System.out.println("Keyingi sana: " + D + "-" + M);

        scanner.close(); // Scanner obyektini yopish
    }

}