import java.util.Scanner;

public class Main {
    public static void merge(int[] arr, int start, int middle, int end, int[] tmp) {
        int left = start;
        int right = middle + 1;
        int index = start;

        while (left <= middle && right <= end) {
            if (arr[left] <= arr[right]) {
                tmp[index++] = arr[left++];
            } else {
                tmp[index++] = arr[right++];
            }
        }

        while (left <= middle) {
            tmp[index++] = arr[left++];
        }

        while (right <= end) {
            tmp[index++] = arr[right++];
        }

        for (int i = start; i <= end; i++) {
            arr[i] = tmp[i];
        }
    }

    public static void mergeSort(int[] arr, int start, int end, int[] tmp) {
        if (start < end) {
            int middle = (start + end) / 2;
            mergeSort(arr, start, middle, tmp);
            mergeSort(arr, middle + 1, end, tmp);
            merge(arr, start, middle, end, tmp);
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int c = sc.nextInt();
        int[] cntArr = new int[c + 1];
        int[] arr = new int[n];

        for (int i = 0; i < n; i++) {
            int num = sc.nextInt();
            cntArr[num]++;
            arr[i] = num;
        }

        int maxFreq = 0;
        for (int freq : cntArr) {
            maxFreq = Math.max(maxFreq, freq);
        }

        int[] tmp = new int[n];
        mergeSort(arr, 0, n - 1, tmp);

        for (int i = maxFreq; i >= 1; i--) {
            for (int j = 0; j < cntArr.length; j++) {
                if (cntArr[j] == i) {
                    for (int k = 0; k < i; k++) {
                        System.out.print(j + " ");
                    }
                }
            }
        }
    }
}
