 import java.util.Scanner;

class Q6 {
    static void m() {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter a number");
        int n = sc.nextInt();
        System.out.println("Enter 1 to check for Magic number\nEnter 2 to check for Buzz number");
        int ch = sc.nextInt();

        switch (ch) {
            case 1:
                int sd;
                int j = 0, a = n, ctr, temp;

                do {
                    temp = a; ctr = 0;
                    do {
                        ctr++;
                        temp = temp / 10;
                    } while (temp != 0);
                    sd = 0;
                    for (int i = 1; i <= ctr;i++) {
                        int ld = a % 10;
                        sd += ld;
                        a /= 10;
                    }
                    a = sd;
                    j++;
                } while (j <= ctr);
                if(sd==1)
                    System.out.println(n + " is a magic number");
                else
                    System.out.println(n + " is not a magic number");
                break;
            case 2:
                if (n % 10 == 7 || n % 7 == 0)
                    System.out.println(n + " is a buzz number");
                else
                    System.out.println(n + " is not a buzz number");
                break;

        }
    }
}