// true, false는 boolean을 사용한다.
// 문자열은 String을, 문자는 char을 사용한다.
// 정밀한 소수는 double을, 아니면 float을 사용한다. float을 사용할 때는 소수뒤에 F를 붙인다.
// 21억 이상의 정수는 long을, 아니면 int를 사용한다. long을 사용할 때는 정수뒤에 L를 붙인다.
// long 자료형은 보기쉽게 _로 자릿수를 구분할 수 있다.
package chap_01;

public class _03_Variables {
    public static void main(String[] args) {
        String name = "나도코딩";
        int hour = 15;

        System.out.println(name + "님, 배송이 시작됩니다. "+hour+"시에 방문 예정입니다.");
        System.out.println(name + "님, 배송이 완료되었습니다.");

        double score = 90.5;
        char grade = 'A';
        name = "강백호";
        System.out.println(name+"님의 평균 점수는"+score+"점입니다.");
        System.out.println("학점은 "+grade+"입니다.");

        boolean pass=true;
        System.out.println("이번 시험에 합격했을까요? " + pass);

        double d = 3.14123456789;
        float f = 3.14123456789F;
        System.out.println(d);
        System.out.println(f);

        long l = 1000000000000L;
        l = 1_000_000_000_000L;
        System.out.println(l);
    }
}
