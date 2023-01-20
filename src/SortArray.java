import java.util.Arrays;

public class SortArray {
    public static void main(String[] args) {
        int[] arrayNumbers = {
            17, 20, 18, 14, 21, 
            15, 24, 12, 13, 23, 
            22, 21, 11, 26};
            
    String[] arrayWords = {
            "Kalamar",
            "Java",
            "React",
            "White",
            "Gibi",
            "Besiktas",
            "Amiyane",
            "Continue"
        };        
    System.out.println("Original: "+Arrays.toString(arrayNumbers));
    Arrays.sort(arrayNumbers);
    System.out.println("Sorted: "+Arrays.toString(arrayNumbers));
    
    System.out.println("Original: "+Arrays.toString(arrayWords));
    Arrays.sort(arrayWords);
    System.out.println("Sorted: "+Arrays.toString(arrayWords));
    }
}
