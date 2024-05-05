package DFSBFS;

import java.util.ArrayList;

public class dfs {
    public static boolean[] visited = new boolean[10];
    //각 노드가 연결된 정보를 2차원 ArrayList로 표현
    public static ArrayList<ArrayList<Integer>> graph = new ArrayList<>();

    //DFS 함수 정의
    public static void dfs(int v){
        //현재 노드 방문 처리
        visited[v] = true;
        System.out.print(v + " ");

        //현재 노드와 연결된 다른 노드를 재귀적으로 방문
        for(int i = 0; i<graph.get(v).size(); i++){
            int nextV = graph.get(v).get(i);
            if(!visited[nextV]) dfs(nextV);
        }
    }
    public static void main(String[] args) {
        for(int i = 0; i<10; i++){
            graph.add(new ArrayList<>());
        }

        graph.get(1).add(2);
        graph.get(1).add(5);

        graph.get(2).add(1);
        graph.get(2).add(3);
        graph.get(2).add(4);

        graph.get(3).add(2);

        graph.get(4).add(2);

        graph.get(5).add(1);
        graph.get(5).add(6);
        graph.get(5).add(9);

        graph.get(6).add(5);
        graph.get(6).add(7);
        graph.get(6).add(8);

        graph.get(7).add(6);

        graph.get(8).add(6);

        graph.get(9).add(5);

        dfs(1);
    }
}
