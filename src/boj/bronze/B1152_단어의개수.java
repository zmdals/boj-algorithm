package boj.bronze;

import java.util.Scanner;

public class B1152_단어의개수 {
    public static void main(String[] args) {
        //다른풀이1:
        //"공백 → 문자로 바뀌는 순간"을 세는 게 더 깔끔하다.
        //chatAt(i)를 사용하여 cur == ' ' 비교하면 더 가볍고 빠르다.
        //String cur = sentence.substring(i,i+1); 이건 매번 새 문자열 객체를 만든다.

        Scanner sc = new Scanner(System.in);
        String sentence = sc.nextLine();
        String prevLetter = " ";
        int cnt = 0;

        for(int i = 0; i < sentence.length(); i++){
            String cur = sentence.substring(i,i+1);
            //전 문자가 공백이 아니고 현재 문자가 공백이면 = 한 단어 = cnt++;
            if(!prevLetter.equals(" ") && cur.equals(" ")) {
                cnt++;
            }
            //마지막 단어 처리. 문자열이 빈 문자열이 아니면 cnt++;
            if(!cur.equals(" ") && (i+1) == sentence.length()){
                cnt++;
            }
            prevLetter = cur;
        }
        System.out.println(cnt);

        //다른 풀이2:
        //Scanner의 hasNext() - 다음 입력값이 있으면 true, 아니면 false
        //를 사용했으면 아마 더 쉽게 풀 수 있었을거 같다.
        //while(sc.hasNext()) 이런식으로?
        //next()는 공백단위로 단어를 받기에 cnt로 카운팅만 해주면 된다.
    }
}
