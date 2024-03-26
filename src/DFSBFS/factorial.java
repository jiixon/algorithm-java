package DFSBFS;

public class factorial {
    //n! 구현하기
    public static int factorial(int num){
        if (num == 1 || num == 0) return 1;
        else{
            return num*factorial(num-1);
        }
    }

    public static int factorialRecursive(int n) {
        if(n<=1) return 1;
        else return n * factorialRecursive(n-1);

    }

    public static void main(String[] args) {
        System.out.println("반복적 구현: " + factorial(5));
        System.out.println("반복적 구현: " + factorialRecursive(5));
    }
}
