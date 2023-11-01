class SQ5 {
    static void m() {
        int a = 0;
        for (int i = 1; i <= 19; i += 2) {
            a++;
            if (a % 2 == 0)
                System.out.print("-" + i+",");
            else
                System.out.print(i+",");
        }
    }
}