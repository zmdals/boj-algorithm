package boj.bronze;

import java.util.Scanner;

public class B2231_분해합 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        //N(1 ≤ N ≤ 1,000,000)
        int N = sc.nextInt();
        int cnt = 0;
        int result = 0;
        while (cnt <= N){
            int sum = 0;
            String num = Integer.toString(cnt);
            for (int i = 0; i < num.length(); i++){
                sum += num.charAt(i) -'0';
            }
            sum += cnt;
            if (sum == N) {
                result = cnt;
                break;
            }
            cnt++;
        }
        System.out.println(result);
    }
}
