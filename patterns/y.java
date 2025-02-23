public class y
{
static void fun(int n){
for(int i=0;i<n;i++){
for(int j=0;j<n;j++){
if((i+j==2*n/2 && i<=n/2)|| (i-j==0 && i<=n/2)||(j==n/2 && i>=n/2))
System.out.print("*");
else
System.out.print(" ");
}
System.out.println();
}
return;
}
public static void main(String[] args) {
int n=15;
fun(n);
}
}