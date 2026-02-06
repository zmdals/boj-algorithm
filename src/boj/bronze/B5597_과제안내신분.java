package boj.bronze;

import java.util.Scanner;
//구현
public class B5597_과제안내신분 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        boolean[] checks = new boolean[31]; //check[30] 이라면 31번째 값이기 때문에.
        //28개의 입력
        for (int i = 0; i < 28; i++){
            int n = sc.nextInt();
            //n번째 boolean = true
            checks[n] = true;
        }
        for (int i = 1; i < checks.length; i++){
            if (checks[i] == false){
                System.out.println(i);
            }
        }
    }
}
