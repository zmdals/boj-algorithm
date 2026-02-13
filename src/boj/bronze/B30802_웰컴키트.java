package boj.bronze;

import java.util.Scanner;

public class B30802_웰컴키트 {
    public static void main(String[] args) {
        //참가자수 N, 티 묶음단위 T, 펜묶음단위 P
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int[] tShirts = new int[6];
        //사이즈별 갯수
        for (int i = 0; i < tShirts.length; i++){
            tShirts[i] = sc.nextInt();
        }
        int tGroup = sc.nextInt();
        int pGroup = sc.nextInt();
        int tSum = 0;
        for (int tShirt : tShirts) {
            tSum += (tShirt + (tGroup -1)) / tGroup;
        }
        System.out.println(tSum);
        System.out.print(N/pGroup + " " + N%pGroup);

        //티셔츠는 각 사이즈별 사이즈/T의 올림.
        //N / P 랑  N % P
    }
}
