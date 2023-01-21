import java.util.Scanner;

public class CountVowels {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Cümleyi giriniz: ");
        String str = input.nextLine();

        System.out.println("Cümledeki Ünlülerin Sayısı: " + count_Vowels(str));
    }

    public static int count_Vowels(String str) {
        int count = 0;
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) == 'a' || str.charAt(i) == 'e' || str.charAt(i) == 'i'
                    || str.charAt(i) == 'o' || str.charAt(i) == 'u') {
                count++;
            }
        }
        return count;
    }
}
