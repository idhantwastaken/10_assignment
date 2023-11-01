import java.util.Scanner;

class Q2 {
    static void m() {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter 1 to find the volume of a cuboid\nEnter 2 to find the volume of a cylinder\nEnter 3 to find the volume of a cone");
        int ch = sc.nextInt();

        switch (ch) {
            case 1:
                System.out.println("Enter the length,breadth and height of the cuboid");
                double l = sc.nextDouble();
                double b = sc.nextDouble();
                double hcu = sc.nextDouble();

                double Vcu = l * b * hcu;
                System.out.println("The volume of the cuboid is :" + Vcu);
                break;
            case 2:
                System.out.println("Enter the radius and height of the cylinder");
                double rcy = sc.nextDouble();
                double hcy = sc.nextDouble();

                double Vcy = Math.PI * Math.pow(rcy, 2) * hcy;
                System.out.println("The Volume of the cylinder is:" + Vcy);
                break;
            case 3:
                System.out.println("Enter the radius and height of the cone");
                double rco = sc.nextDouble();
                double hco = sc.nextDouble();

                double Vco = (1 / 3) * Math.PI * Math.pow(rco, 2) * hco;
                System.out.println("The Volume of the cone is:" + Vco);
                break;
            default:
                System.out.println("Invalid Option");
        }
    }
}