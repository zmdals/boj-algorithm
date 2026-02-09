package boj.bronze;

import java.util.Scanner;

public class B10811_바구니뒤집기 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt(); //바구니 개수
        int[] baskets = new int[N];
        int M = sc.nextInt(); //역순 횟수

        //바구니 채우기
        for (int i = 1; i <= baskets.length; i++){
            baskets[i-1] = i;
        }

        //바구니 뒤집기
        //while문 i > j보다 커질때까지?
        for (int s = 0; s < M; s++){
            int i = sc.nextInt()-1;
            int j = sc.nextInt()-1;
            while (i < j){
                int temp;
                temp = baskets[i];
                baskets[i] = baskets[j];
                baskets[j] = temp;
                i++;
                j--;
            }
        }
        for (int i = 0; i < baskets.length; i++) {
            if (i == baskets.length-1) {
                System.out.print(baskets[i]);
                return;
            }
            System.out.print(baskets[i] + " ");
        }
    }
}
