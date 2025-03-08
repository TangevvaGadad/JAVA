public class frequencyChar {
    public static void freq(char ch[]){
            int n = ch.length;
            for (int i = 0; i < n; i++) {
            if (ch[i] == '-') continue;
            int count = 1;
            for (int j = i + 1; j < n; j++) {
                if (ch[i] == ch[j]) {
                    count++;
                    ch[j] = '-';
                }
            }
            System.out.println(ch[i] + " " + count);
        }
    }
    public static void main(String[] args) {
        String s = "what is your name";
        char ch[] = s.toCharArray();
        freq(ch);
        

    }
}
