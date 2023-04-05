package Java_23_04_05;

public class Ex07_09 {
    public static void main(String[] args) {
        int hap = 0;
        int i;

        for(i = 1; i < 101; i++){
            hap += i;

            if(hap >= 1000){
                break;
            }
        }

        System.out.printf("1~100의 합에서 최초로 1000이 넘는 위치는? : %d\n" ,i);
        System.out.printf("hap = %d",hap);
    }
}
