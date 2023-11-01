import java.util.Scanner;

class LQ5 {
    static void m() {

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter a number");
        int n = sc.nextInt();

        int temp = n,S=0;
        while (temp != 0) {
            int ld = temp % 10;
            S = S + ld;
            temp /= 10;
        }
        if (S == Math.cbrt(n))
            System.out.println(n + " is a Dudeney number");
        else
            System.out.println(n+" is not a Dudeney number");
    }
}
