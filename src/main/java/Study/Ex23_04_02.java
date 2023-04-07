package Study;

import java.io.*;

public class Ex23_04_02 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int Min = Integer.parseInt(br.readLine());
        int Max = Integer.parseInt(br.readLine());
        int tmp  = 0;
        int sum = 0;

        if(Max < Min){
            tmp = Max;
            Max = Min;
            Min = tmp;
        }
        if(Max > Min){
            for(int i = Min; i < (Max+1); i++){
                sum += i;
            }
        }
        bw.write(String.valueOf(sum));
        bw.flush();
        br.close();
        bw.close();
    }
}
