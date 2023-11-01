import java.util.Scanner;
 
class LQ3 {
    static void m() {
        Scanner sc = new Scanner(System.in);
 
        System.out.println("Enter a number");
        int n = sc.nextInt();
 
        int nf=0;
        for (int i = 1; i <= n; i++) {              //check if n is prime
            if (n % i == 0)
                nf++;
        }
 
        if (nf == 2) {
            int r1 = 0, temp = n;
            while (temp != 0) {                 // Find the reverse of variable n
                int d = temp % 10;
                r1 = r1 * 10 + d;
                temp = temp / 10;
            }
 
            int sq_n = (int) Math.pow(n, 2);
            int sq_r = (int) Math.pow(r1, 2);
 
            int temp2 = sq_n,r2=0;
            while (temp2 != 0) {                 // Find the reverse of square of variable n
                int d = temp2 % 10;
                r2 = r2 * 10 + d;
                temp2 = temp2 / 10;
            }
 
            if (r2 == sq_r)
                System.out.println(n + " is a Prime Adam number");
            else
                System.out.println(n + " is not a Prime Adam number");
        }
        else
            System.out.println(n + " is not a Prime Adam number");
    }
}
 