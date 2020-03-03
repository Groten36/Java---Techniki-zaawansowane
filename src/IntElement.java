public class IntElement implements IElement {
    String name;
    int value;
    @Override
    public String getName() {
        return this.name;
    }

    @Override
    public float getValue() {
        return this.value;
    }

    public IntElement(String name,int value){
        this.name=name;
        this.value=value;
    }
}
