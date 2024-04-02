package bookcase.author;

public class Mangaka extends AuthorAbs {

    private String rating;

    public Mangaka(String firstName, String lastName, String country, int age, String rating) {
        super(firstName, lastName, country, age);
        // TODO Auto-generated constructor stub
        this.rating = rating;
    }

    public String getRating() {
        return rating;
    }

    public void setRating(String rating) {
        this.rating = rating;
    }

    public String getFullName(String firstName, String lastName) {
        return firstName + " " + lastName;
    }

    public String toString() {
        return rating;
    }
}
