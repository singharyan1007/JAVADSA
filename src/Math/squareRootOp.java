package Math;

public class squareRootOp {
    public static void main(String[] args) {
        System.out.println(rootval(40));
    }
    static double rootval(int n){
        double root;
        double x=n;
        while(true){
            root=0.5*(x+(n/x));

            if(Math.abs(root-x)<1){
                break;
            }
            x=root;
        }
        return root;
    }
}
