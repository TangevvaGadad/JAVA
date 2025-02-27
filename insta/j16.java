public class j16
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
System.out.println();
}
for (int i = n - 2; i >= 0; i--) {
    for (int j = 0; j < n - i - 1; j++)
        System.out.print(" ");

    for (int j = 0; j < i + 1; j++)
        System.out.print((char)(65 + j));

    for (int j = i - 1; j >= 0; j--)
        System.out.print((char)(65 + j));

    System.out.println();
}


return;
}
public static void main(String[] args) {
int n=4;
fun(n);
}
}