import java.util.Scanner;

public class FahrenheitToCelcius {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);        
        
        while (true) {
            System.out.println("Fahrenheit to Celcius için 1 tuşuna basınız.");
            System.out.println("Celcius to Fahrenheit için 2 tuşuna basınız.");
            System.out.print("Cevabınız: ");
            int answer = input.nextInt();
            switch (answer) {
                case 1:
                    System.out.print("Lütfen çevirmek istediğin Fahrenheit derecesini giriniz: ");
                    double fahrenheit = input.nextDouble();
                    double celcius = ((5 * (fahrenheit - 32)) / 9);
                    System.out.println("Girdğiniz Fahrenheit derecesi " + celcius + " Celcius derecesine eşittir.");
                    break;
                case 2:
                    System.out.print("Lütfen çevirmek istediğiniz Celcius derecesini giriniz: ");
                    double celcius2 = input.nextDouble();
                    double fahrenheit2 = (((9 * celcius2) * (32 * 5)) / 5);
                    System.out.println("Girdğiniz Celcius derecesi " + fahrenheit2 + " Fahrenheit derecesine eşittir.");
                    break;
                default:
                    System.out.println("Lütfen doğru bir değer giriniz.");
                    continue;
            }
            System.out.println("Yeni bir değer girmek istiyorsanız 'e' tuşuna, programdan çıkış yapmak istiyorsanız 'q' tuşuna basabilirsiniz.");
            System.out.println("Seçiminiz: ");
            String choice = input.next();
            if(choice.equals("q")){
                break;
            }
        }
    }
}
