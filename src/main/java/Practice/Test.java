package Practice;

public class Test {
    public static void main(String[] args) {
        int line = 7;
        int count = 1;

        for(int i = 0; i < 7; i++){
            for(int j = 0; j < count; j++){
                System.out.printf("*");
            }
            if(i < line / 2){
                count++;
            }else{
                count--;
            }
            System.out.println();
        }
    }
}
