package BasicPatterns;

public class PatternD {
    public static void main(String[] args) {
        int n=6;
        for (int i= 1; i<=n; i++) {
            int p=1;
            for (int j= 1; j<=i; j++){
                System.out.print(" "+" ");
            }
            for (int j=i;j<=n;j++){
                System.out.print(p++ +" ");
            }
            System.out.println();
        }

    }
}
