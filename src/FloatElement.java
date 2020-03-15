/**
 * Class FloatElement implementing interface @see IElement
 */
public class FloatElement implements IElement {
    /** Name of element*/
    String name;
    /** Value of element*/
    float value;

    /**
     * Constructor of object FloatElement
     * @param name name of element
     * @param value value of element
     */
    public FloatElement(String name, int value) {
        this.name=name;
        this.value=value;
    }

    /**
     * Return name of element
     * @return name name of element
     */
    @Override
    public String getName() {
        return this.name;
    }

    /**
     * Return value of element
     * @return value value of element
     */
    @Override
    public float getValue() {
        return this.value;
    }
}
