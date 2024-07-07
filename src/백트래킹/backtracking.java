package 백트래킹;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class backtracking {

    public static int[] array;
    public static boolean[] visited;
    public static StringBuilder sb = new StringBuilder();

    public static void backTracking(int n, int m, int depth){
        if(m == depth){
            for(int i = 0; i<array.length-1; i++){
                sb.append(array[i]).append(" ");
            }
            sb.append("\n");
            return;
        }

        for(int i = 1 ;i<=n; i++){
            if(!visited[i]){
                visited[i] = true; //방문 표시
                array[depth] = i;
                backTracking(n,m,depth+1); //다음 숫자 선택
                visited[i] = false; //방문 상태 초기화
            }
        }
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int n = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());

        array = new int[m+1];
        visited = new boolean[n+1];

        backTracking(n,m,0); //깊이 0부터 시작
        System.out.println(sb);
    }

}
