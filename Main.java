public class Main
{
    public static int one(int n) {
        return n%10;
    }
    public static int two(int n) {
        return n/10;
    }
    public static int length(int m) {
        int c=0;
        while(m>0){
            m=m/10;
            c++;
        }
        return c;
    }
    public static int power(int b,int e) {
        int res=1;
        while(e>0){
            res*=b;
            e--;
        }
        return res;
    }
//     3) n=1234, m=77 ------> output = 123477   // Concatenate two numbers in (n,m) format

// Test case 1:
//     n=1234556, m=693 --> o/p :  1234556693
// Test case 2:
//     n=150, m=9      --> o/p :  1509
    public static int three(int n,int m) {
        int nsign=1;
        if(m<0){
        m=m*-1;
    }
    if(n<0){
        nsign=-1;
        n=n*-1;
    }
    
        return nsign*(n*power(10,length(m))+m);
    }  
//     4) n=1234, m=77  ------> output = 1277    // Replace "m" in  "n" in last position

// Test case 1:
//     n=1234556, m=693 --> o/p :  1234693
// Test case 2:
//     n=15, m=9      --> o/p :  19
    
    public static int four(int n,int m){
        int nsign=1;
        if(m<0){
            m*=-1;
        }
        if(n<0){
        nsign=-1;
        n=n*-1;
    }
        return nsign*(n/power(10,length(m))*power(10,length(m)))+m;
    }
//     5) n=1234    -------> output = 1      // Get only the first digit

// Test case 1:
//     n=1234556 --> o/p : 1
// Test case 2:
//     n=850       --> o/p : 8
    
    public static int five(int n){
        return n/power(10,length(n)-1);
    }
//     6). n=1234    -------> output = 234     // remove only the first digit

// Test case 1:
//     n=1234556 --> o/p : 234556
// Test case 2:
//     n=850       --> o/p : 50
    public static int six(int n){
        int nsign = 1;
        if(n<0){
            nsign=-1;
            n*=-1;
        }
        return n% power(10,length(n)-1);
    }
//     7). n=1234, m=77   ------> output = 771234  // Concatenate two numbers in (m,n) format

// Test case 1:
//     n=1234556, m=693 --> o/p :  6931234556
// Test case 2:
//     n=150, m=9      --> o/p :  9150
    public static int seven(int n,int m){
        return m*power(10,length(n))+n;
    }
//     8). n=1234, m=77   ------ output = 7734        // Replace "m" in  "n" in front position

// Test case 1:
//     n=1234556, m=693 --> o/p :  6934556
// Test case 2:
//     n=15, m=9      --> o/p :  95
 public static int eight(int n,int m){
        int nsign=1;
        if(m<0){
            m*=-1;
        }
        if(n<0){
        nsign=-1;
        n=n*-1;
    }
        return nsign*(m*power(10,length(m))+n%power(10,length(n)-length(m)));
    }
//     9.) n=1234, m=77   ------ output = 127734  // insert "m" in "n" at middle position

// Test case 1:
//     n=-12345, m=777 --> o/p :  -12377745
// Test case 2:
//     n=15, m=-9      --> o/p :  195
    public static int nine(int n,int m){
         int nsign=1;
        if(m<0){
            m*=-1;
        }
        if(n<0){
        nsign=-1;
        n=n*-1;
    }
        int x = power(10, length(n) / 2);
        int y = power(10, length(m));
        int z = power(10, length(n) / 2);
        return nsign * (((((n / x) * y) + m) * z) + (n % z));
    }
    //10.) n=1234, m=77   ------ output = 1774  // replace "m" in "n" at middle position

    public static int ten(int n,int m){
                 int nsign=1;
        if(m<0){
            m*=-1;
        }
        if(n<0){
        nsign=-1;
        n=n*-1;
    }

        int p=power(10,length(n)/2);
        int q=power(10,length(m)/2);
        int y=power(10,length(m)-1);
        int z=power(10,length(n)-1);
        return nsign*((n/z)*p+m)*q+(n%y);
    }
    
    
	public static void main(String[] args) {
	    int n=1234;
		System.out.println(one(n)+" "+two(n));
		System.out.println(three(1234,-77)+" "+four(1234,77));
		System.out.println(five(1234));
        System.out.println(five(1234)+ " " +six(1234));
        System.out.println(seven(1234,77));
        System.out.println("seven"+seven(1234,77));
        System.out.println(nine(1234,77));
        System.out.println(ten(1234,77));
        System.out.println(ten(15,-9));
        System.out.println(ten(134,9));


        

	}
}

//cpy
public static int ten1(int n, int m) {
    int nsign = 1;
    if (m < 0) {
        m *= -1;
    }
    if (n < 0) {
        nsign = -1;
        n *= -1;
    }
    
    int nLen = length(n);
    int mLen = length(m);
    
    int leftPartLength = nLen / 2; // Left half length (works for both even and odd lengths)
    int rightPartLength = nLen - leftPartLength; // Remaining right part length
    
    int leftDivisor = power(10, rightPartLength); // Divisor for extracting left part
    int rightDivisor = power(10, mLen); // Divisor for adjusting right part
    
    int leftPart = n / leftDivisor; // Extract left part
    int rightPart = n % power(10, leftPartLength); // Extract right part
    
    return nsign * ((leftPart * power(10, mLen) + m) * power(10, leftPartLength) + rightPart);
}