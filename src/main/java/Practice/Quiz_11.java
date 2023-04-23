package Practice;

import java.util.Scanner;

public class Quiz_11 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int max = 0;
        int min = 0;
        int sum = 0;
        double avg;

        int[] arr = new int[5];

        for(int i = 0; i < arr.length; i++){
            arr[i] = in.nextInt();
            sum+=arr[i];
        }
        avg = (double)sum/arr.length;
        min = arr[0];
        max = arr[0];
        for(int i = 0; i < arr.length; i++){
            if(arr[i] > max){
                max = arr[i];
            } else if (arr[i] < min) {
                min = arr[i];
            }
        }

        System.out.println("최대값 =>" + max);
        System.out.println("최소값 =>" + min);
        System.out.println("평균값 =>" + avg);
    }
}
