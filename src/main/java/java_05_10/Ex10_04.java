package java_05_10;

public class Ex10_04 {
    public static void main(String[] args) {
        int a = 100, b = 0;
        int result;
        try{
            if(b == 0){
                throw new Exception("0으로 나누기 안됨");
            }
            result = a/b;
        }catch (Exception e){
            System.out.println("발생 오류 ==> " + e.getMessage());
        }
    }
}
