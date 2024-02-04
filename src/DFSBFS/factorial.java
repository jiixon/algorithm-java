package DFSBFS;

public class factorial {
    //n! 구현하기
    public static int factorialIterative(int n) {
        int result = 1;
        for (int i = 1; i <= n; i++) {
            result *= i;
        }
        return result;
    }

    public static int factorialRecursive(int n) {
        if(n<=1) return 1;
        else return n * factorialRecursive(n-1);

    }

    public static void main(String[] args) {
        System.out.println("반복적 구현: " + factorialIterative(5));
        System.out.println("반복적 구현: " + factorialRecursive(5));
    }
}
