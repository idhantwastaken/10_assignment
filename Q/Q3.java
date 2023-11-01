import java.util.Scanner;

class Q3 {
    static void m() {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the name of the policy holder");
        String nm1 = sc.next();
        String nm2 = sc.next();
        System.out.println("Enter the sum assured");
        int sum = sc.nextInt();
        System.out.println("Enter the first annual premium");
        int premium = sc.nextInt();

        double disc_amt, comm_amt;
        if (sum <= 100000) {
            disc_amt = premium * 5 / 100;
            comm_amt = sum * 2 / 100;
        } else if (sum <= 200000) {
            disc_amt = premium * 8 / 100;
            comm_amt = sum * 3 / 100;
        } else if (sum <= 500000) {
            disc_amt = premium * 10 / 100;
            comm_amt = sum * 5 / 100;
        } else {
            disc_amt = premium * 15 / 100;
            comm_amt = sum * 7.5 / 100;
        }

        System.out.println("------------------------------------------------------");
        System.out.println("Name of the policy holder :" + nm1+" " + nm2);
        System.out.println("Sum assured :Rs." + sum);
        System.out.println("Premium :" + premium);
        System.out.println("Discount on first premium :Rs."+disc_amt+"\tCommission of the agent :Rs."+comm_amt);
    }
}