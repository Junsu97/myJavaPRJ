package Practice;

import java.util.Scanner;

// 자바로 삼각형 만들기
public class Quiz_1 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        String str = "*";
        int line;

        do {
            System.out.println("홀수를 입력해 주세요");
            line = in.nextInt();
        }
        while(line % 2 == 0);


        for(int i = 0; i < line; i++ ){ //줄 바꿈을 담당할 가장 큰for문
            if(i < line/2 + 1){ // 줄바꿈에 따라 별의 수가 달라짐으로 조건을 부여
                System.out.print(str);
                str+="*";//for문 대신 문자열에 연산자를 사용
            }else{
                for(int j = line - i; j > 0;j--) {  //줄 넘김이 절반 이상 진행되면 수행 될 for문
                    System.out.print("*");  
                }
            }
            System.out.println();
        }

    }

}

