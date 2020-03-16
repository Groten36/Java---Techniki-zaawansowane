package sorting;
import java.util.List;

/**
 * Abstract class AbstractClassSorter extending AbstractIntSorter.
 * Implements methods to sort list of FloatElements class elements
 * @see AbstractIntSorter
 */
public abstract class AbstractFloatSorter extends AbstractIntSorter{
     /**
      * Sorts list of FloatElement class elements
      * @param list - list to sort
      * @return sorted list
      */
     abstract List<IElement> solve1(List<IElement> list);
}
