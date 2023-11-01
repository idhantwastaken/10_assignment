import java.util.Scanner;

class SQ4 {
    static void m() {
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Enter a number and how many times you want to run");
        int a = sc.nextInt();
        int n = sc.nextInt();

        double S = 0;
        int b = 1;
        for(int i = 1;i <= n;i++){
            int nf = 1;
            for (int j = 1; j <= i/2; j++) {
                if (i % j == 0)
                    nf++;
            }
            System.out.println(nf+" "+i);
            if (nf == 2) {
                S = S + (i / Math.pow(a, b));
                b++;
            }
        }
        System.out.println(S);
    }
}