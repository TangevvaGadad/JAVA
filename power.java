public class power
{   
        public static int fact(int n){
        int factnum=1;
        for(int i=1;i<=n;i++)
            factnum=factnum*i;
        return factnum;

    }
        public static int power(int b,int e) {
        int res=1;
        while(e>0){
            res*=b;
            e--;
        }
        return res;
    }
    public static int powerByX(int x,int n){
        return power(x,n)/fact(n);

    }

	public static void main(String[] args) {
        System.out.println(powerByX(3,3));


	}
}