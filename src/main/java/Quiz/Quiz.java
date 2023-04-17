package Quiz;

public class Quiz {

    public static void main(String[] args) {

        for(int i = 2,j =1; i < 10; j++){
            System.out.println(i + "x" + j + "=" + (i*j));
            if(j == 9 ){
                i++;
                j = 1;
                System.out.println();
            }
        }
    }
}
