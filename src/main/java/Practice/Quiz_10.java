package Practice;

import java.util.Arrays;
import java.util.Scanner;

public class Quiz_10 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int[] arr = new int[5];
        boolean run = true;
        int tmp;
        System.out.print("값을 5개 입력하세요 ==>");
        for(int i = 0; i < arr.length; i++){
            arr[i] = in.nextInt();
            while (run){
                run= false;
                for(int j = i; j < arr.length; j++){
                    if(arr[i] == arr[j]){
                        run = true;
                        System.out.println("중복된 값을 입력하였습니다. 다시 입력하세요 ==>");
                        arr[j] = in.nextInt();
                    }
                }
            }
        }

        for(int i = 0; i < arr.length; i++){
            for(int j = i+1; j < arr.length; j++){
                if(arr[i] > arr[j]){
                    tmp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = tmp;
                }
            }
        }

        System.out.println(Arrays.toString(arr));
    }
}
