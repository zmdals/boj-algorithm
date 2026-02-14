package boj.bronze;

import java.util.Scanner;

public class B10813_공바꾸기 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        //바구니를 총 N개
        //바구니 번호 1~N
        //바구니당 공 한개, 첫번호는 바구니번호=공번호
        //M - 공 바꾸는횟수
        //for문 i < M, N크기 배열
        int N = sc.nextInt();
        int M = sc.nextInt();

        int[] baskets = new int[N];
        for (int i = 0; i < baskets.length; i++){
            baskets[i] = i + 1;
        }
        for (int i = 0; i < M; i++){
            int a = sc.nextInt();
            int b = sc.nextInt();
            //a,b 공 바꾸기
            int temp = baskets[a-1];
            baskets[a-1] = baskets[b-1];
            baskets[b-1] = temp;
        }
        for (int i = 0; i < baskets.length; i++){
            System.out.print(i!=baskets.length-1 ? baskets[i] +" ": baskets[i]);
        }
    }
}
