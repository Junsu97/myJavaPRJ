package Practice;

import java.util.Scanner;

public class Quiz_3 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int x = in.nextInt();
        if(x % 3 == 0){
            System.out.println("3의 배수입니다.");
        }
    }
}
