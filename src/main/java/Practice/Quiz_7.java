package Practice;

public class Quiz_7 {
    public static void main(String[] args) {
        int dan = 2;
        int gop = 1;
        for( ;  dan < 10; gop++){
            System.out.println(dan + "x" + gop + "=" +dan*gop);
            if(gop == 9){
                dan++;
                gop = 0;
                System.out.println();
            }
        }
    }
}
