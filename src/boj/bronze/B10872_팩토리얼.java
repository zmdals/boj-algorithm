package boj.bronze;

import java.util.Scanner;

public class B10872_팩토리얼 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int factorial = 1; //0이면 결과는 무조건 0
        for (int i = N; i > 0; i--){
            factorial *= i;
        }
        System.out.println(factorial);
    }
}
