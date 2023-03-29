package A_supplementary_class;

public class Continue {
    public static void main(String[] args) {
        for(int i = 0; i < 10; i++){
                          //    ^
                            //  |
            if(i%3 == 0)//------|
                continue;
            System.out.println(i);
        }
/**********************************************************************************************************************/
        // 이름 붙은 반복문
        Loop1 : for(int i =2 ; i < 10; i++){
            for(int j = 1; j <= 9; j++){
                if(j == 5)
                    break Loop1;
                System.out.println(i + "*" + j + "=" + i*j);
            } //end of for i
            System.out.println();
        }//end of Loop1

/********************************************************************************************************************/
        for(int i = 1; i <11; i++){
            for(int j = 0; j<i; j++){
                System.out.print("*");
            }
            System.out.println(" ");
        }
/*******************************************************************************************************************/
        int x = 10;
        int n = 0;
        for(int i = 1; i <x; i++){
            if(i < x / 2 + 1) n++;
            else n--;

            for(int j = 0; j<n; j++){
                System.out.print("*");
            }
            System.out.println(" ");
        }
    }
}
