package 구현;

import java.util.Scanner;

public class 왕실의나이트 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String s = scanner.nextLine(); //a1 좌표입력
        int count = 0;

        int x = s.charAt(0) - 96;
        int y = s.charAt(1) - '0';

        if(x+2<=8){
            if(y+1<=8) count++;
            if(y-1>=1) count++;
        }
        if(x-2>=1){
            if(y+1<=8) count++;
            if(y-1>=1) count++;
        }
        if(y+2<=8){
            if(x+1<=8) count++;
            if(x-1>=1) count++;
        }
        if(y-2>=1){
            if(x+1<=8) count++;
            if(x-1>=1) count++;
        }
        System.out.println(count);


        }



}
