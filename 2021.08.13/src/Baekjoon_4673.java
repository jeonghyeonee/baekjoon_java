public class Baekjoon_4673 {
    public static void main(String[] args) {
        boolean[] Remove = new boolean[10001];

        for (int i = 1; i <= 10000; ++i) {
            int dn = Dn(i);
            if (dn <= 10000) {
                Remove[dn] = true;
            }
        }
        for (int i = 1; i < Remove.length; ++i) {
            if (!Remove[i]) {
                System.out.println(i);
            }
        }
    }
    private static int Dn(int n){
        int dn = n;
        while(n>0){
            dn += n%10;
            n /= 10;
        }
        return dn;
    }
}
