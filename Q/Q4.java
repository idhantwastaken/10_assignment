import java.util.Scanner;

class Q4 {
    static void m() {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter your name");
        String nm1 = sc.next();
        String nm2 = sc.next();
        System.out.println("Enter your age");
        int age = sc.nextInt();

        if (age > 60) 
            System.out.println("Wrong Category");
        else {
            System.out.println("Enter your taxable income");
            int TI = sc.nextInt();

            double tax;

            if (TI <= 250000) {
                tax = 0;
            } else if (TI <= 500000) {
                tax = (TI - 160000) * 10 / 100;
            } else if (TI <= 1000000) {
                tax = (TI - 500000) * 20 / 100 + 34000;
            } else {
                tax = (TI - 1000000) * 30 / 100 + 94000;
            }

            System.out.println("------------------------------------------------------");
            System.out.println("Name :" + nm1 + " " + nm2);
            System.out.println("Payable income tax :Rs." + tax);
        }
    }
}