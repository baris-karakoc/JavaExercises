import java.util.Scanner;

public class NumberOfMinutes {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        double minutesInYear = 60 * 24 * 365;

        System.out.print("Çevirmek istediğiniz dakikayı giriniz:");

        double min = input.nextDouble();

        long years = (long) (min / minutesInYear);

        int days = (int) ((min / 60 / 24) % 365);

        System.out.println(min + " dakika yaklaşık olarak " + years + " yıl ve " + days + " gün eder.");
    }
}