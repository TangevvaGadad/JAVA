public class j12 {
    static void fun(int n) {
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n - i - 1; j++) {
                System.out.print("  "); 
            }

            for (int j = 0; j < 2 * i + 1; j++) {
                System.out.print((char) (65 + j) + " ");
            }


            System.out.println();
        }
    }
public static void main(String[] args) {
int n=5;
fun(n);
}
} 
            //     A
            //   A B C
            // A B C D E