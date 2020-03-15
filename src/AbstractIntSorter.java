import java.util.List;

/**
 * Abstract class AbstractIntSorter
 */
public abstract class AbstractIntSorter {
    /** Name of algorithm*/
    String description;
    /**Stability of algorithm*/
    boolean stable;
    /**if algorithm is in-situ*/
    boolean inSitu;

    /**
     * Return if sorting algorithm is InSitu
     * @return inSitu
     */
    boolean isInSitu(){
        return inSitu;
    }

    /**
     * Return if sorting algorithm is stable
     * @return stable
     */
    boolean isStable(){
        return stable;
    }

    /**
     * Return name of algorithm
     * @return description
     */
    String description(){
        return description;
    }

    /**
     * Abstract method implementing sorting integer numbers
     * @param list
     * @return sorted list
     */
    abstract List<IntElement> solve(List<IntElement> list);
}
