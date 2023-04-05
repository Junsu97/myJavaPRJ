import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Quiz_2 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int x = Integer.parseInt(br.readLine());

        for(int i =0, j=1; i<x; j++){
            System.out.print("*");
            if(j - 1 == i){
                System.out.println("");
                i++;
                j=0;
            }
        }
    }
}
