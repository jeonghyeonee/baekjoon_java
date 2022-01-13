import java.util.Scanner;

public class Baekjoon_5622 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        char[] s = sc.next().toCharArray();
        String[] a = {"ABC", "DEF","GHI","JKL","MNO","PQRS","TUV","WXYZ"};

        int t = 0;

        for(char c: s){
            for(int i=0; i<a.length; i++){
                for(int j=0; j<a[i].length(); j++){
                    if(c == a[i].charAt(j)){
                        t+= 2 + i + 1;
                    }
                }
            }
        }

        System.out.println(t);
    }
}
