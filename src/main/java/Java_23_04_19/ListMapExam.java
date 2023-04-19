package Java_23_04_19;

import java.util.*;

public class ListMapExam {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        
        //최종 저장되는 List 구조 2차원 배열 형태
        List<Map<String,String>> list = new ArrayList<>();
        
        // List 구조 안에 저장될 Map객체
        Map<String,String> map = null;

        for(int i = 0; i < 3; i++){
            System.out.print("이름 : ");
            String name = in.next();

            System.out.print("이메일 : " );
            String email = in.next();

            System.out.print("부서 : ");
            String dept = in.next();

            map = new HashMap<>();

            map.put("name",name);
            map.put("email",email);
            map.put("dept",dept);

            list.add(map);
            map = null; // 다 사용하면 메모리 비우기
        }
        int listSize = list.size();

        System.out.println("저장된 데이터 수 : " + listSize);


        // 일반적인 반복문 -- 1세대
        // 단점 : 반드시 반복의 횟수를 알고 있어야 사용 가능함
        System.out.println();
        System.out.println("1세대 반복문");

        for(int i = 0; i < listSize; i++){
            Map<String, String> rMap = list.get(i);

            System.out.println("name : " + rMap.get("name"));
            System.out.println("email : " + rMap.get("email"));
            System.out.println("dept : " + rMap.get("dept"));
        }

        //개선된 for문 -- 2세대
        //장점 : 반복횟수를 몰라도 됨
        System.out.println();
        System.out.println("2세대 반복문");
        for(Map<String, String> rMap : list){
            System.out.println("name : " + rMap.get("name"));
            System.out.println("email : " + rMap.get("email"));
            System.out.println("dept : " + rMap.get("dept"));
        }
        
        //개선된 for문 -- 3세대
        //장점 : 2세대보다 코딩해야 하는 라인이 감소, 람다식 적용, 자바 1.8부터 사용가능
        System.out.println();
        System.out.println("3세대 반복문");

        list.forEach(rMap -> {
            System.out.println("name : " + rMap.get("name"));
            System.out.println("email : " + rMap.get("email"));
            System.out.println("dept : " + rMap.get("dept"));
        });

        //개선된 for문 -- 4세대
        //장점 : 3세대에 비동기식 적용
        //단점 : 누가 먼저 처리 될지 알 수 없음, 따라서 모든 경우에 다 쓸 수 없음
        System.out.println();
        System.out.println("4세대 반복문");
        list.parallelStream().forEach(rMap -> {
            System.out.println("name : " + rMap.get("name"));
            System.out.println("email : " + rMap.get("email"));
            System.out.println("dept : " + rMap.get("dept"));
        });
        
        
        // while 반복문 -- 1.5세대 for문보다 처리속도 빠름
        //1.7버전까지 가장 많이 사용됨
        //단점 : 코드가 길어짐
        System.out.println();
        System.out.println("1.5세대 반복문");
        Iterator<Map<String,String>> it = list.iterator();

        while(it.hasNext()){
            Map<String, String> rMap = it.next();

            System.out.println("name : " + rMap.get("name"));
            System.out.println("email : " + rMap.get("email"));
            System.out.println("dept : " + rMap.get("dept"));

            rMap = null;
        }
    }
}
