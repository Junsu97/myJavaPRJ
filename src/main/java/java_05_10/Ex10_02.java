package java_05_10;

public class Ex10_02 {
    public static void main(String[] args) {
        int[] aa = new int[3];
        try{
            aa[2] = 100 / 0;
            aa[3] = 100;
        }
        catch (ArrayIndexOutOfBoundsException e){
            System.out.println("배열 첨자가 배열 크기보다 커요");
            System.out.println("오류 메시지 : " +  e);
        }catch (ArithmeticException e){
            System.out.println("0으로 나누는 등의 오류");
            System.out.println("오류 메시지 : " + e);
        }catch (Exception e){
            System.out.println("자바에서 발생하는 에러를 다 잡을 수 있다.");
            System.out.println("오류 메시지 : " + e);
        }finally {
            System.out.println("이 부분은 무조건 나옴");
        }
    }
}

