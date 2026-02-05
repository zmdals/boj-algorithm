package boj.bronze;

import java.util.Scanner;

public class B13458_시험감독 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        //i번 시험장에 있는 응시자의 수는 Ai
        //감독관은 총감독관과 부감독관으로 두 종류
        //총감독관은 한 시험장에서 감시할 수 있는 응시자의 수가 B명
        //부감독관은 한 시험장에서 감시할 수 있는 응시자의 수가 C명
        //각 시험장마다 응시생을 모두 감독하기 위해 필요한 감독관의 최소 수를 출력한다.
        int N = sc.nextInt();
        int[] students = new int[N]; //각 시험장 학생 수
        for (int i = 0; i < N; i++){
            students[i] = sc.nextInt();
        }
        int B = sc.nextInt();
        int C = sc.nextInt();
        //max case: 시험장(N) 1,000,000개, 필요 감독관 (cnt) 1,000,000 명 일때,
        //totalSum은 1,000,000 * 1,000,000을 저장할 수 있어야함. -> long타입 사용
        long totalSum = 0L;

        for (int student : students){
            //총 감독관 배치
            int leftStudents = student-B;
            int cnt = 1;
            if (leftStudents > 0) {
                //(a + (b - 1)) / b : 소숫점올림
                //a: 나눠지는 값, b: 나눌 값
                //나눠지는 값에 (b-1)값을 더해서 소숫점 올림으로 몫을 표현.
                cnt += (leftStudents + (C - 1)) / C;

            }
            totalSum += cnt;
        }
        System.out.println(totalSum);
    }
}
