public class oneBy
{   
        public static int fact(int n){
        int factnum=1;
        for(int i=1;i<=n;i++)
            factnum=factnum*i;
        return factnum;

    }

        public static int oneByFact(int n){
            return 1/fact(n);
    }

	public static void main(String[] args) {

        System.out.println(oneByFact(5));

	}
}