public class j13
{
static void fun(int n){
for(int i=0;i<n;i++){
for(int j=0;j<n;j++){
if(i+j>=n-1)
    System.out.print((char)(65+j-(n-1-i)));
else
System.out.print(" ");
}
for(int j=0;j<i;j++){
    System.out.print((char)(64+i-j));
}
for(int j=n-1;j<n-i-1;j--){
if(i+j>=n-1)
    System.out.print((char)(65+j-(n-1-i)));
else
System.out.print(" ");
}
System.out.println();
}

return;
}
public static void main(String[] args) {
int n=4;
fun(n);
}
}