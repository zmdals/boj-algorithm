package boj.bronze;

import java.util.Scanner;

public class B2920_음계 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] arr = new int[8];
        boolean isAsc = true;
        boolean isDes = true;
        //입력값 배열
        for (int i = 0; i < 8; i++){
            arr[i] = sc.nextInt();
        }

        for (int i = 0; i < arr.length; i++){
            if(arr[i] != i+1) {
                isAsc = false;
            }
            if(arr[i] != arr.length-i) {
                isDes = false;
            }
        }

        if (isAsc){
            System.out.println("ascending");
        } else if (isDes) {
            System.out.println("descending");
        } else {
            System.out.println("mixed");
        }
    }
}
