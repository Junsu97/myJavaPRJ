package Study;

public class Test2 {
    public static void main(String[] args) {
        for(int dan = 2, gop = 1; dan < 10; gop++){
            System.out.println(dan + "x" + gop + "=" + dan*gop);
            if(gop == 9){
                dan++;
                gop = 0;
                System.out.println();
            }
        }
    }
}
