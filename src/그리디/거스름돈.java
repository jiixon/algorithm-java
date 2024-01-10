package 그리디;

import java.util.Scanner;

public class 거스름돈 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int coins[] = {500, 100, 50, 10};

        int count = 0;
        for (int coin : coins) {
            count += n / coin;
            n %= coin;
        }
        System.out.println(count);
    }
}
