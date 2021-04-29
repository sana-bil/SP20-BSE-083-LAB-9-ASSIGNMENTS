import java.util.Scanner;

public class Comedy extends Movie{
    public Comedy(String a, String b, String c){
        super(a,b,c);
    }
    @Override
    public boolean equals(Object o) {
        return super.equals(o);
    }
    @Override
    public double calLateFee() {
        Scanner scanner= new Scanner(System.in);
        System.out.println("How many days is the comedy movie late");
        int days = scanner.nextInt();
        return 2.50*days;

    }
}
