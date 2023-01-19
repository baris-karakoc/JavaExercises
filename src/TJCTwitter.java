import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Stream;

public class TJCTwitter {
    public static void main(String[] args) {

        
        var list = List.of("turkey", "2", "java");
        Stream<String> infinite = Stream.generate(() -> "TJC");
        Predicate<String> pred = x -> Character.isLetter(x.charAt(0));

        System.out.println(list.stream().anyMatch(pred));
        System.out.println(list.stream().allMatch(pred));
        System.out.println(list.stream().noneMatch(pred));
        System.out.println(infinite.anyMatch(pred));
    }
}
