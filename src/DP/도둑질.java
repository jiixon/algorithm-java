package DP;

public class 도둑질 {
    /**
     * 인접한 집 털지않기
     * DP
     * 핵심
     * 1. 첫번째 집을 고르고 마지막 집을 고르지 않는다   // 0. 첫 번째 집을 고르고 마지막 집을 고르지 않는다 (money.size()-1까지 돌림)
     * 2. 첫번째 집을 고르지 않고, 마지막 집을 고른다.
     * // 1. 첫 번째 집을 고르지 않는다 -> 이 말은 2번째 혹은 3번째 집부터 턴타는 말과 같음(
     *
     * 본 콘텐츠를 무단으로 복사 후 게재 혹은 배포할 시 저작권법에 의거하여 처벌받을 수 있음을 명시합니다.
     * 출처 : https://ssocoit.tistory.com/48 [코딩하는 경제학도]
     * Copyright © SsocoIT
     * 본 콘텐츠를 무단으로 복사 후 게재 혹은 배포할 시 저작권법에 의거하여 처벌받을 수 있음을 명시합니다.
     * 출처 : https://ssocoit.tistory.com/48 [코딩하는 경제학도]
     * Copyright © SsocoIT
     * */
    public int solution(int[] money) {
        int[] dp = new int[money.length];

        //첫 번째 집을 무조건 털어야 함
        dp[0] = money[0];
        //두 번째 집까지 고려했을 때는 첫 번째 집을 털거나, 두 번째 집을 털거나 둘 중 하나
        dp[1] = Math.max(money[0], money[1]);

        //첫 번째 집을 털었으므로 마지막 집을 털면 안 됨 -> money.length-1
        for(int i = 2; i<money.length-1; i++) {
            dp[i] = Math.max(dp[i-2] + money[i], dp[i-1]);
        }

        int[] dp2 = new int[money.length];
        //두번째 집 털기
        dp2[1] = money[1];
        //첫 번째 집을 안 털었기 때문에 마지막 집까지 고려 -> money.length
        for(int i = 2; i<money.length; i++){
            dp2[i] = Math.max(dp2[i-2] + money[i], dp2[i-1]);
        }
        return Math.max(dp[money.length-2], dp2[money.length-1]);
    }
}
