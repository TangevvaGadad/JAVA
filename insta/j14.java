public class j14
{
static void fun(int n){
for(int i=0;i<n;i++){
for(int j=0;j<2*n-1;j++){
if(i+j>=n-1 && i-j>=-(n-1))
    System.out.print((char)(65+j-(n-1-i)));
else
System.out.print(" ");
}

System.out.println();
}
for (int i = n - 2; i >= 0; i--) {
    for(int j=0;j<2*n-1;j++)
if(i+j>=n-1 && i-j>=-(n-1))
    System.out.print((char)(65+j-(n-1-i)));
else
System.out.print(" ");
    System.out.println();
}


return;
}
public static void main(String[] args) {
int n=3;
fun(n);
}
}