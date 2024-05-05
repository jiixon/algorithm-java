package DFSBFS;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;

public class bfs {
    public static boolean[] visited = new boolean[10];
    public static ArrayList<ArrayList<Integer>> graph = new ArrayList<>();

    public static void bfs(int start){
        Queue<Integer> q = new LinkedList<>();
        q.offer(start);
        //현재노드 방문처리
        visited[start] = true;

        //큐가 빌 때까지 반복
        while (!q.isEmpty()){
            int x = q.poll();
            System.out.printf(x + " ");
            for(int i = 0; i<graph.get(x).size(); i++){
                int y = graph.get(x).get(i);
                if(!visited[y]){
                    q.offer(y);
                    visited[y] = true;
                }

            }
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

        bfs(1);
    }
}
