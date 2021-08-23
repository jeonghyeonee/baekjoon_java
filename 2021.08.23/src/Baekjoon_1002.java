import java.util.Scanner;

public class Baekjoon_1002 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int t = sc.nextInt();

        for(int i=0; i<t; i++){
            int x1= sc.nextInt(), y1 = sc.nextInt(), r1 = sc.nextInt();
            int x2= sc.nextInt(), y2 = sc.nextInt(), r2 = sc.nextInt();

            double d = Math.sqrt(Math.pow((x1-x2),2) + Math.pow((y1-y2),2));

            if(d==0 && r1==r2) System.out.println(-1);
            else if (Math.abs(r1-r2) == d || r1+r2 == d) System.out.println(1);
            else if (Math.abs(r1-r2)<d && d <Math.abs(r1+r2)) System.out.println(2);
            else System.out.println(0);
            
        }
    }
}
