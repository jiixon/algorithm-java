package 이진탐색;

import java.util.Scanner;

public class SequentialSearch {

    public static int sequentialSearch(int n, String target, String[] arr) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i].equals(target)) {
                return i + 1; //찾고자 하는 인덱스 반환
            }
        }
        return -1; //찾지 못할 시에 -1 반환
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("생성할 원소 개수를 입력한 다음 한 칸 띄고 찾을 문자열을 입력하세요.");

        int n = sc.nextInt(); //생성할 원소 개수
        String target = sc.next(); //찾을 문자열

        System.out.println("앞서 적은 원소 개수만큼 문자열을 입력하세요. 구분은 띄어쓰기 한 칸으로 합니다.");
        String[] arr = new String[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.next();
        }

        System.out.println(sequentialSearch(n, target, arr));
    }
}
