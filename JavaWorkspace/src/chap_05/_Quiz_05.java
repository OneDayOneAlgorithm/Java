package chap_05;

public class _Quiz_05 {
    public static void main(String[] args) {
        int[] sizeArray = new int[10];
        for (int i = 0; i < sizeArray.length; i++) {
            sizeArray[i] = 250 + i*5;
        }
        for (int j = 0; j < 10; j++) {
            System.out.println("사이즈 " + sizeArray[j] + " (재고 있음)");
        }
    }
}
