import java.util.Scanner;

public class Baekjoon_10809 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.next();

        int[] alpha = new int[26];

        for(int i=0; i<alpha.length; i++){
            alpha[i] = -1;
        }

        for(int i=0; i<s.length(); i++){
            char c = s.charAt(i);

            if (alpha[c - 'a'] == -1){
                alpha[c-'a'] = i;
            }
        }

        for(int val : alpha){
            System.out.print(val + " ");
        }

    }

}
