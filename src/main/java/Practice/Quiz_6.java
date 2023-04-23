package Practice;

public class Quiz_6 {
    public static void main(String[] args) {
        for(int i = 1; i < 10; i++){
            for(int j = 2; j < 10; j++){
                System.out.print(j + "x" + i + "=" + i*j + "\t");
                if(j == 9){
                    System.out.println();
                }
            }
        }
    }
}
