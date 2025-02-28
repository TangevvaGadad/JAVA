class rotateArray{
    public static int leftRotate(int a[]){
        int temp=a[0];
        int n=a.length;
        for(int i=0;i<n-1;i++){
            a[i]=a[i+1];
        }
        a[n-1]=temp;
        for(int i=0;i<a.length;i++){
            System.out.print(a[i]+" ");

        }
        return 0;

    }

        public static int rightRotate(int a[]){
        int n=a.length;
        int temp=a[n-1];
        for(int i=n-1;i>0;i--){
            a[i]=a[i-1];
        }
        a[0]=temp;
        for(int i=0;i<a.length;i++){
            System.out.print(+a[i]+" ");

        }
        return 0;

    }
    public static void main(String [] args){
        int a[]={1,2,3,4,5};
        rightRotate(a);


    }
}