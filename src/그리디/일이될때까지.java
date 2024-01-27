package 그리디;

import java.util.Scanner;

public class 일이될때까지 {
    public static void main(String[] args) {
        /***
         *25(n) 5(k) => 2
         * 1.N에서 1을 뺀다.
         * 2.N에서 K로 나눈다.
         */

        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int k = scanner.nextInt();
        int result = 0;
        while (n != 1) {
            if (n % k == 0) {
                n = n / k;
            } else {
                n -= 1;
            }
            result += 1;
        }
        System.out.println(result);
    }
}
