public class fact
{   
    public static int fact(int n){
        int factnum=1;
        for(int i=1;i<=n;i++)
            factnum=factnum*i;
        return factnum;

    }

	public static void main(String[] args) {
        System.out.println(fact(5));

	}
}