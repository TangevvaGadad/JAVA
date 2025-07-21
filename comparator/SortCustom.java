import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;

public class SortCustom {
    public static void main(String[] args) {
        int arr[]={0,1,9,3,7,2,5};
        Arrays.sort(arr);
        int arr2[]={0,1,9,3,7,2,5};
        Arrays.sort(arr2,2,6);
        System.out.println(Arrays.toString(arr2));
        Integer arr3[]={0,1,9,3,7,2,5};
        Arrays.sort(arr3, Collections.reverseOrder());
        System.out.println(Arrays.toString(arr3));
        Student[] data={new Student(161,"Nisarga",9.8),
                        new Student(162,"B",7.6),
                        new Student(163,"C",8.9),
                        new Student(164,"D",6.8),                                                        
    };
    Arrays.sort(data, new Comparator<Student>() {
        public int compare(Student a,Student b){
            return Double.compare(b.cgpa, a.cgpa);
        }
    });
    Arrays.sort(data,(Student a,Student b)->Double.compare(b.cgpa,a.cgpa));
        for(Student s:data)
        System.out.println(s);
    }
}
class Student{
      int id;
    String name;
    double cgpa;

    public Student(int id, String name, double cgpa) {
        this.id = id;
        this.name = name;
        this.cgpa = cgpa;
    }

    public String toString() {
        return id + " " + name + " " + cgpa;
    }
}
