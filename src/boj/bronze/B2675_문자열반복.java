package boj.bronze;

import java.util.Scanner;

public class B2675_문자열반복 {
    public static void main(String[] args) {
        //문자열 S를 입력받은 후에, 각 문자를 R번 반복해 새 문자열 P를 만든 후 출력
        Scanner sc = new Scanner(System.in);

        int T = sc.nextInt();
        for( int i = 0; i < T; i++){
            //StringBuilder를 T for문안에 두지않으면
            //StringBuilder는 가변(mutable) 객체라서 한번만든 객체에 값을 누적.
            //자동 초기화 X
            StringBuilder sb = new StringBuilder();
            int R = sc.nextInt();
            String str = sc.next();
            String newStr ="";
            for (int j = 0; j < str.length(); j++){
                char c = str.charAt(j);
                for(int k = 0; k < R; k++){
                    //newStr += c; //StringBuilder를 쓰면 더 효율적
                    sb.append(c);
                }
                newStr = sb.toString();
            }
            System.out.println(newStr);
        }
    }
}
