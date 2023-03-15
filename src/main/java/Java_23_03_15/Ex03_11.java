package Java_23_03_15;

public class Ex03_11 {
    public static void main(String[] args) {
        float a = 0.1234567890123456789012345f;
        double b = 0.1234567890123456789012345;
        
        //초과할 수 있는 데이터를 초과하면 반올림 처리
        System.out.printf("%30.25f \n",a);
        System.out.printf("%30.25f \n",b);
    }
}
