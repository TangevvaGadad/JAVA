// String Builder & String Buffer

public class myStringBuffer {
public static void main(String[] args) {
StringBuffer sb = new StringBuffer("Bhavesh");
System.out.println(sb.capacity()); // Default capacity is 16
System.out.println(sb.length());

sb.deleteCharAt(2);

sb.insert(0, "Hello Alvas! ");

// sb.append(" Mali");
sb.append(" Javid");
System.out.println(sb);

}
}

// String to String Builder
// String Buffer to String Buffer