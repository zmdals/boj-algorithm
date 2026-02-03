package java.bronze;

import java.util.Scanner;

public class B8958_OX퀴즈 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        sc.nextLine();
        //OOXXOXXOOO = 10
        for (int i = 0; i < n; i++){
            String str = sc.nextLine();
            int cnt = 0;
            int sum = 0;
            for (int j = 0; j < str.length(); j++){
                if (str.charAt(j) == 'O'){
                    sum += (1 + cnt);
                    cnt++;
                }
                else {
                    cnt = 0;
                }
            }
            System.out.println(sum);
        }
    }
}