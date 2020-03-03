import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

public class CountingSort extends AbstractIntSorter{

    CountingSort(){
        this.description="Counting sort";
        this.stable=true;
        this.inSitu=false;
    }
    @Override
    List<IntElement> solve(List<IntElement> list) {
        int max=Integer.MAX_VALUE;
        for(IntElement i : list){
            if(i.getValue()<max)
                max= (int) i.getValue();
        }
        List<Integer> count=new ArrayList<>();
        for(int i=0;i<max+1;i++){
            count.add(0);
        }
        for (IntElement i :list){
            count.set((int)i.getValue(),(int)i.getValue()+1);
        }
        List<IntElement> out=new ArrayList<>(list.size());
        for(IntElement i:list){
            out.set(count.get((int) i.getValue()),i);
            count.set((int)i.getValue(),(int)i.getValue()+1);
        }

        return out;
    }
}
