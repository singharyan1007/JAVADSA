package oops.generics.comparing;

public class Student implements Comparable<Student>{
    int roll;
    float marks;

    //implements means Interface. Comparable is an interface. Interface can also use Generics

    public Student(int roll, float marks){
        this.roll=roll;
        this.marks=marks;

    }
    @Override
    public String toString() {
        return marks + "";
    }

    @Override
    public int compareTo(Student student) {
        System.out.println("In compareTo method");
        int diff=(int)(this.marks-student.marks);
        // if diff == 0: means both are equal
        // if diff < 0: means o is bigger else o is smaller

        return diff;
    }
}
