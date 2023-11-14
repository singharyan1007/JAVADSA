package oops;

public class basicsOops {

    public static void main(String[] args) {
        int[] numbers=new int[5];
        String[] names=new String[5];

        int[] rno=new int[5];
        String[] name=new String[5];
        float[] marks=new float[5];


        Student[] student=new Student[5];
//
//        Student aryan=new Student();
//        aryan.rno=27;
//        aryan.name="Aryan";
//        aryan.marks=88.0f;
        Student aryan=new Student();
//        Student vanshika=new Student(56,"Vanshika",99.0f);
//        System.out.println(vanshika.name);
//        System.out.println(vanshika.rno);
//        System.out.println(vanshika.marks);


        System.out.println(aryan.name);
        aryan.greeting();

        // SO NOW IF WE CREATE A random class
        Student random=new Student(aryan);
        //The OTHER will be replaced by aryan and this will be replaced by
        //random

        //NEW keyword memory allocation
        Student vanshika=aryan;
        aryan.name="mine";
        System.out.println(vanshika.name);
        vanshika.greeting();



    }
    public static class Student{
        int rno;
        String name;
        float marks;
        void greeting() {
//            System.out.println("Hello my name is "+this.name); works
            //the same as
            System.out.println("Hello my name is "+name);
        }

        //CASE when we take values from other class
        Student(Student other){
            this.name=other.name;
            this.marks=other.marks;
            this.rno=other.rno;
        }

        Student(){
            //calling another constructor from another
            this(27,"Aryan",100.0f);
        }


//        Student(){
//            this.rno=27;
//            this.name="Aryan";
//            this.marks=100.0f;
//
//        }
        Student(int roll, String name,float marks){
            this.rno=roll;
            this.name=name;
            this.marks=marks;
        }



        //This is called as constructor overloading.
        //Same name, but different implementation

        // Why we don't declare primitives with new keyword?
        // Primitives are not objects. The are present in the stack memory.
    }

}
