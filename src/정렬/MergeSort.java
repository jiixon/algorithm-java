package 정렬;

import java.util.Scanner;

public class MergeSort {
    private static int[] arr;
    private static int[] tmp;

    public static void mergeSort(int start, int end) {
        if (end - start < 1) return; //이미 정렬된 상태이기 때문에 리턴

        int middle = (start + end) / 2; // 반 나누기
        mergeSort(start, middle);
        mergeSort(middle + 1, end);

        tmp = new int[arr.length]; //임시 배열 초기화

        //임시 배열에 정렬된 값 복사
        for (int i = start; i <= end; i++) {
            tmp[i] = arr[i];
        }

        //왼쪽, 오른쪽 합병할 때 사용할 인덱스변수 초기화
        int left = start;
        int right = middle + 1;
        int index = start;

        //왼쪽과 오른쪽 부분을 합병하면정렬된 값을 원래 배열(arr)에 넣음, 작은 값을 가진 값부터 차례대로 병합됨
        while (left <= middle && right <= end) {
            if (tmp[left] <= tmp[right]) {
                arr[index++] = tmp[left++];
            } else {
                arr[index++] = tmp[right++];
            }
        }

        // 남은 왼쪽 부분 배열 복사
        while (left <= middle) {
            arr[index++] = tmp[left++];
        }

        //남은 오른쪽 부분 배열 복사
        while (right <= end) {
            arr[index++] = tmp[right++];
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        arr = new int[n];
        tmp = new int[n];

        // 입력값 배열에 저장
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        // Merge Sort 호출
        mergeSort(0, n - 1);

        // 정렬된 결과 출력
        for (int i = 0; i < n; i++) {
            System.out.print(arr[i] + " ");
        }
    }
}
