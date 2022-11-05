package conditionals.funcs;

public class Shadowing {
    static int x=90;//this is shadowed by the variable in the lower block
    //it is a class variable

    public static void main(String[] args) {
        int x=20;
        System.out.println(x);
    }
}
