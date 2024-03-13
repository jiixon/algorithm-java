package 구현;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class 에라토스테네스의체 {
    public static int[] array;
    public static int n,m;
    public static void eratosthenesSieve(){
        array = new int[n+1];

        //1. 배열을 숫자로 전부 채운다
        for(int i=2; i<=n; i++){
            array[i] = i;
        }

        //2. 자기 자신을 제외한 배수들을 '0'으로 삭제한다
        for(int i=2; i<=n; i++){
            //0인것은 이미 소
            if(array[i] == 0) continue;

            // j 초기값은 i+i로 자기 자신을 제외하고 j += i 로 j의 배수를 지정한다.
            for(int j = i+i; j<=n; j+=i){
                array[j] = 0;
            }
        }
    }
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        m = Integer.parseInt(br.readLine());
        n = Integer.parseInt(br.readLine());

        ArrayList<Integer> primes = new ArrayList<>();
        array = new int[n+1];
        eratosthenesSieve();

        long sum = 0;
        for(int i=m; i<=n; i++){
            if(array[i]!=0) primes.add(array[i]); // 함수 호출 후 M~N에 속해있는 소수 ArrayList 추가
        }

        if(primes.isEmpty()) System.out.println(-1);
        else{
            for(int i: primes) sum+=i;
            System.out.println(sum);
            System.out.println(primes.get(0));
        }
    }
}
