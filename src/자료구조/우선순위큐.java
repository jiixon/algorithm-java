package 자료구조;

import java.util.PriorityQueue;

class Node implements Comparable<Node>{
    int idx; // 노드
    int cost;  // 비용

    Node(int idx, int cost){
        this.idx = idx;
        this.cost = cost;
    }

    //비용으로 우선순위 정하기
    @Override
    public int compareTo(Node other) {
        return Integer.compare(this.cost, other.cost);
    }

    //출력을 위한 오버라이드
    @Override
    public String toString() {
        return "Node{" + "idx=" + idx + ", cost=" + cost + '}';
    }
}
public class 우선순위큐 {
    public static void main(String[] args) {
        PriorityQueue<Node> pq = new PriorityQueue<>();
        pq.offer(new Node(1, 10));
        pq.offer(new Node(2, 5));
        pq.offer(new Node(3, 20));

        while (!pq.isEmpty()) {
            System.out.println(pq.poll());
        }
        /**
         * 출력
         * Node{idx=2, cost=5}
         * Node{idx=1, cost=10}
         * Node{idx=3, cost=20}*/
    }
}
