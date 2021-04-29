import java.util.Scanner;

public class Movie {
    private String rating;
    private String id;
    private String title;
    public Movie(){
        rating="PG-18";
        id="e-0";
        title="Prison Break";
    }
    public Movie(String rating, String id, String title){
        this.id=id;
        this.title=title;
        this.rating=rating;
    }
    public void setTitle(String title) {
        this.title = title;
    }
    public String getTitle() {
        return title;
    }
    public void setRating(String rating) {
        this.rating = rating;
    }
    public String getRating() {
        return rating;
    }
    public void setId(String id) {
        this.id = id;
    }
    public String getId() {
        return id;
    }
    public boolean equals(Movie m){
        if (this.id.equals(m.id)){
            return true;
        }
        else return false;
    }
    public double calLateFee(){
        Scanner scanner= new Scanner(System.in);
        System.out.println("How many days is the movie late");
        int days = scanner.nextInt();
        return 2*days;
    }
}
