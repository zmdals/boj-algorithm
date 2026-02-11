package boj.bronze;

import java.util.Scanner;

public class B10809_알파벳찾기 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        int[] arr = new int[26];
        //배열 -1 채우기
        //Arrays.fill(arr, -1); //로도 가능하다.
        for(int i = 0; i< arr.length; i++) arr[i] = -1;
        //문자열 탐색
        //char[] chars = str.toCharArray(); //로도 가능.
        for (int i = 0; i < str.length(); i++){
            int n = str.charAt(i) - 'a';//지금 알파벳의 순서, i번째 발견.
            //이미 발견된거면 패스 아니면 추가
            if(arr[n] == -1) arr[n] = i;
        }
        for (int i : arr) {
            System.out.print(i + " ");
        }
    }
}
