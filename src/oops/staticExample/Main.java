package oops.staticExample;

public class Main {
    public static void main(String[] args) {
        Human aryan = new Human(22, 100000, false, "Aryan");
        System.out.println(aryan.salary);
        System.out.println(aryan.name);
        System.out.println(aryan.population);
        System.out.println(Human.population);


        //example of 3. point

        System.out.println();
//        fgreeting();
        //shows an error cause accessing a non-static method form static method ios not allowed
        Main ob=new Main();
        ob.fgreeting();
        //is possible using object reference
    }

    void fgreeting() {
        System.out.println("Fuck you");
    }
}

