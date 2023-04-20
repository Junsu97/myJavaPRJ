package Java_23_04_19;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class ListExam {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();

        list.add("한준수");
        list.add("홍길동");
        list.add("임꺽정");
        list.add("고길동");

        int listSize = list.size();

        System.out.println("저장된 데이터 수 : " + listSize);
        
        list.remove(3);
        listSize = list.size();
        System.out.println("데이터 하나 삭제");
        for(int i = 0; i < listSize; i++){
            System.out.println(list.get(i));
        }

        //일반적인 반복문 --1세대
        //단점 : 반드시 반복 횟수를 알고 있어야 함
        System.out.println("1세대 반복문");
        for(int i = 0; i < listSize; i++){
            System.out.println("이름 : " + list.get(i));
        }

        //개선된 for문 -- 2세대
        //장점 : 반복횟수를 몰라도 됨
        System.out.println("2세대 반복문");
        for(String name : list){
            System.out.println("이름 : " + name);
        }
        
        //개선된 for문 -- 3세대
        //장점 : 2세대 보다 코딩해야 하는 라인이 감소함, 람다식 적용, 자바 1.8부터 사용가능
        System.out.println("3세대 반복문");
        list.forEach(name -> System.out.println("name : " + name));
        System.out.println("리스트 값 변경");
        list.set(0,"컴포즈 커피");
        list.set(1,"촉촉한 초코칩");
        list.set(2,"빅데이터과");
        list.forEach(name -> System.out.println("이름 : " + name));

        list.add("8315강의실");


        //개선된 for문 --4세대
        //장점: 3세대에 비동기식 처리 방법 적용
        //단점: 처리완료가 누가 먼저 될지 알 수가 없음. 따라서 모든 경우에 다 쓸 수 없음
        System.out.println("4세대 반복문");
        list.parallelStream().forEach(name -> System.out.println("name : " + name));

        //while 반복문 -- 1.5세대 for문 보다 처리속도가 빠름
        //자바 1.7까지 가장 많이 쓰던 반복문
        //단점 : 코드가 길어짐
        System.out.println("1.5세대");

        Iterator<String> it = list.iterator();
        while (it.hasNext()){
            String name = it.next();
            System.out.println("이름 : " + name);
        }
    }
}
