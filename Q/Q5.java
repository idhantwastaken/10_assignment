import java.util.Scanner;

class Q5 {
    static void m() {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter your name");
        String nm1 = sc.next();
        String nm2 = sc.next();
        System.out.println("Enter the amount");
        int amt = sc.nextInt();
        System.out.println("Enter 'L' to purchase a laptop\nEnter 'D' to purchase a desktop");
        String ch = sc.next();

        double disc = 0;

        switch (ch) {
            case "L":
                if (amt <= 25000) {
                    disc = 0;
                } else if (amt <= 50000) {
                    disc = amt * 5 / 100;
                } else if (amt <= 100000) {
                    disc = amt * 7.5 / 100;
                } else {
                    disc = amt * 10 / 100;
                }
                break;
            case "D":
                if (amt <= 25000) {
                    disc = amt * 5 / 100;
                } else if (amt <= 50000) {
                    disc = amt * 7.5 / 100;
                } else if (amt <= 100000) {
                    disc = amt * 10 / 100;
                } else {
                    disc = amt * 15 / 100;
                }
                break;
            default:
                System.out.println("Invalid option");
                System.exit(0);
        }
        double net_amt = amt - disc;

        System.out.println("---------------------------------------------------");
        System.out.println("Name :" + nm1 + " " + nm2);
        System.out.println("Net amount to be paid :Rs." + net_amt);
    }
}