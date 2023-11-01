import java.util.Scanner;

class SQ2 {
    static void m(){
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter 1 to print the sum of series a\nEnter 2 to print the series b");
        int ch = sc.nextInt();

        switch (ch) {
            case 1:
                double S=0;
                for (int i = 1; i <= 20; i++) {
                    if (i % 2 == 0)
                        S -= Math.pow(2, i);
                    else
                        S += Math.pow(2, i);
                }
                System.out.println("The sum of the series a is :" + S);
                break;
            case 2:
                int a = 1;
                for (int i = 1; i <= 5; i++) {
                    a = (a * 10) + 1;                    
                    System.out.print(a + ",");
                }
                break;
            default:
                System.out.println("Invalid Option");
        }
    }
}