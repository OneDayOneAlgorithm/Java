package chap_13;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class _06_ReadWriteFile {
    public static void main(String[] args) {
        // BufferedReader : 파일에서 내용을 읽어올 때
        // BufferedWriter : 파일에 내용을 쓸 때

        // 파일 쓰기
        try(BufferedWriter bw = new BufferedWriter(new FileWriter("goodjob.txt"))) {
            bw.write("1. 이제 거의 끝이 보여요.");
            bw.newLine();
            bw.write("2. 여기까지 오신 여러분들 정말 대단해요.");
            bw.newLine();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
