import java.util.ArrayList;
import java.util.List;

/**
 * Class MergeSort implementing merge sort algorithm
 * @author Magda Ciężka 235083
 *
 */
public class MergeSort extends AbstractFloatSorter{
    /**
     * Constructor
     */
    public MergeSort(){
        this.description="Merge Sort";
        this.stable=true;
        this.inSitu=false;
    }

    /**
     * Method merging two sorted sublist into one
     * @param list - sorted list
     * @param s - beginning of first sublist
     * @param m - end of first sublist
     * @param e - end of second sublist
     */
    void merge(List<IElement> list,int s,int m, int e){
        int n1 = m - s +1;
        int n2 = e - m;

        List<IElement> left =new ArrayList<>();
        List<IElement> right =new ArrayList<>();

        for (int i=0; i<n1; ++i)
            left.add( list.get(s + i));
        for (int j=0; j<n2; ++j)
            right.add(list.get(m + 1 + j));

        int i = 0;
        int j = 0;
        int k = s;

        while (i < n1 && j < n2)
        {
            if (left.get(i).getValue() <= right.get(j).getValue())
            {
                list.set(k, left.get(i));
                i++;
            }
            else
            {
                list.set(k, right.get(j));
                j++;
            }
            k++;
        }

        while (i < n1)
        {
            list.set(k, left.get(i));
            i++;
            k++;
        }


        while (j < n2)
        {
            list.set(k, right.get(j));
            j++;
            k++;
        }
    }

    /**
     * Method sorting sublist. Using recursion.
     * @param list-sorted list
     * @param s - begginig of the sublist
     * @param e - end of sublist
     */
     void mergesort(List<IElement> list,int s,int e){
        int m;
        if(s<e){
            m=(e+s)/2;
            mergesort(list,s,m);
            mergesort(list,m+1,e);
            merge(list,s,m,e);
        }

    }


    @Override
    public List<IElement> solve1(List<IElement> list) {
        mergesort(list,0,list.size()-1);
        return list;
    }

    @Override
    List<IntElement> solve(List<IntElement> list) {
        return null;
    }
}
