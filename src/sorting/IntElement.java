package sorting;
/**
 * Class IntElement implementing
 * @see IElement
 * @author Magda Ciężka
 */
public class IntElement implements IElement {
    /** Name of element*/
    String name;
    /** Value of element*/
    public int value;

    /**
     * Return name of element
     * @return name
     */
    @Override
    public String getName() {
        return this.name;
    }

    /**
     * Return value of element
     * @return value
     */
    @Override
    public float getValue() {
        return this.value;
    }

    /**
     * Constructor
     * @param name - name of element
     * @param value - value of element
     */
    public IntElement(String name,int value){
        this.name=name;
        this.value=value;
    }
}
