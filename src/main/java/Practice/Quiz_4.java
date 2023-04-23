package Practice;

import java.util.Scanner;

public class Quiz_4 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int x = in.nextInt();

        if(x % 3 == 0 && x % 5 == 0){
            System.out.println("3의 배수와 5의 배수를 둘다 만족합니다.");
        } else if (x%3==0) {
            System.out.println("3의 배수입니다.");
        } else if (x%5==0) {
            System.out.println("5의 배수입니다.");
        }
    }
}
