package chap_03;

public class _Quiz_03 {
    public static void main(String[] args) {
        String ans1 = "907231-1234567" ;
        String ans2 = "030708-4567890" ;
        System.out.println(ans1.substring(0,8)); // 0 위치부터 8 위치 직전까지
        System.out.println(ans2.substring(0, ans2.indexOf("-")+2)); // 0 위치부터 하이폰 위치 + 2 직전까지
    }
}
