public class Test {
    public static void main(String[] args){
        String log = "123.123.123.123 - - [12/Apr/2018:17:03:50 +0900] \"GET /api/aaaa HTTP/1.1\" 200 34 1468 \"https://m.naver.com\" \"Mozilla/5.0 (iPhone; CPU iPhone OS 11_3 like Mac OS X) AppleWebKit/605.1.15 (KHTML, like Gecko) Mobile/15E216 NAVER(inapp; search; 580; 8.6.3; 7)\" ";

        String[] spritStr = log.split(" ");   // 공백 기준으로 분리
        String proto = spritStr[5].replaceAll("\"","");
         /*공백 기준으로 분리하면 "GET 이 출력 되기때문에
           replaceAll을 통해 " 를 공백으로 치환
        */

        System.out.println(proto);
    }
}
