import java.util.Scanner;

class FQ1{
    double v;
    double volume(double r) {
        v = 4 / 3 * Math.PI * Math.pow(r, 3);
        return v;
    }

    double volume(double h, double r) {
        v = Math.PI * Math.pow(r, 2) * h;
        return v;
    }

    double volume(double l, double b,double h) {
        v = l * b * h;
        return v;
    }

    static void m(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the radius of the sphere");

        System.out.println("Enter the height and radius of the cylinder");
        System.out.println("Enter the length, breadth and height of the cylinder");
    }
}