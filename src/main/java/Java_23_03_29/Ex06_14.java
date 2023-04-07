package Java_23_03_29;

public class Ex06_14 {
    public static void main(String[] args) {
        int i,j;

        for(i = 2; i < 10; i++) {
            System.out.println(i + "단 시작합니다!");
            for (j = 1; j < 10; j++) {
                System.out.println(i + " X " + j + " = " + (i * j));
            }
            System.out.println(i + "단 끝났습니다!");
            System.out.println(" ");
        }
    }
}
