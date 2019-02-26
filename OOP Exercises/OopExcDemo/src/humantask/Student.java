package humantask;

public class Student extends Human {

    private byte rating;

    public Student(byte rating) {
        this.rating = rating;
    }

    public byte getRating() {
        return rating;
    }

    public void setRating(byte rating) {
        this.rating = rating;
    }
}
