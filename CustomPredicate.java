import java.util.function.Predicate;

public class CustomPredicate implements Predicate<Object> {
    @Override
    public boolean test(Object o) {
        return false;
    }
}
