class PQ1 {
    static void m() {
        int b = 1;
        for (int i = 6; i >= 1; i--) {
            int a = 0;
            a += b;
            for (int j = 1; j <= i; j++) {
                System.out.print(a+" ");
                a++;
            }
            b++;
            System.out.println();
        }
    }
}