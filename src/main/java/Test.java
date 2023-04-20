public class Test {
    public static void main(String[] args){
        int dan = 2;
        int gop = 1;

        for(; ; gop++){
            if(dan < 10){
                System.out.println(dan + "x" + gop + "=" + dan*gop);
                if(gop == 9){
                    dan++;
                    gop = 0;
                    System.out.println();
                }
            }else{
                break;
            }
        }
    }
}
