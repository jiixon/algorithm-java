package 자료구조;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class 구간합 {
    /**
     * 5 3
     * 5 4 3 2 1
     * 1 3 => 12
     * 2 4 => 9
     * 5 5 => 1
     **/

    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in)); // 선언 ex) 5 3

        //공백단위로 데이터 가공
        StringTokenizer stringTokenizer = new StringTokenizer(bf.readLine()); //StringTokenizer 인자값에 입력 문자열 넣음
        int suNo = Integer.parseInt(stringTokenizer.nextToken()); //첫번째 호출 ex) 5
        int quizNo = Integer.parseInt(stringTokenizer.nextToken()); //두번째 호출 ex) 3

        //합 배열 생성하기 (S[i] = S[i - 1] + A[i])
        long[] S = new long[suNo + 1];
        stringTokenizer = new StringTokenizer(bf.readLine());
        for (int i = 1; i <= suNo; i++) {
            S[i] = S[i - 1] + Integer.parseInt(stringTokenizer.nextToken());
        }

        for (int q = 0; q < quizNo; q++) {
            stringTokenizer = new StringTokenizer(bf.readLine());
            int i = Integer.parseInt(stringTokenizer.nextToken());
            int j = Integer.parseInt(stringTokenizer.nextToken());
            System.out.println(S[j] - S[i - 1]);
        }
    }
}
