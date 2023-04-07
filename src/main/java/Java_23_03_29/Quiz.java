package Java_23_03_29;

public class Quiz {
    public static void main(String[] args) {
        int i,j;

        for(i = 1; i < 10; i++){
            for(j = 2; j < 10; j++){
                System.out.print(j + " x " + i + " = " + (i*j) + "\t");
            }
            System.out.println(" ");
        }
    }
}
