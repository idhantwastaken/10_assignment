import java.util.Scanner;

class SQ1 {
    static void m() {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter a number and how many times you want to run");
        int x = sc.nextInt();
        int n = sc.nextInt();

        double S = 0;
        int a = 0, b = 1, c = 1,F;
        for (int i = 1; i <= n; i++) {
            a++; b++;c++;F = 1;
            for (int j = 1; j <= c; j++) {
                F = F * j;
            }
            if (i == 1)
                S = S + 1;
            else
                S = S + (double)(a * x + b)/F;
        }
        System.out.println(S);
    }
}
