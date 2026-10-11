package problem7;

public class Carpenter extends Person{
    private static String work = "Carpenter";
    public Carpenter(String name){super(name);}
    public void display() {
        System.out.println("I am " + name +  " the " + work);
    }
}