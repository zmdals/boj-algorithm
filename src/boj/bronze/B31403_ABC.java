package boj.bronze;

import java.util.Scanner;

public class B31403_ABC {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int A = sc.nextInt();
        int B = sc.nextInt();
        int C = sc.nextInt();

        //문자열 + 숫자형 = 문자열
        String strA = Integer.toString(A);
        String strB = Integer.toString(B);

        //int
        System.out.println(A+B-C);
        //String
        System.out.println(Integer.parseInt(strA+strB) - C);
        //System.out.println(Integer.parseInt("" + A + B) - C); //이런식으로도 가능
    }
}
