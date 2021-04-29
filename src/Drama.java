import java.util.Scanner;

public class Drama extends Movie{
    public Drama(String a, String b, String c){
        super(a,b,c);
    }
    @Override
    public boolean equals(Object o) {
        return super.equals(o);
    }

    @Override
    public double calLateFee() {
        Scanner scanner= new Scanner(System.in);
        System.out.println("How many days is the drama movie late");
        int days = scanner.nextInt();
        return 2*days;
    }
}
