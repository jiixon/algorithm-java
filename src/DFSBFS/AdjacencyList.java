package DFSBFS;

import java.util.ArrayList;

class Node {
    private int index;
    private int distance;

    public Node(int index, int distance) {
        this.index = index;
        this.distance = distance;
    }

    public void show() {
        System.out.print("(" + this.index + ", " + this.distance + ")");
    }
}

public class AdjacencyList {
    public static ArrayList<ArrayList<Node>> graph = new ArrayList<ArrayList<Node>>();
    public static void main(String[] args) {
        int rows = 3;

        //그래프 초기화
        for (int i = 0; i < rows; i++) {
            graph.add(new ArrayList<Node>());
        }

        //그래프의 연결된 노드 저장
        graph.get(0).add(new Node(1, 7));
        graph.get(0).add(new Node(2, 5));

        graph.get(1).add(new Node(0, 7));

        graph.get(2).add(new Node(0, 5));

        //그래프 출력
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < graph.get(i).size(); j++) {
                graph.get(i).get(j).show();
            }
            System.out.println();
        }
    }
}
