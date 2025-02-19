package practize2.p6;

public class Circle {
    double R;

    public Circle (double R) {
        this.R = R;
    }

    public void setRadius(double new_R) {this.R = new_R;}

    public double getRadius() {return this.R;}

    public double getLength() {return 2 * Math.PI * this.R;}

    public double getSquare() {return Math.PI * Math.pow(this.R, 2);}

    public boolean IsEqual(Circle other) {
        return this.R == other.getRadius();
    }

    public void ToString() {
        System.out.println("Окружность с радиусом " + this.R);
    }

}
