import java.util.Scanner;

class Q1{
    static void m(){
        Scanner sc=new Scanner(System.in);

        System.out.println("Enter the angles of the triangle");
        int a=sc.nextInt();
        int b=sc.nextInt();
        int c=sc.nextInt();

        int l = Math.max(Math.max(a, b), c);

        if (a + b + c == 180) {
            if (l < 90)
                System.out.println("The triangle is an acute-angled triangle");
            if (l > 90)
                System.out.println("The triangle is an obtuse-angled triangle");
            if (l == 90)
                System.out.println("The triangle is a right-angled triangle");
        }
        else
            System.out.println("The triangle is not possible");
    }
}