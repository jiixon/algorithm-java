package 이진탐색;

import java.util.Scanner;

public class 떡볶이떡_만들기 {
    /**
     * 4 6 //떡의 갯수(N), 요청한 떡의 길이(M)
     * 19 15 10 17
     */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt(); //떡의 갯수
        int m = scanner.nextInt(); //요청한 떡의 길이
        int[] arr = new int[n];

        for (int i = 0; i < n; i++) {
            arr[i] = scanner.nextInt();
        }

        int start = 0;
        int end = 10000000;
        int result = 0;
        while (start <= end) {
            int mid = (start + end) / 2;
            long total = 0;
            for (int i = 0; i < n; i++) {
                if (arr[i] > mid) {
                    total += arr[i] - mid;
                }
            }
            if (total < m) { // 떡의 양이 부족한 경우 더 많이 자르기(왼쪽 부분 탐색)
                end = mid - 1;
            }
            else{ // 떡의 양이 충분한 경우 덜 자르기(오른쪽 부분 탐색)
                result = mid; // 최대한 덜 잘랐을 때가 정답이므로, 여기에서 result에 기록
                start = mid + 1;
            }
        }
        System.out.println(result);
    }
}
