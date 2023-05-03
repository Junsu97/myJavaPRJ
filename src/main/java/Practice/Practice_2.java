package Practice;

import java.util.Scanner;

public class Practice_2 {
    public static void main(String[] args) {
        int[] arr = new int[5];
        int[] result;
        int tmp;
        Scanner in = new Scanner(System.in);
        for(int i = 0; i < arr.length; i++){
            arr[i] = in.nextInt();
        }

        for(int i = 0; i < arr.length; i++){
            for(int j = i; j < arr.length; j++){
                if(arr[i]>arr[j]){
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
        for(int i = 0; i < result.length; i++) {
            result[i] = arr[i];
            System.out.print(result[i] + " ");
        }

    }
}
