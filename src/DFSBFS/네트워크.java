package DFSBFS;

public class 네트워크 {
    public int solution(int n, int[][] computers) {
        int answer = 0;
        boolean[] visited = new boolean[n]; //방문 노드 체크
        for(int i = 0; i<n; i++){
            if(!visited[i]){
                //방문한적 없는 네트워크이므로 dfs 시작 다 돌고 나서 answer++
                dfs(i, computers, visited);
                answer++;
            }
        }
        return answer;
    }
    private void dfs(int node, int[][] computers, boolean[] visited) {
        visited[node] = true;
        for(int i = 0; i<computers.length; i++){
            if(computers[node][i] == 1 && !visited[i]){
                dfs(i, computers, visited);
            }
        }
    }
}
