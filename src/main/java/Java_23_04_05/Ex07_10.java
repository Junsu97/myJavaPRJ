package Java_23_04_05;

public class Ex07_10 {
    public static void main(String[] args) {
        int hap = 0;
        int i;


        for(i = 1; i < 101; i++){
            if(i % 3 == 0){
                continue;
            }
            hap += i;

//            if(!(i % 3 == 0)){
//                hap += i;
//            }
        }

        System.out.printf("1~100까지의 합(3의배수 제외) : %d\n",hap);
    }
}
