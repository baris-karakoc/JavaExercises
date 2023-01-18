import java.util.Scanner;

public class BodyMassIndex {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Kilounuzu giriniz (Örnek: 75): ");
        float kilo = input.nextFloat();

        System.out.print("Boyunuzu giriniz (Örnek: 1,85): ");
        float boy = input.nextFloat();

        float bmi = kilo /  (boy * boy);
        System.out.println("Vücut Kitle İndeksiniz " + bmi);

        if(bmi < 18) {
            System.out.println("İdeal kilonun altında");
        }
        else if(bmi < 25) {
            System.out.println("İdeal kiloda");
        }
        else if(bmi < 30) {
            System.out.println("İdeal kilonun üstünde");
        }
        else if(bmi < 40) {
            System.out.println("İdeal kilonun çok üstünde (obez)");
        }
        else {
            System.out.println("İdeal kilonun çok üstünde (morbid obez)");
        }
    }
}
