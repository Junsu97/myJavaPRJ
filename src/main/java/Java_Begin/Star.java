package Java_Begin;

public class Star {
    public static void main(String[] args){
        int num = 4;
        for(int i = 1; i <= num; i++) {
            for(int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println("");
            if(i == num){
                for(int k = num - 1; k >= 1; k--) {
                    for(int j = 1; j <= k; j++) {
                        System.out.print("*");
                    }
                    System.out.println("");
                }
            }
        }
    }
}
