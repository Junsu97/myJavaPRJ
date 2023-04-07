package BandQuiz;

import java.util.Arrays;
import java.util.Scanner;

public class Sort04_06 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int[] arr = new int[5];
        int[] arr_2 = new int[5];
        boolean run = true;
        int tmp;

        System.out.print("값을 5개 입력하세요 ==>");

         for(int i = 0; i < arr.length; i++){

             arr[i] = in.nextInt(); // 값 입력
             while (run){
                 run = false;
                 for(int j = i; j < arr.length; j++){
                     if(arr[i] == arr[j]){ // 중복이 있다면 while문의 조건을 true로 돌려 갑을 재입력받도록 함
                         run = true;
                         System.out.println("중복된 값을 입력하였습니다 다시 입력하세요 ==>");
                         arr[j] = in.nextInt();

                     }
                 }
             }
        }
        Arrays.sort(arr); //sort 메서드로 오름차순 정렬

        // 배열의 주소값이 아닌 배열의 내용을 출력하기 위해 Arrays.toString 호출
        System.out.println("방법 1 ==> " + Arrays.toString(arr));

/********************************************************************************************/
        System.out.print("값을 5개 입력하세요 ==>");
        for(int i = 0; i < arr_2.length; i++){

            arr_2[i] = in.nextInt();
            while (run){
                run = false;
                for(int j = i; j < arr_2.length; j++){
                    if(arr_2[i] == arr_2[j]){
                        run = true;
                        System.out.println("중복된 값을 입력하였습니다 다시 입력하세요 ==>");
                        arr_2[j] = in.nextInt();

                    }
                }
            }
        }
        /**
         * 구구단 출력을 응용하여 for문 두개를 만들고,
         * 배열의 인덱스를 '큰 for문'과 '작은 for문'이 돌아가며 값을 검사한 후
         * 임시 변수를 통해 값 교환
         */
        for(int i = 0; i < arr_2.length; i++){
            for(int j = i + 1; j < arr_2.length; j++){
                if(arr_2[i] > arr_2[j]){
                    tmp = arr_2[i];
                    arr_2[i] = arr_2[j];
                    arr_2[j] = tmp;
                }
            }
        }

        System.out.println("방법 2 ==> " + Arrays.toString(arr_2));
    }
}
