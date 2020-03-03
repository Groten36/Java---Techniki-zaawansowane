import java.util.List;

public abstract class AbstractIntSorter {

    String description;
    boolean stable;
    boolean inSitu;

    boolean isInSitu(){
        return inSitu;
    }

    boolean isStable(){
        return stable;
    }

    String description(){
        return description;
    }

    abstract List<IntElement> solve(List<IntElement> list);
}
