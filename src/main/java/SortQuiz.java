import java.util.Arrays;
import java.util.Scanner;

public class SortQuiz {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int[] arr = new int[5]; //길이가 5인 정수형 배열 선언
        int tmp; // 값교환을 위한 임시 변수
        for(int i = 0; i < arr.length; i++){
            arr[i] = in.nextInt(); //배열의 길이만큼 Scanner로 값 입력
        }
        
        for(int i = 0; i < arr.length; i++){
            for(int j = i + 1; j < arr.length; j++){
                if(arr[i] < arr[j]){ //배열의 i번째와 i+1번째를 비교해서  i+1번째가 더 크다면 값 교환
                    tmp = arr[i];   // 선택정렬 알고리즘
                    arr[i] = arr[j];
                    arr[j] = tmp;
                }
            }
        }
        System.out.println(Arrays.toString(arr));
    }
}
