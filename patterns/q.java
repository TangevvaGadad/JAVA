public class q
{
static void fun(int n){
for(int i=0;i<n;i++){
for(int j=0;j<n;j++){
if((j==0 && i<=3*n/4)|| i==3*n/4 || (j==n-1 && i<=3*n/4) || i==0 ||(i-j==0 && i>=n/2))
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