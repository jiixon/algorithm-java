package 자료구조;

import java.util.Scanner;

public class 평균구하기 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int[] score = new int[N];
        for (int i = 0; i < N; i++) {
            score[i] = sc.nextInt();
        }
        long sum = 0;
        long max = 0;
        for (int i = 0; i < N; i++) {
            if (score[i] > max) max = score[i];
            sum += score[i];
        }
        System.out.println(sum * 100.0 / max / N);
    }
}
