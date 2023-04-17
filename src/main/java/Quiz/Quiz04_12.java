package Quiz;

import java.util.Scanner;

public class Quiz04_12 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int[] arr = new int[5];
        int max;
        int min;
        int sum = 0;
        double avg;
        for(int i = 0; i < arr.length; i++){
            arr[i] = in.nextInt();
        }

        max = arr[0];
        min = arr[0];

        for(int i = 0; i < arr.length; i++){
            if(max <= arr[i]){
                max = arr[i];
            }
            if(min >= arr[i]){
                min = arr[i];
            }
            sum += arr[i];
        }
        avg = (double)sum / arr.length;
        System.out.printf("가장 큰 값: %d / 가장 작은 값: %d/ 평균 값: %f",max,min,avg);

    }
}
