package 구현;

import java.util.Scanner;

public class 시각 {
    public static void main(String[] args) {
        /***
         * N입력 -> 00시 00분 00부터 N시 59분 59초
         * 3이 포함되어있는 경우의 수
         */
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int count = 0;

        for(int i=0; i<=n; i++){
            if(i%10==3) count+=60*60;
            else {
                for (int j = 0; j < 60; j++) {
                    if(j%10==3 || j/10==3) count+=60;
                    else{
                        for (int k = 0; k < 60; k++) {
                            if(k%10==3 || k/10==3) count+=1;
                        }
                    }
                }
            }
        }
        System.out.println(count);

    }
}
