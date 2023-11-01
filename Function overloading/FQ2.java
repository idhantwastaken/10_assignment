import java.util.Scanner;

class FQ2 {
    void check(String str, char ch) {
        int l = str.length();

        int ctr = 0;
        for (int i = 0; i < l; i++) {
            char a = str.charAt(i);
            if (a == ch) {
                ctr++;
            }
        }
        System.out.println("No. of " + ch + "is :" + ctr);
    }

    static void m() {
        Scanner sc = new Scanner(System.in);
        FQ2 obj = new FQ2();
        obj.check("Hello",'l');
    }
}
