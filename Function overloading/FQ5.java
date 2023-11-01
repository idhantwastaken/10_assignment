import java.util.Scanner;

class FQ5 {
    double area(double a, double b, double c) {
        double s = (a + b + c) / 2;
        double ar = Math.sqrt(s * (s - a) * (s - b) * (s - c));
        return ar;
    }

    static void m() {
        Scanner sc = new Scanner(System.in);
        FQ5 obj = new FQ5();

        System.out.println("Enter sides of the triangle");
        double fd = sc.nextDouble();
        double fcvdd = sc.nextDouble();
        double fdsd = sc.nextDouble();

        System.out.println("The area of the triangle is :"+obj.area(fd, fcvdd, fdsd));
    }
}
