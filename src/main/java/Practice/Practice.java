package Practice;

public class Practice {
    public static void main(String[] args) {
        System.out.println("별찍기 - 1");
        int line = 7;
        int count = 1;

        for(int i = 0; i < line; i++){
            for(int j = 0; j< count; j++){
                System.out.printf("*");
            }
            System.out.println();
            if(i < line / 2){
                count++;
            }else{
                count--;
            }
        }

        System.out.println("별찍기 - 2");

        for(int i = 0; i < line ; i++){
            if(i <= line / 2){
                for(int j = 0; j < line - i; j++){
                    System.out.printf(" ");
                }
                for(int j = 0; j < i * 2 + 1 ; j++) {
                    System.out.printf("*");
                }
            }else{
                for(int j = 0; j < i +1; j++){
                    System.out.printf(" ");
                }
                for(int j = 0; j < (line * 2 - i*2) - 1; j++){
                    System.out.printf("*");
                }
            }

            System.out.println(i);
        }
    }
}
