package DP;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class DP {
    public static int n;
    public static long[] memo;

    public static int fibonacci_recur(int n) { //O(2^N)
        if (n <= 1) return n;
        else return fibonacci_recur(n - 1) + fibonacci_recur(n - 2);
    }
    public static long fibonacci_dp_bottom(int n) {
        if (n <= 1) return n;
        memo[0] = 0;
        memo[1] = 1;
        for (int i = 2; i < n + 1; i++) {
            memo[i] = memo[i - 1] + memo[i - 2];
        }
        return memo[n];
    }
    public static long fibonacci_dp_top(int n) {
        if (n <= 1) return n;
        if (memo[n] != 0) return memo[n];
        return memo[n] = fibonacci_dp_top(n - 1) + fibonacci_dp_top(n - 2);
    }
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        n = Integer.parseInt(br.readLine());
        memo = new long[n + 1];

    }
}
