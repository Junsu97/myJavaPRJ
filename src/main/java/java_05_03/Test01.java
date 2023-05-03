package java_05_03;

public class Test01 {
    public static void main(String[] args) {
        String log = "123.123.123.123 - - [12/Apr/2018:17:03:50 +0900] \"GET /api/aaaa HTTP/1.1\" 200 34 1468 \"https://m.naver.com\" \"Mozilla/5.0 (iPhone; CPU iPhone OS 11_3 like Mac OS X) AppleWebKit/605.1.15 (KHTML, like Gecko) Mobile/15E216 NAVER(inapp; search; 580; 8.6.3; 7)\"";

        //문제 IP만 출력하기
        int startIndex = 0;
        int endIndex = log.indexOf(" ");
        String ip = log.substring(startIndex,endIndex);
        System.out.println(ip);
        /*******************************************************************/
        String ip2[] = log.split(" ");
        System.out.println("ip는 : " + ip2[0]);

        System.out.println();

        //문제 호출날짜와 시간만 출력하기
        startIndex = log.indexOf("[") + 1;
        endIndex = log.indexOf(" +") ;
        String time = log.substring(startIndex,endIndex);
        System.out.println(time);
        /*********************************************************************/
        String time2[] = log.split(" ");
        System.out.println("시간은 " + time2[3]);
        String repalaceTime = time2[3].replace("[","");
        System.out.println("시간은 " + repalaceTime);
    }
}
