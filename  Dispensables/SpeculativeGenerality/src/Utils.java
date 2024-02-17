import java.util.Collection;
import java.util.function.Function;
import java.util.function.Predicate;

public class Utils {
    public static <T> T merge(T first, T second) {
        // Some complex merging logic here
        return null; // Placeholder return value
    }

    public static <T> T filter(Collection<T> collection, Predicate<T> predicate) {
        // Some complex filtering logic here
        return null; // Placeholder return value
    }

    public static <T> T transform(T input, Function<T, T> transformer) {
        // Some complex transformation logic here
        return null; // Placeholder return value
    }

    public static void main(String[] args) {
        // Example usage of merge method
        String mergedString = Utils.merge("Hello", "World");
        System.out.println("Merged string: " + mergedString);
    }

}
