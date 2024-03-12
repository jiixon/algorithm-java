package DFSBFS;

import java.util.Scanner;

public class 음료수얼려먹기 {
    public static int n, m;
    public static int[][] graph = new int[1000][1000];
    public static boolean dfs(int x, int y){
        if(x<=-1 || x>=n || y<=-1 || y>=m) return false;
        if(graph[x][y] == 0){
            //현재위치 방문처리
            graph[x][y] = 1;

            //상하좌우 dfs 실행 후 확인
            dfs(x-1,y);
            dfs(x,y-1);
            dfs(x+1, y);
            dfs(x,y+1);
            return true;
        }
        return false;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        //n,m을 공백 기준으로 입력받기
        n = sc.nextInt();
        m = sc.nextInt();
        sc.nextLine(); //버퍼 비우기

        //2차원 리스트의 맵을 정보 입력받고 저장하기
        for (int i = 0; i < n; i++) {
            String s = sc.nextLine();
            for(int j=0; j < m; j++) {
                graph[i][j] = s.charAt(j) - '0';
            }
        }

        int result = 0; //아이스크림 개수
        for(int i = 0; i < n; i++) {
            for(int j=0; j < m; j++) {
                if(dfs(i,j)) result +=1;
            }
        }
        System.out.println(result);
    }
}