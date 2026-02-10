package boj.bronze;

import java.util.Scanner;

public class B2577_숫자의개수 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int A = sc.nextInt();
        int B = sc.nextInt();
        int C = sc.nextInt();
        int[] arr = new int[10];
        String num = "" + A*B*C;
        for (int i = 0; i < num.length(); i++){
            int n = num.charAt(i) - '0';
            arr[n]++;
        }
        for (int i : arr) {
            System.out.println(i);
        }
    }
}
