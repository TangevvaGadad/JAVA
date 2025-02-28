class secondLargest{
    public static void main(String [] args){
        int a[]={9,12,13,4,5};
        int max1,max2;
        max1=max2=a[0];
        for(int i=0;i<a.length;i++){
            if(a[i]>max1){
                max2=max1;
                max1=a[1];
            }
            else if(a[1]>max2){
                max2=a[i];
            }
        }
        System.out.println(max2);
    }
}