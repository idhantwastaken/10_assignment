import java.util.Scanner;

class LQ2 {
    static void m() {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter any number");
        int n = sc.nextInt();

        int temp = n;
        double S = 0;

        int nd = 0;
        do {
            temp = temp / 10;
            nd++;
        } while (temp != 0);
        temp = n;
        while (temp > 0) {
            int fd = temp % 10;
            S = S + Math.pow(fd, nd);
            temp /= 10;
        }
        if (n == S)
            System.out.println(n + " is an Armstrong number");
        else
            System.out.println(n + " is not an Armstrong number");
    }
}