public class FloatElement implements IElement {
    String name;
    float value;
    @Override
    public String getName() {
        return this.name;
    }

    @Override
    public float getValue() {
        return this.value;
    }
}
