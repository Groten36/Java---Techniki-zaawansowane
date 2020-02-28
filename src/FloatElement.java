public class FloatElement implements IElement<Float> {
    String name;
    float value;
    @Override
    public String getName() {
        return this.name;
    }

    @Override
    public Float getValue() {
        return this.value;
    }
}
