package 이진탐색;

import java.io.IOException;
import java.util.HashSet;
import java.util.Scanner;

public class 부품찾기_집합자료형 {
    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        // 집합(Set) 정보를 처리하기 위한 HashSet -> 데이터를 중복 저장할 수 없고 순서를 보장X
        HashSet<Integer> s = new HashSet<>();
        for (int i = 0; i < n; i++) {
            int x = sc.nextInt();
            s.add(x);
        }

        // M(손님이 확인 요청한 부품 개수)
        int m = sc.nextInt();
        int[] targets = new int[m];
        for (int i = 0; i < m; i++) {
            targets[i] = sc.nextInt();
        }

        // 손님이 확인 요청한 부품 번호를 하나씩 확인
        for(int i = 0; i<m; i++){
            // 해당 부품이 존재하는지 확인
            if(s.contains(targets[i])) System.out.print("yes ");
            else System.out.print("no ");
        }
    }
}
