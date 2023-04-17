package Quiz;

import java.util.Scanner;

public class Quiz_04_17 {
    public static void main(String[] args) {
        int[] arr = new int[5];
        int tmp; //정렬에서의 값 교환을 위한 임시변수
        int[] result;
        Scanner in = new Scanner(System.in);
        
        //반복문을 통해 배열의 크기만큼 Scanner로 값 입력
        for(int i = 0; i < arr.length; i++){
            arr[i] = in.nextInt();
        }
        
        //배열 오름차 정렬
        for(int i = 0; i < arr.length; i++){
            for(int j = i + 1; j < arr.length; j++){
                if(arr[i] > arr[j]){
                    tmp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = tmp;
                }
            }
        }
        int count = 0; //  result 배열의 크기를 재기 위한 카운트 변수
        for(int i = 0; i < arr.length; i++){//정렬을 해놓은 상태이기 때문에 for문 하나로 중복 검사가 가능
            if(i==0||arr[i] != arr[i-1]){ //0번째 인덱스일 경우는 비교할 필요가 없으니 arr에 바로 넣고 or 연산자로 중복되지 않은 경우만을 검사하여 배열에 값을 새로 넣음
                arr[count++] = arr[i];
            }
        }
        result = new int[count]; //위 for문에서 조건에 충족한 경우에만 k++을 시켰기 때문에 결과값을 가진 배열의 크기는 k가 된다.
        for(int i = 0; i < result.length; i++){
            result[i] = arr[i]; //for문을 통해 result배열의 크기만큼만 배열을 복사
            System.out.println(result[i]);
        }

    }
}
