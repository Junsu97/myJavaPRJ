package Java_23_03_22;

import java.util.Scanner;

/*
값을 입력받아 3의 배수인 경우만 "3의 배수입니다" 출력
*/
public class Quiz {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int a;
        System.out.println("값을 입력하세요 ");
        a = s.nextInt();
        boolean b = (a%3) == 0;

        while(true) {
            if(b){
                System.out.print("3의 배수입니다.");
                break;
            }else{
                System.out.println("3의 배수가 아닙니다.");
                System.out.println("값을 입력하세요 ");
                a = s.nextInt();
            }
        }
    }
}
