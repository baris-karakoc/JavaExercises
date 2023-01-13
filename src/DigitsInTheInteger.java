import java.util.Scanner;

public class DigitsInTheInteger {

    public static void main(String[] args) {

        try (Scanner input = new Scanner(System.in)) {
            while (true) {

                System.out.print("0 ile 1000 arasında bir tamsayı giriniz: ");

                int answerInt = input.nextInt();
                int enteredInt = answerInt;

                if (answerInt > 1000 || answerInt < 0) {
                    System.out.println("HATA! Lütfen 0 ile 1000 arasında bir tamsayı giriniz ");
                } else {
                    int sum = 0;
                    while (answerInt != 0) {
                        sum = (answerInt % 10) + sum;
                        answerInt /= 10;
                    }
                    System.out.println(enteredInt + " Sayısının basamaklar toplamı: " + sum);
                }
            }
        }
    }
}
