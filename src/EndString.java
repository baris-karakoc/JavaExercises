public class EndString {
    public static void main(String[] args) {
        {
            String str1 = "Java Egzersizleri";
            String str2 = "Java Egzersizler";

            String endStr = "leri";
    
            boolean ends1 = str1.endsWith(endStr);
            boolean ends2 = str2.endsWith(endStr);
    
            System.out.println(str1 + " ends with " + endStr + " ? " + ends1);
            System.out.println(str2 + " ends with " + endStr + " ? " + ends2);
        }
    }
}
