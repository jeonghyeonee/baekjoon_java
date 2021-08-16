import java.util.Scanner;

public class Baekjoon_2908 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n1 = sc.nextInt();
        int n2 = sc.nextInt();

        int n3 = (n1%10)*100 + ((n1/10)%10)*10 +n1/100;
        int n4 = (n2%10)*100 + ((n2/10)%10)*10 +n2/100;


        if(n3>n4){
            System.out.println(n3);
        }
        else{
            System.out.println(n4);
        }


    }
}
