package A_supplementary_class;

import java.util.Arrays;

public class Sort {
    public static void main(String[] args) {

        /**선택정렬**/
        /**1회전 할 때마다 작은 수를 앞에 고정**/
        int[] arr = {5,3,1,2,4};

        for(int i = 0; i < arr.length; i++){
            for(int j = i + 1; j < arr.length; j++){ // +1을 하는 이유는 자기와 비교할 필요가 없기 때문
                if(arr[i] > arr[j]){ // > 일 경우 오름차순  <일 경우 내림차순
                    int temp = arr[i];// 값 변경해야 하기에 임시 저장

                    arr[i] = arr[j]; // j를 i로
                    arr[j] = temp; // i를 j로
                }
            }
            System.out.println(Arrays.toString(arr));


        }

        for(int i = 0; i < arr.length; i++){
            System.out.print(arr[i]+ " ");
        }

    }
}
