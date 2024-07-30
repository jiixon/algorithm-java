package 이진탐색;

import java.io.IOException;
import java.util.Scanner;

public class 부품찾기_계수정렬 {
    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);

        // N(가게의 부품 개수)
        int n = sc.nextInt();
        int[] shopArr = new int[1000001];
        for (int i = 0; i < n; i++) {
            int x = sc.nextInt();
            shopArr[x] = 1;
        }

        // M(손님 부품 개수)
        int m = sc.nextInt();
        int[] customerArr = new int[m];
        for (int i = 0; i < m; i++) {
            customerArr[i] = sc.nextInt();
        }

        // 손님이 확인 요청한 부품 번호를 하나씩 확인
        for(int i = 0; i<m; i++){
            if(shopArr[customerArr[i]] == 1) System.out.print("yes ");
            else System.out.print("no ");
        }
    }
}
