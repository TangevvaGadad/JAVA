public class j7
{
static void fun(int n){
for(int i=0;i<n;i++){
for(int j=0;j<n;j++){
if(i-j>=0)
System.out.print(j+1);
else
System.out.print(" ");
}
System.out.println();
}
return;
}
public static void main(String[] args) {
int n=5;
fun(n);
}
}