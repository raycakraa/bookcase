package bookcase.author;

public class Novelist extends AuthorAbs {

    private String rating;
    private boolean isSerial;

    public Novelist(String firstName, String lastName, String country, int age, String rating, boolean isSerial) {
        super(firstName, lastName, country, age);
        // TODO Auto-generated constructor stub
        this.rating = rating;
        this.isSerial = isSerial;
    }

    public String getRating() {
        return rating;
    }

    public void setRating(String rating) {
        this.rating = rating;
    }

    public boolean isSerial() {
        return isSerial;
    }

    public void setSerial(boolean isSerial) {
        this.isSerial = isSerial;
    }

    public String getFullName(String firstName, String lastName) {
        return firstName + " " + lastName;
    }

    public String toString() {
        return rating;
    }

}
