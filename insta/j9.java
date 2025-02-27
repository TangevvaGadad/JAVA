public class j9
{
static void fun(int n){
    int num=1;
for(int i=0;i<n;i++){
for(int j=0;j<=i;j++){
    if(n<=9){
            System.out.print(num+" ");
    num++;

    }
    if(num>9)
        num=1;

}
System.out.println();
}
}
public static void main(String[] args) {
int n=5;
fun(n);
}
}

