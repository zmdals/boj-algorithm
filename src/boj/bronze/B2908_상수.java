package boj.bronze;

import java.util.Scanner;

public class B2908_상수 {
    public static void main(String[] args) {
        //입력: 세 자리수 두개
        //숫자를 거꾸로 읽음. 734, 893 -> 437, 398
        //두 숫자 중 큰 숫자 출력
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        a = reverseNum(a);
        b = reverseNum(b);
        if (a > b){
            System.out.println(a);
            return;
        }
        System.out.println(b);
    }

    public static int reverseNum(int num){
        int huns = (num / 100) % 100; //100의자리
        int tens = (num / 10) % 10; //10의자리
        int ones = num % 10; //1의자리
        return (ones*100) + (tens*10) + huns;
    }

}
