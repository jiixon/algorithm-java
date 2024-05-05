package 정렬;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.StringTokenizer;


public class sort {
    private static int[] arr;
    public static void radixSort(int[] arr) {
        int max = 0, maxSize = 1;

        //가장 큰수 구하기
        for (int num : arr) {
            if (max < num) max = num;
        }

        //가장 큰수의 자릿수 구해야 그만큼 반복해야함
        while(max>=10){
            maxSize++;
            max/=10;
        }

        //Queue 배열 생성
        LinkedList[] queues = new LinkedList[10]; //0~9로 총 10개
        for(int i = 0; i<=9; i++){
            queues[i] = new LinkedList<>();
        }

        //기수정렬
        int t = 1, index;
        for(int i = 1; i<=maxSize; i++){ //자릿수만큼 전체 for문
            for(int j = 0; j<arr.length; j++){ //배열의 모든 요소 순회
                queues[(arr[j]/t)%10].add(arr[j]); //
                //(arr[j]/t)%10 : 현재 arr[j]의 자릿수 구함 => 195면 5를 구하기(t=1일때 이므로 일의자리수 5)
                //현재 자릿수(t)에 해당하는 숫자를 기준으로 큐에 숫자 추가
            }
            index = 0; //인덱스 0으로 초기화

            //큐를 돌면서 큐에 값이 있을때 그 값을 꺼내서 배열에 저장
            for(int j = 0; j<=9; j++){
                while(!queues[j].isEmpty()){
                    arr[index++] = Integer.parseInt(queues[j].poll().toString());
                }
            }
            t *= 10; //다음 자릿수는 10곱합
        }
    }

    public static void countingSort(int[] arr){
        //최댓값 구해서 배열 설정
        int max = Arrays.stream(arr).max().getAsInt();  //최대값 구함
        int[] cntArr = new int[max + 1];    //카운팅 테이블 생성

        for (int i = 0; i < arr.length; i++) {
            cntArr[arr[i]]++;   //각 값에 대해 해당 카운팅 테이블의 값 수정
        }

        int idx = 0;
        //카운팅 테이블의 값을 뽑아내며 arr 배열에 정렬
        for(int i = 0; i < cntArr.length; i++){
            while(cntArr[i]>0){
                arr[idx++] = i; // cnt[10] = 2 였다면, 10 이라는 값이 두번 나왔으므로 arr[0] = 10, arr[1] = 10 삽입
                cntArr[i] -= 1;
            }
        }
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int size = st.countTokens();
        arr = new int[size];

        //정럴할 수 입력받기
        for (int i = 0; i < size; i++) {
            arr[i] = Integer.parseInt(st.nextToken());
        }

        //버블정렬
        for(int i =0; i<size-1; i++){ //n-1번 작업
            boolean change = false; //요소 위치 변경되었는지 나타내는 변수 위치 변경 안되었다면 이미 정렬이므로 break
            for(int j=0; j<size -1 -i; j++){ //현재 요소와 다음 요소를 비교하여 큰 값을 뒤로 보내기 위한 역할
                if(arr[j]>arr[j+1]){ //첫번째 수가 두번째 수보다 크면 바꾸기
                    change = true;
                    int tmp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = tmp;
                }
            }
            if(!change) break; //위치 변경 안되었다면 이미 정렬이므로 break
        }

        //선택정렬
        for(int i =0; i<size-1; i++){
            int min_index = i; //가장 작은 인덱스 첫번째로 두고 시작

            //가장 작은 수 찾기
            for(int j = i+1; j<size; j++){
                if(arr[min_index]>arr[j]){
                    min_index = j; //j로 작은인덱스 바꾸기
                }
            }

            //가장 작은수랑 i번째 수랑 바꾸기
            int tmp = arr[min_index];
            arr[min_index] = arr[i];
            arr[i] = tmp;

        }

        //삽입정렬
        for (int i = 1; i < size; i++) { //1부터 마지막까지
            int tmp = arr[i]; //1번째 값 tmp 에 넣기
            for(int j = i; j>=0; j--){
                if(j==0){
                    arr[0] = tmp; //앞으로 가면서 전부 확인했지만 맨앞에 숫자를 넣어야함(tmp가 가장 작은수였음)
                }else if(arr[j-1] <= tmp){ //tmp 값이랑 그 이전 값부터 앞으로 비교 -> tmp가 더 큼 == 이미 tmp가 가야할 곳 찾음
                    arr[j] = tmp; //tmp를 현재위치에 저장하고 break
                    break;
                }else{
                    //아직 tmp가 앞으로 더 갈일이 남음 arr[j-1]값을 현재값 arr[j]값으로 덮어씀
                    arr[j] = arr[j-1];
                }
            }
        }

        System.out.println(Arrays.toString(arr));
    }
}
