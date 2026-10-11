package problem7;

public class Plumber extends Person{
    private static  String work = "Plumber";
    public Plumber(String name){super(name);}
    public void display() {
        System.out.println("I am " + name +  " the " + work);
    }
}