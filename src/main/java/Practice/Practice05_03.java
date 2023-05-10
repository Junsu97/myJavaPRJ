package Practice;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;


public class Practice05_03 {
    private static final String FILEFATH = "C:\\DB\\Practice.csv";
    static BufferedReader br;
    private int index = 0;
    List<String[]> list = new ArrayList<>();
    public String[] nextRead(){

        if(list.size() == index){
            return null;
        }
        return list.get(index++);
    }
    public void getCSV(){
        List<Map<String,String[]>> db = new ArrayList<>();
        Map <String,String[]> map = null;
        try{
            br = new BufferedReader(new InputStreamReader(new FileInputStream(FILEFATH),"UTF-8"));
            String line = null;
            while((line = br.readLine()) !=  null){
                //정규표현식
                //(?=) 전방탐색
                //쉼표로 구분된 문자열 중에, "" 로 둘러싸인 문자열 안에 있는 쉼표는 구분자로 처리하지 않고,
                //쉼표로 구분된 '문자열'로만 분리한다
                String[] row = line.split(",(?=([^\"]*\"[^\"]*\")*[^\"]*$)", -1);
                list.add(row);

            }
        }catch (Exception e){
            e.printStackTrace();
        }

    }

    public static void main(String[] args) {
        Practice05_03 instance = new Practice05_03();

        instance.getCSV();
        String[] line = null;

        while ((line = instance.nextRead()) != null){
            for(String s : line){
                System.out.printf(s + " ");
            }
            System.out.println();
        }
    }

}

