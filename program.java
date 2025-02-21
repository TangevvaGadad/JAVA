public class program
{   
    public static int sum(int n){
        int sum=0;
        sum=n*(n+1)/2;
        return sum;
    }
    public static int fact(int n){
        int factnum=1;
        for(int i=1;i<=n;i++)
            factnum=factnum*i;
        return factnum;

    }
        public static int oneByFact(int n){
            return 1/fact(n);
    }
    public static int findGCD(int a, int b) {
    while (b != 0) {
        int temp = b;
        b = a % b;
        a = temp;
    }
    return a;
}
	public static void main(String[] args) {
	    int n=20;
        System.out.println(findGCD(2,4));
        System.out.println(sum(10));
        System.out.println(fact(5));
        System.out.println(oneByFact(5));

	}
}