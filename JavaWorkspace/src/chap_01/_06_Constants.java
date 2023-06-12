package chap_01;

// 상수를 의미하는 변수는 모두 대문자로 사용한다.
// 가독성을 위해 _을 사용한다.
// 변하지 않는 상수는 final을 사용한다.
public class _06_Constants {
    public static void main(String[] args) {
        final String KR_COUNTRY_CODE = "+82";
//        KR_COUNTRY_CODE = "+8282";
        System.out.println(KR_COUNTRY_CODE);

        final double PI = 3.141592;
        final String DATE_OF_BIRTH = "2001-12-31";
    }
}
