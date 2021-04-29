import java.util.Scanner;

public class Action extends Movie{
    public Action(String a, String b, String c){
        super(a,b,c);
    }
    @Override
    public boolean equals(Object o) {
        return super.equals(o);
    }
    @Override
    public double calLateFee() {
        Scanner scanner= new Scanner(System.in);
        System.out.println("How many days is the action movie late");
        int days = scanner.nextInt();
        return 3*days;
    }
}
