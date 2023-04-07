package Java_23_04_05;

import java.util.Scanner;

public class Ex08_02 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int[] arr = new int[4];
        int hap;

        System.out.printf("1번째 숫자를 입력하세요 : ");
        arr[0] = in.nextInt();
        System.out.printf("2번째 숫자를 입력하세요 : ");
        arr[1] = in.nextInt();
        System.out.printf("3번째 숫자를 입력하세요 : ");
        arr[2] = in.nextInt();
        System.out.printf("4번째 숫자를 입력하세요 : ");
        arr[3] = in.nextInt();

        hap = arr[0] + arr[1] + arr[2] + arr[3];

        System.out.printf(" 합계 ==> %d \n",hap);

        hap = 0;

        for(int i = 0; i < arr.length; i++){
            System.out.printf("%d번째 숫자를 입력하세요 : ", i+1);
            arr[i] = in.nextInt();
            hap += arr[i];
        }
        System.out.printf("for문 이용 합계 ==> %d \n",hap);

    }
}
