package Practice;

public class Quiz_9 {
    public static void main(String[] args) {
        int dan = 2;
        int gop = 1;

        while (dan<10){
            System.out.println(dan + "x" + gop + "=" + dan*gop);
            gop++;
            if(gop==10){
                gop = 1;
                dan++;
                System.out.println();
            }
        }
    }
}
