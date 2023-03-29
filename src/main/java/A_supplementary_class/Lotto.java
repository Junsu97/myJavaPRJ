package A_supplementary_class;

public class Lotto {
    public static void main(String[] args) {
        int[] ball = new int[45];

        for(int i = 0; i < ball.length; i++){
            ball[i] = i + 1;
        }

        int temp = 0; //변수 값 교환을 위현 변수
        int j = 0; //랜덤 변수를 저장할 변수

        for(int i = 0; i < 100; i++){
            j = (int)(Math.random() * 45); // 난수 발생 -> 랜덤 변수
            // 랜덤한 번호의 공과 첫번째 공 교환 (섞기)
            temp = ball[0];
            ball[0] = ball[j];
            ball[j] = temp;
        }

        for(int i = 0; i < 6; i++){
            System.out.print(ball[i] + " ");
        }
    }
}
