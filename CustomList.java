import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;

public class CustomList<T> extends ArrayList<T>  {
    private Predicate<T> predicate;
    public CustomList(Predicate<T> predicate){
        super();
        this.predicate = predicate;
    }

    @Override
    public boolean add(T element){
        if (predicate.test(element)){
            super.add(element);
            return true;
        }
        return false;
    }
}
