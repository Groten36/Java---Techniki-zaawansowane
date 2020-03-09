import java.util.List;

/**
 * Class InsertionSort implementing insertion sort algorithm and extending class AbstractFloatSorter
 * @see AbstractFloatSorter
 * @author Magda Ciężka 235083
 */
public class InsertionSort extends AbstractFloatSorter{
    /**
     * Constructor
     */
    public InsertionSort(){
        this.description="Insertion Sort";
        this.stable=true;
        this.inSitu=true;
    }
    @Override
    List<IElement> solve1(List<IElement> list) {
        IElement e;
        int j;
        for (int i =1;i<list.size();++i){
            e=list.get(i);
            j=i-1;
            while(j>=0 && list.get(j).getValue()>e.getValue()){
                list.set(j+1,list.get(j));
                j-=1;
            }
            list.set(j+1,e);

        }
        return list;
    }

    @Override
    List<IntElement> solve(List<IntElement> list) {
        return null;
    }
}
