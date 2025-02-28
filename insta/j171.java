public class j171 {
    static void fun(int n) {
        for (int i = 0; i < n; i++) {
            int limit;

            if (i < n / 2) {
                limit = i + 1;  
            } else {
                limit = n - i; 
            }
            for (int j = 0; j < limit; j++) {
                System.out.print("*"+ " ");
            }

            System.out.println();
        }
    }
public static void main(String[] args) {
int n=9;
fun(n);
}
}
