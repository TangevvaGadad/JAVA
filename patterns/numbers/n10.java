public class n10
{
static void fun(int n){
for(int i=0;i<n;i++){
for(int j=0;j<2*i;j++){
if( (i+j/2==n/2 && i<=n/4)||j/2==n/2||i==n-1)
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