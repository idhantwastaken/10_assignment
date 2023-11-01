class PQ3 {
    static void m() {
        int a;
        for (int i = 1; i <= 5; i++) {
            a = i;
            for (int j = 1; j <= i; j++) {
                System.out.print(a+" ");
                a--;
            }
            System.out.println();
        }
    }
}