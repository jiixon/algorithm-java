package 이진탐색;

import java.util.Arrays;
import java.util.Scanner;

public class 부품찾기_이진탐색 {
    /**
     * 5         //가게 부품 수 N
     * 8 3 7 9 2 //가게 부품 번호
     * 3        //손님이 찾는 부품 수 M
     * 5 7 9    //손님이 찾는 부품 번호
     */

    public static String binarySearch(int[] arr, int target, int start, int end){
        while (start <= end){
            int mid = (start + end) / 2;
            if(arr[mid] == target) return "yes";
            else if(arr[mid] > target) end = mid - 1;
            else start = mid + 1;
        }
        return "no";
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // N(가게의 부품 개수)
        int n = sc.nextInt();
        int[] shopArr = new int[n];
        for (int i = 0; i < n; i++) {
            shopArr[i] = sc.nextInt();
        }

        // 이진 탐색을 수행하기 위해 사전에 정렬 수행
        Arrays.sort(shopArr);

        // M(손님 부품 개수)
        int m = sc.nextInt();
        int[] customerArr = new int[m];
        for (int i = 0; i < m; i++) {
            customerArr[i] = sc.nextInt();
        }

        for(int i = 0; i<m; i++){
            System.out.print(binarySearch(shopArr, customerArr[i], 0, n-1) + " ");
        }
    }
}
