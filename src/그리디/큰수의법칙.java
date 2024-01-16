package 그리디;

import java.util.Arrays;
import java.util.Scanner;

public class 큰수의법칙 {
    /**
     * 5 8 3
     * 2 4 5 4 6
     * => 46
     **/
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int m = scanner.nextInt();
        int k = scanner.nextInt();

        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = scanner.nextInt();
        }

        Arrays.sort(arr); //입력받은 배열 정렬
        int first = arr[n - 1]; //가장 큰 수
        int second = arr[n - 2]; //두번쨰로 큰 수
        int sum = 0;

        /**
         while(true){
         for(int i=0; i<k; i++){
         if(m==0) break;
         sum+=first;
         m--;
         }
         if(m==0) break;
         sum+=second;
         m--;
         }**/

        //가장 큰 수가 더해지는 횟수 계산
        int count = (m / (k + 1)) * k;
        count += m % (k + 1);

        sum += count * first; //가장 큰 수 더하기
        sum += (m - count) * second; //두 번째로 큰 수 더하기

        System.out.println(sum);

    }
}
