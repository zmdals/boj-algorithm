package boj.bronze;

import java.util.Scanner;

public class B4153_직각삼각형 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        //한변 < 30,000
        //직각 = right 아니면 wrong
        //마지막은 0 0 0 종료
        boolean pita;
        while (true){
            int a = sc.nextInt();
            int b = sc.nextInt();
            int c = sc.nextInt();
            int aS = a*a;
            int bS = b*b;
            int cS = c*c;
            if(a == 0 && b == 0 && c == 0) return;
            if(aS == bS+cS) System.out.println("right");
            else if(bS == aS+cS) System.out.println("right");
            else if(cS == aS+bS) System.out.println("right");
            else System.out.println("wrong");
        }
    }
}
