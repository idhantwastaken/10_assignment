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
        FQ1 obj = new FQ1();

        System.out.println("Enter the radius of the sphere");
        double r = sc.nextDouble();
        System.out.println("Volume of the sphere :" + obj.volume(r));

        System.out.println("Enter the height and radius of the cylinder");
        double h = sc.nextDouble();
        r = sc.nextDouble();
        System.out.println("Volume of the cylinder :"+obj.volume(h,r));

        System.out.println("Enter the length, breadth and height of the cuboid");
        double l = sc.nextDouble();
        double b = sc.nextDouble();
        h = sc.nextDouble();
        System.out.println("Volume of the cuboid :" + obj.volume(l, b, h));

    }
}