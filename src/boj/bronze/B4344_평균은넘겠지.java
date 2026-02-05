package boj.bronze;

import java.util.Scanner;

public class B4344_평균은넘겠지 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        //테스트케이스 개수 = c
        int c = sc.nextInt();
        for (int i = 0; i < c; i++) {
            int N = sc.nextInt(); //학생 수
            int[] scores = new int[N];
            int sum = 0;
            for (int j = 0; j < scores.length; j++) {
                scores[j] = sc.nextInt();
                sum += scores[j];
            }
            double average = (double) sum / N; //반 평균
            int cnt = 0;
            double rate = 0.0;
            for (int score : scores) {
                //평균보다 높다면
                if (score > average) {
                    cnt++;
                }
            }
            rate = ((double) cnt / N) * 100;
            System.out.printf("%.3f%%\n", rate);
        }
    }
}
