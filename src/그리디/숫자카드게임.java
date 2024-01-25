package 그리디;

import java.util.Scanner;

public class 숫자카드게임 {
    public static void main(String[] args) {
        /**
         * 3 3
         * 3 1 2
         * 4 1 4
         * 2 2 2
         **/
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        int result = 0;

        for (int i = 0; i < n; i++) {
            //입력시 들어오는 수(x) 1이상 10,000이하
            int min = 10001;
            for (int j = 0; j < m; j++) {
                int x = sc.nextInt();
                //현재 줄에서 가장 작은 수 찾기
                min = Math.min(min, x);
            }
            //각 행에서 찾은 가장 작은 수 중 큰 수 찾기
            result = Math.max(result, min);
        }
        System.out.println(result);
    }
}
