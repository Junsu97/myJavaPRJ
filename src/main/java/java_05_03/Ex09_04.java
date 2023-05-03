package java_05_03;

public class Ex09_04 {
    public static void main(String[] args) {
        String str = "Java를 공부하는 중, Java는 재밌어요.^^";

        System.out.println("문자열 ==> " + str);

        System.out.print("제일 처음 나오는 Java 위치 ==> ");
        System.out.println(str.indexOf("Java"));

        //lastIndexOf 는 뒤에서 부터 문자를 찾음
        System.out.print("마지막에 나오는 Java 위치 ==> ");
        System.out.println(str.lastIndexOf("Java"));

        // 찾고자 하는 문자열이 존재하지 않는다면 -1 을 리턴
        System.out.print("마지막에 나오는 Java 위치 ==> ");
        System.out.println(str.lastIndexOf("ㅓava"));
    }
}
