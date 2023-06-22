package Quiz;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;


public class GimalQ2 {
    public static void main(String[] args){
        List<Integer> list = new ArrayList<>();
            list.add(5);
            list.add(3);
            list.add(6);
            list.add(1);
            list.add(2);
            list.add(4);
        // 오름차 정렬
        Collections.sort(list);

        list.forEach(s -> System.out.print(s));
    }

}
