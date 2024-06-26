package DFSBFS;

import java.util.ArrayList;
import java.util.Scanner;

class Node {
    private int index;
    private int cost;

    public Node(int index, int cost) {
        this.index = index;
        this.cost = cost;
    }

    @Override
    public String toString() {
        return "[" + index + ", "
                + "" + cost + "]";
    }
}

/*
정점, 간선의 개수 이후
(노드, 노드, 비용)이 주어진 경우
5 6
5 1 1
1 2 2
1 3 3
2 3 4
2 4 5
3 4 6
 */
public class AdjacencyList {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // V = 정점의 개수, E = 간선의 개수.
        int V = sc.nextInt();
        int E = sc.nextInt();

        // 1차원 리스트를 만든다.
        // 인덱스의 번호 = 노드의 번호 이기 때문에, 1차원 리스트의 크기를 임의로 1 늘려서 정의한다(스킬).
        ArrayList<ArrayList<Node>> graph = new ArrayList<ArrayList<Node>>();
        for (int i = 0; i < V + 1; i++) {
            graph.add(new ArrayList<Node>());
        }

        int a;
        int b;
        int cost;
        for (int i = 0; i < E; i++) {
            a = sc.nextInt();
            b = sc.nextInt();
            cost = sc.nextInt();

            graph.get(a).add(new Node(b, cost));
            // 만일, 무향 그래프라면 반대의 상황도 추가해 준다.
            // graph.get(b).add(new Node(a, cost));
        }

        //인접행렬 출력
        for(int i = 1; i<=V; i++){
            System.out.print("Node " + i + ": ");
            for(Node node: graph.get(i)){
                System.out.print(node.toString());
            }
            System.out.println();
        }
    }
}
