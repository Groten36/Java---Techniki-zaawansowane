import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * Class PigeonholeSort implements methods sorting list of IntElements using pigeonhole sort algorithm.
 * Extends class AbstractIntSorter
 * @see IntElement
 * @see AbstractIntSorter
 * @author Magda Ciężka 235083
 */
public class PigeonholeSort extends AbstractIntSorter{
    /**Constructor*/
    public PigeonholeSort(){
        this.description="Pigeonhole Sort";
        this.stable=false;
        this.inSitu=false;
    }

    /**
     * Sorts list using pigeonhole algorithm
     * @param list list to sort
     * @return sorted list
     */
    @Override
    public List<IntElement> solve(List<IntElement> list) {
        int min= (int) list.get(0).getValue();
        int max=(int)list.get(0).getValue();
        for(IElement i : list){
            if(i.getValue()>max)
                max= (int) i.getValue();
            if(i.getValue()<min)
                min=(int)i.getValue();
        }

        int range=max-min+1;
        List<Integer> holes=new ArrayList<>(Collections.nCopies(list.size(),0));
        for(IntElement i : list)
            holes.set((int) (i.getValue()-min),holes.get((int) (i.getValue()-min))+1);

        int i=0;
        IntElement e;
        for (int j=0;j<range;j++){
            while(holes.get(j)>0){
                holes.set(j,holes.get(j)-1);
                e=new IntElement("element",j+min);
                list.set(i,e);
                i++;
            }
        }


        return list;
    }


}
