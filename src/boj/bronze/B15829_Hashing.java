package boj.bronze;

import java.util.Scanner;

public class B15829_Hashing {
    public static void main(String[] args) {
        //abba"은 수열 1, 2, 2, 1로 나타낼 수 있다.
        //예제 2: zzz의 해시 값은 26 × 31^0 + 26 × 31^1 + 26 × 31^2 = 26 + 806 + 24986 = 25818이다.
        //문자열의 번호 * 31^0제곱을 계속 더함. 카운트 늘때마다 그만큼 더 곱하기.
        Scanner sc = new Scanner(System.in);
        int L = sc.nextInt();
        sc.nextLine();
        String str = sc.nextLine();
        int M = 1234567891;
        Long sum = 0L;

        int power = 1; //31^0
        for (int i = 0; i < L; i++) {
            int n = (str.charAt(i)-'a') + 1;
            sum += n * power;
            power = power * 31;
        }
        System.out.println(sum % M);
    }
}
