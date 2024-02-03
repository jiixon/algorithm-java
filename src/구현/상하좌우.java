package 구현;

import java.util.Scanner;

public class 상하좌우 {
    public static void main(String[] args) {
        /***
         * 5
         * R R R U D D
         * => 3 4
         */
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        sc.nextLine();
        String[] plan = sc.nextLine().split(" ");
        int x = 1, y = 1;

        for(int i = 0; i<plan.length; i++){
            switch (plan[i]){
                case "L":
                    if(y>1) y--;
                    break;
                case "R":
                    if(y<n) y++;
                    break;
                case "U":
                    if(x>1) x--;
                    break;
                case "D":
                    if(x<n) x++;
                    break;
            }
        }
        System.out.print(x+" "+y);
    }
}
