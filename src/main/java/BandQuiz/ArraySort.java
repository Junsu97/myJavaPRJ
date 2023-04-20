package BandQuiz;

import java.util.Arrays;
import java.util.Scanner;

public class ArraySort {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int[] arr = new int[5]; //배열의 길이가 5인 정수형 배열 선언 및 
        int tmp; // 값교환을 위한 임시변수
        for(int i = 0; i < arr.length; i++){
            arr[i] = in.nextInt(); //배열의 크기만큼 Scanner로 값 입력
        }
        for(int i = 0; i < arr.length; i++){
            for(int j = i + 1; j < arr.length; j++){  //자기 자신과 비교할 필요가 없으므로 i+1과 비교
                if(arr[i] < arr[j]){ //값 비교후 i+1번째가 더 크다면 i보다 뒤에 있는 수가 더 큰 수 이기때문에 값을 교환해준다.
                    tmp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = tmp;
                }
            }
        }

        System.out.println(Arrays.toString(arr));
    }
}
