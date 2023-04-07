package BandQuiz;

import java.util.Scanner;

/*
* 코딩 확인용 문제

예시1)

입력값 : 30
출력결과
"3의 배수와 5의 배수를 둘다 만족합니다."

예시2)

입력값 : 6
출력결과
"3의 배수입니다."

예시3)

입력값 : 10
출력결과
"5의 배수입니다."*/
public class Quiz {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int x = in.nextInt();

        if((x%3 == 0) && (x%5==0)){
            System.out.println("3의 배수와 5의 배수를 둘다 만족합니다.");
        } else if ((x%3 == 0)) {
            System.out.println("3의 배수입니다.");
        } else if ((x%5==0)) {
            System.out.println("의 배수입니다.");
        }
    }
}
