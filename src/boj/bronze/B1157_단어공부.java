package boj.bronze;

import java.util.Scanner;

public class B1157_단어공부 {
    public static void main(String[] args) {
        //첫째 줄에 이 단어에서 가장 많이 사용된 알파벳을 대문자로 출력
        //가장 많이 사용된 알파벳이 여러 개 존재하는 경우에는 ?를 출력
        //단어의 길이는 1,000,000을 넘지 않는다. 대소문자 구분x
        Scanner sc = new Scanner(System.in);
        String str = sc.next().toUpperCase();
        int[] arr = new int[26];
        for(int i = 0; i < str.length(); i++){
            int idx = str.charAt(i) - 'A';
            arr[idx]++;
        }
        int max = 0;
        char c = '?';
        StringBuilder sb = new StringBuilder();
        for(int i = 0; i < arr.length; i++){
            if(arr[i] > max){
                max = arr[i];
                c = (char)(i + 'A');
            } else if (arr[i] == max) {
                c = '?';
            }
        }
        System.out.println(c);

    }
}
