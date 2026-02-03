package java.bronze;

import java.util.Scanner;

public class B2562_최댓값 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        //배열 저장
        int[] arr = new int[9];
        for (int i = 0; i < arr.length; i++){
            arr[i] = sc.nextInt();
        }
        //
        int max = arr[0];
        int pos = 0;
        for (int i = 1; i < arr.length; i++){
            if(arr[i] > max){
                max = arr[i];
                pos = i;
            }
        }
        pos = pos + 1;
        System.out.println(max);
        System.out.println(pos);
    }
}
