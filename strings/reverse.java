class reverse {
    public static String reverse(String arr) {
        char[] newArray = arr.toCharArray();
        int left = 0, right = newArray.length - 1;

        while (left < right) {
            char temp = newArray[left];
            newArray[left] = newArray[right];
            newArray[right] = temp;

            left++;
            right--;
        }
        
        return new String(newArray);
    }

    public static void main(String[] args) {
        String arr = "What is your name";
        String reversed = reverse(arr);
        System.out.println(reversed);
    }
}
