package 구현;

import java.util.Scanner;

public class 게임개발 {
    public static void main(String[] args) {
        /***
         * 4 4 (4*4맵 생성)
         * 1 1 0 (현위치:1,1 북쪽(0)을 바라봄)
         * 1 1 1 1 (모두 바다)
         * 1 0 0 1 (바다 육지 육지 바다)
         * 1 1 0 1
         * 1 1 1 1
         *
         */


        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        int[][] map = new int[n][m];
        int[][] check = new int[n][m];

        int x = sc.nextInt();
        int y = sc.nextInt();
        int d = sc.nextInt();

        for (int i = 0; i < n; i++) {
            for (int j = 0; j<m; j++ ){
                map[i][j] = check[i][j] = sc.nextInt();
            }
        }
        check[x][y] = 1; //현위치 갔던 곳으로 체크

        int count = 1; //카운트 1로 초기화(현위치로)
        while(true){

        }



    }
}
