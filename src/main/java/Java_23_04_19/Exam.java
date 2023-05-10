package Java_23_04_19;

import java.util.*;

public class Exam {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        List<Map<Integer, String>> list = new ArrayList<>();

        Map<Integer, String> map = null;

        for(int i = 0; i < 5; i++){
            System.out.println("데이터를 입력하세요");
            map = new HashMap<>();

            map.put(i, in.next());
            list.add(map);
            map = null;
        }

        for(int i = 0; i < list.size(); i++){
            Map<Integer, String> rMap = list.get(i);
            System.out.println(i + " : " + rMap.get(i));
        }
    }
}
