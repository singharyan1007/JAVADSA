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


        System.out.println(aryan.name);



    }
    public static class Student{
        int rno;
        String name;
        float marks;


        Student(){
            this.rno=27;
            this.name="Aryan";
            this.marks=100.0f;

        }


    }

}
