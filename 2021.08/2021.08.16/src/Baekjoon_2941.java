import java.util.Scanner;

public class Baekjoon_2941 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String[] c = {"c=", "c-", "dz=", "d-", "lj", "nj", "s=", "z="};

        String s = sc.next();

        for(int i=0; i<c.length; i++){
            if(s.contains(c[i])){
                s=s.replace(c[i],"*");
            }
        }
        System.out.println(s.length());
    }
}
