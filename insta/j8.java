public class j8
{
static void fun(int n){
    int num=1;
for(int i=0;i<n;i++){
for(int j=0;j<=i;j++){
    System.out.print(num+" ");
    num++;
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

