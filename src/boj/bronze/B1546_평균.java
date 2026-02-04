package boj.bronze;

import java.util.Scanner;

public class B1546_평균 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] scores = new int[n];
        int max = 0;
        //배열 값 추가.
        for (int i = 0; i < scores.length; i++){
            scores[i] = sc.nextInt();
            //최댓값 저장.
            if(scores[i] > max){
                max = scores[i];
            }
        }

        double sum = 0;
        double newScore;

        //점수 변경.
        for (int score : scores){
            newScore = ((double) score / max) * 100;
            sum += newScore;
        }
        double avg = sum / n;
        System.out.println(avg);

    }
}
