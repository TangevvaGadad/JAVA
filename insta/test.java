public class test {
    static void fun(int n) {
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if(i+j==n-1)
                    System.out.print("/");
                else
                    System.out.print(" ");

            }
            System.out.print(" ");

            for (int j = 0; j < n; j++) {
                if(i-j==0)
                    System.out.print("\\");
                else
                    System.out.print(" ");

            }
            System.out.print(" ");
                        for (int j = 0; j < n; j++) {
                if(i+j==n-1)
                    System.out.print("/");
                else
                    System.out.print(" ");

            }
                        for (int j = 0; j < n; j++) {
                if(i-j==0)
                    System.out.print("\\");
                else
                    System.out.print(" ");

            }


            System.out.println();
        }
    }
public static void main(String[] args) {
int n=15;
fun(n);
}
} 
            //     A
            //   A B C
            // A B C D E