public class MovieRunner {
    public static void main(String[] args) {
        Movie movie1= new Action("PG-6", "e-0", "Shrek");
        Movie movie2= new Comedy("Rated- G","s-0001","B99");
        Movie movie3= new Drama("Rated-R","n-098","elite");
        Movie movie= new Movie();
        System.out.println(movie.equals(movie1));
        System.out.println("Late days fee for action movie: "+movie1.calLateFee());
        System.out.println("Late days fee for comedy movie: "+movie2.calLateFee());
        System.out.println("Late days fee for drama movie: "+movie3.calLateFee());
    }
}
