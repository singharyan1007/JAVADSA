package oops;

public class wrapperExample {
    public static void main(String[] args) {
        int a=24;
        int b=69;
        swap(a,b);
        //this does not swap the values because JAVA is pass by value only
        //Not pass-by reference
        //
       Integer num=45;


       final Student aryan=new Student("Aryan");
       // we can basically change the values
        aryan.name="Other name";
        //but we cant do


//        aryan=new Student("Other name");
        //says cannot re assign to FINAL variable

    }


    static void swap(int a, int b){
        int temp=a;
        a=b;
        b=temp;
        //this swaps the value only internally
    }
    static void swapByReference(Integer a, Integer b){
        Integer temp=a;
        a=b;
        b=temp;
        //This also does not work because Integer class is "final" type

    }

     public static class Student{
        int rno;
        String name;
        int marks;

        Student(String name){
            this.name=name;
        }

    }


    // FINAL keyword
    static void finalExample(){
        final int NUM=10;
        //always use UPPERCASE
        //can only be used with primitive datatypes
        //If used with reference variables

//        final Student aryan=new Student();
        //if used with reference variables they will keep pointing to the
        //same object
        //cannot be reassigned
        //but its values can be changed
    }



}
