package practize4;

public enum Comp_Mark {
    ACER(4.8),
    HONOR(4.9),
    HP(3.5),
    ASUS(4.4),
    LENOVO(5);

    final double avg_rating;

    Comp_Mark(double rating) {
        this.avg_rating = rating;
    }

    public double getAvg_rating() {
        return avg_rating;
    }
}
