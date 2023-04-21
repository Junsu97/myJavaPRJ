package Practice;

import java.util.Scanner;

public class Quiz_2 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int line;

        do {
            System.out.println("홀수를 입력해 주세요");
            line = in.nextInt();
        }
        while(line % 2 == 0);

        int x = line * 2 - 1;

        for(int i = 0; i < line; i++){
            if(i < line /2 ){
                for(int j = 1; j <= line / 2 - i; j++){
                    System.out.print(" ");
                }
                for(int j = 0; j < i * 2 + 1; j++){
                    System.out.print("*");
                }
            }else {
                    for(int j = 0; j < i - (line / 2); j++){
                        System.out.print(" ");
                    }
                    for(int j = 1; j <= x - (2*i); j++){
                        System.out.print("*");
                    }
            }
            System.out.println();
        }
    }
}

