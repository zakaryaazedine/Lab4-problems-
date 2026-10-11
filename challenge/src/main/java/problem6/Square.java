package problem6;

public class Square extends Forme {
    private double side;
    public Square(double side){
        super(side*side);
        this.side = side;
    }
    public Square(){}
    public double getRadius() {return side;}
    public void setRadius(double side) {this.side = side;}
    public String toString(){return "Square (side "+ side+" cm)";}
}
