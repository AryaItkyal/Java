package pkg_stack;
public class Main {
    public static void main(String[] args) {
        Fixed_stk fixed=new Fixed_stk();
        fixed.push(1);
        fixed.push(2);
        fixed.push(3);
        fixed.push(4);
        fixed.push(5);
        fixed.push(6);

        fixed.displayStkTop();
        fixed.displayStk();


        Growable_stk growable=new Growable_stk();
        growable.push(1);
        growable.push(2);
        growable.push(3);
        growable.push(4);
        growable.push(5);
        growable.push(6);

        growable.displayStkTop();
        growable.displayStk();
        //System.out.println("Hello world!");
    }
}