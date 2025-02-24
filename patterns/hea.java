public class hea
{
static void fun(int n){
for(int i=0;i<n;i++){
for(int j=0;j<n;j++){
                if (
                    (i > 0 && i <= n / 4 && (j == n / 4 + i || j == 3 * n / 4 - i))||(j==0 && i<=n/2)||(j==n-1 && i<=n/2)||(i==0 && (j<=n/4))||(i==0 && j>=3*n/4)||(i-j==n/2)||(i+j==3*n/2-1)||(i+j==2*n/4 && j>=3*n/4))

                System.out.print("*");
else
System.out.print(" ");
}
System.out.println();
}
return;
}
public static void main(String[] args) {
int n=21;
fun(n);
}
}
//if((j==0 && i<=n/2)||(j==n-1 && i<=n/2)||(i==0 && (j<=n/4))||(i==0 && j>=3*n/4)||(i-j==n/2)||(i+j==3*n/2-1)||(i+j==2*n/4 && j>=3*n/4))
