public class Activity2Runner {
    public static void main(String[] args) {
        BasePlusCommEmployee b = new BasePlusCommEmployee("ali", "ahmed", "25-kkn", 100, 5.2, 25000);
        double earn = b.earnings();
        System.out.println("Earning of employee is "+ earn);
    }
}
