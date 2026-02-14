package boj.bronze;

import java.util.Scanner;

public class B3052_나머지 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        //42로 나눈 나머지는 0~41 42개.
        //입력 10개, 서로다른값 몇개.
        int[] arr = new int[42];
        for (int i = 0; i < 10; i++){
            int num = sc.nextInt() % 42;
            arr[num]++;
        }
        int cnt = 0;
        for (int i : arr) {
            if(i > 0) cnt++;
        }
        System.out.println(cnt);
    }
}
