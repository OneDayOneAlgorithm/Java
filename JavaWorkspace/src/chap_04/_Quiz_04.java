package chap_04;

public class _Quiz_04 {
    public static void main(String[] args) {
        String car = "경차";
        int hour = 5;
        int ans = 0;
        if (car=="일반 차량"){
            ans = 4000 * hour;
            if (ans>30000){
                ans = 30000;
            }
        } else if (car=="경차" || car=="장애인 차량"){
            ans = 2000 * hour;
            if (ans>15000) {
                ans = 15000;
            }
        }
        System.out.println("주차 요금은 " + ans + " 원입니다.");
    }
}
