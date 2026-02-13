package boj.bronze;

import java.util.Scanner;

public class B2798_블랙잭 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        //카드 개수 = N,
        //3카드의 합이 가장 큰 값중 M보다 작거나 같음

        int N = sc.nextInt();
        int target = sc.nextInt();
        int[] arr = new int[N];
        //배열값 추가
        for(int i = 0; i < arr.length; i++){
            arr[i] = sc.nextInt();
        }
        //비교
        int max = 0;
        for(int i = 0; i < N; i++){
            for(int j = i+1; j < N; j++){
                for(int k = j+1; k < N; k++){
                    int a = arr[i];
                    int b = arr[j];
                    int c = arr[k];
                    int sum = a+b+c;
                    if(sum <= target && sum > max){
                        max = sum;
                    }
                }
            }
        }
        System.out.println(max);
    }
}
