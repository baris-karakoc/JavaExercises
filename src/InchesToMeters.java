import java.util.Scanner;

public class InchesToMeters {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Lütfen çevirmek istediğiniz inç değerini giriniz: ");
        Double inch = input.nextDouble();

        double meter =  (inch * 0.0254);
        System.out.println(inch + " inç değeri " + meter + " metre değerine eşittir.");
    }
}
