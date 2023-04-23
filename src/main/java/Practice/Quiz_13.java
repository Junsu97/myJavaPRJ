package Practice;

import java.util.Arrays;
import java.util.Scanner;

public class Quiz_13 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int[] arr = new int[5];
        int tmp;
        for(int i = 0; i < arr.length; i++){
            arr[i] = in.nextInt();
        }
        for(int i = 0; i < arr.length; i++){
            for(int j = i + 1; j < arr.length; j++){
                if(arr[i] < arr[j]){
                    tmp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = tmp;
                }
            }
        }

        System.out.println(Arrays.toString(arr));
    }
}
