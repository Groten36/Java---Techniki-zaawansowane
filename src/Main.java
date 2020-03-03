import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {
	// write your code here
        CountingSort sort=new CountingSort();
        List<IntElement> list=new ArrayList<>();
        for(int i=0;i<10;i++){
            IntElement el=new IntElement("1",i);
            list.add(el);
        }

        List<IntElement> list1=sort.solve(list);

        for(IntElement i :list1){
            System.out.println(i.getValue());
        }
    }
}
