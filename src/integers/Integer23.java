package integers;

import java.util.Scanner;

public class Integer23 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print(" kun boshidan boshlab necha sekund o'tti: ");
        int n = scanner.nextInt();

        int soat = (n/60)/60 ;

        int daqiqa = n/60 - (soat*60);

        int sekund = n-((soat*60*60)+(daqiqa*60));

        System.out.println( " kun boshidan boshlab " + soat + "soat " + daqiqa + "daqiqa "+ sekund + " sekund o'tti. " );


    }
}
