class countSizeofWord{
        public static void fun(String arr) {
        char[] ch = arr.toCharArray();
        int count=0;
        for(int i=0;i<arr.length();i++){
            if(ch[i]!=' ')
                count++;
            else{
                 System.out.println("word size:"+count);
                 count=0;
            }

        }
        if(count>0)
                 System.out.println("word size:"+count);


    }

    public static void main(String[] args) {
        String arr = "What is your name";
        fun(arr);
    }
    
}