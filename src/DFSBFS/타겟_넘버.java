package DFSBFS;

public class 타겟_넘버 {
    /**
     * 재귀 - DFS
     * -1+1+1+1+1 = 3
     * +1-1+1+1+1 = 3
     * +1+1-1+1+1 = 3
     * +1+1+1-1+1 = 3
     * +1+1+1+1-1 = 3
     * */

    public int solution(int[] numbers, int target) {
        return findTarget(numbers, target, 0, 0);
    }

    private int findTarget(int[] numbers, int target, int currentSum, int idx) {

        if(idx == numbers.length) {
            return currentSum == target ? 1 : 0;
        }

        int plus = findTarget(numbers, target, currentSum + numbers[idx], idx+1);
        int minus = findTarget(numbers, target, currentSum - numbers[idx], idx+1);

        return plus + minus;
    }
}
