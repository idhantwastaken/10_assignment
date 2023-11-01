class PQ4 {
    static void m() {
        for (int i = 1; i <= 6; i++) {
            char a = 'A';
            for (int j = 5; j >= i; j--) {
                System.out.print(" ");
            }
            for (int k = 1; k <=i ; k++) {
                System.out.print(a+"  ");
                a++;
            }
            System.out.println();
        }
    }
}
