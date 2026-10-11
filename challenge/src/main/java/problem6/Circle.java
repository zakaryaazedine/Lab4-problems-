package problem6;

public class Circle extends Forme {
    private double radius;
    public Circle(double radius){
        super(radius*radius*Math.PI);
        this.radius = radius;
    }
    public Circle(){}
    public double getRadius() {return radius;}
    public void setRadius(double radius) {this.radius = radius;}
    public String toString(){return "Circle (radius "+ radius+" cm)";}
}
