package boj.silver;

import java.util.Scanner;

public class B25206_너의_평점은 {

    public static void main(String[] args) {
        //전공평점은 전공과목별 (학점 × 과목평점)의 합을 학점의 총합으로 나눈 값
        //이 문제 조건은 P가 1개이상 보장되지만, 만약 all P라면 divided by 0가 발생할 수도 있다. 예외처리 필요.
        Scanner sc = new Scanner(System.in);
        double credit;
        double sum = 0;
        double creditSum = 0;
        String[] arr;
        for(int i = 0; i < 20; i++){
            arr = sc.nextLine().split(" ");
            if(!arr[2].equals("P")) {
                credit = Double.parseDouble(arr[1]);
                creditSum += credit;
                if(arr[2].equals("A+")) sum += (credit * 4.5);
                else if(arr[2].equals("A0")) sum += (credit * 4.0);
                else if(arr[2].equals("B+")) sum += (credit * 3.5);
                else if(arr[2].equals("B0")) sum += (credit * 3.0);
                else if(arr[2].equals("C+")) sum += (credit * 2.5);
                else if(arr[2].equals("C0")) sum += (credit * 2.0);
                else if(arr[2].equals("D+")) sum += (credit * 1.5);
                else if(arr[2].equals("D0")) sum += (credit * 1.0);
            }
        }
        System.out.printf("%.6f",sum/creditSum);
    }
}
