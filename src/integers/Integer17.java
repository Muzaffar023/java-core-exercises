package integers;
import java.util.Scanner;

public class Integer17 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print(" birorta 3 xonali son kiriting:  ");
        int son = scanner.nextInt();

        int birlar = son%10;
        int onlar = (son/10)%10;
        int yuzlar = (son/100)%10;

        int newson = onlar+birlar*10+yuzlar*100 ;
        System.out.println( " 1liklar bn 10liklar almashtirildi: " + newson  );



    }
}
