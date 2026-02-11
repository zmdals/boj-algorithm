package boj.bronze;

import java.util.Scanner;

public class B10250_ACM호텔 {
    public static void main(String[] args) {
        //W 개의 방, H 층 건물
        //방 번호는 YXX 나 YYXX 형태인데 여기서 Y 나 YY 는 층 수를 나타내고
        //XX 는 엘리베이터에서부터 세었을 때의 번호
        //걷는 거리가 같을 때에는 아래층의 방을 더 선호
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        //h = 층, w = 호 수 , n 번째손님 방
        //그리고 x가 10보다 작으면 앞에 0붙이기
        for (int i = 0; i < T; i++){
            int Y = 0;
            int X = 0;
            String roomNum = "";
            int H = sc.nextInt();
            int W = sc.nextInt();
            int N = sc.nextInt();

            //y = n % h . 단 0이면 그냥 h
            Y = N%H == 0 ? H : N%H;

            //x = n / h +1. 단 n%h=0 면 그냥 n/h
            X = N%H == 0 ? N/H : N/H+1;

            //호수가 10보다 작으면 0 삽입.
            roomNum = X < 10 ? Y+"0"+X : Y+""+X;
            System.out.println(roomNum);
        }
    }
}
