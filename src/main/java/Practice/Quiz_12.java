package Practice;

import java.util.Scanner;

public class Quiz_12 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int[] arr = new int[5];
        int[] result;
        int tmp;
        boolean bool;

        for(int i = 0; i < arr.length; i++){
            arr[i] = in.nextInt();
        }

        for(int i = 0;  i< arr.length; i++){
            for(int j = i + 1; j < arr.length; j++){
                if(arr[i] > arr[j]){
                    tmp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = tmp;
                }
            }
        }

        int count = 0;
        for(int i = 0; i < arr.length; i++){
            if(i == 0 || arr[i] != arr[i-1]){
                arr[count++] = arr[i];
            }
        }
        result = new int[count];
        for(int i = 0; i < result.length; i++){
            result[i] = arr[i];
            System.out.println(result[i]);
        }
    }
}
