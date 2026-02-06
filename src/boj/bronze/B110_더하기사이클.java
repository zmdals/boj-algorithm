package boj.bronze;

import java.util.Scanner;

public class B110_더하기사이클 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        //정수 n = 0보다 크거나 같고, 99보다 작거나 같은 정수
        //먼저 주어진 수가 10보다 작다면 앞에 0을 붙여 두 자리 수로 만들고
        //각 자리의 숫자를 더한다
        //주어진 수의 가장 오른쪽 자리 수와 앞에서 구한 합의 가장 오른쪽 자리 수를 이어 붙인 새로운 수
        //예시: 26부터 시작한다. 2+6 = 8

        int n = sc.nextInt();
        int newNum = n;
        int cnt = 0;

        //10의 자리: newNum/10, 1의자리: n - (10의자리 * 10) = newNum % 10
        while (true){
            int tens = getTens(newNum);
            int ones = getOnes(newNum);
            int sum = tens + ones;
            newNum = (ones*10) + (sum % 10);
            cnt++;
            if(newNum == n) {
                break;
            }
        }
        System.out.println(cnt);
    }
    static int getOnes(int num){
        //나는 이렇게 했지만 사실.. %를 쓰면 더 쉽다.
        //int tens = num / 10;
        //int ones = num - (tens*10);
        int ones = num % 10;
        return ones;
    }
    static int getTens(int num){
        int tens = num / 10;
        return tens;
    }
}
