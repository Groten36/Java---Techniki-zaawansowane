public class IntElement implements IElement<Integer> {
    String name;
    int value;
    @Override
    public String getName() {
        return this.name;
    }

    @Override
    public Integer getValue() {
        return this.value;
    }
}
