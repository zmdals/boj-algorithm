package boj.bronze;

import java.util.Scanner;

public class B10818_최소최대 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt(); //정수의 개수
        int max = -1000001; //최소범위
        int min = 1000001; //최대범위
        //min과 max를 가장 처음 들어오는 숫자의 값으로 두는게 더 나았을거같다.
        //max = sc.nextInt();
        //min = sc.nextInt();
        for (int i = 0; i < N; i++){
            int num = sc.nextInt();
            if (num > max){
                max = num;
            }
            if (num < min){
                min = num;
            }
        }
        System.out.println(min + " " + max);
    }
}
