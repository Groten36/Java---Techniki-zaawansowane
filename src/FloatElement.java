/**
 * Class FloatElement implementing interface @see IElement
 */
public class FloatElement implements IElement {
    /**
     * Name of element
     */
    String name;
    /**
     * Value of element
     */
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

    @Override
    public String getName() {
        return this.name;
    }

    @Override
    public float getValue() {
        return this.value;
    }
}
