package boj.bronze;

import java.util.Scanner;

public class B10988_팰린드롬인지_확인하기 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        int len = str.length(); //length도 계속 호출하지말고 int에 저장 후 사용.
        for (int i = 0; i < len/2; i++){
            //if(str.charAt(i) - str.charAt(str.length()-i-1) != 0) //내가 작성한것: 아래처럼 개선 가능
            if(str.charAt(i) != str.charAt(len-i-1)){
                System.out.println(0);
                return;
            }
        }
        System.out.println(1);
    }
}
