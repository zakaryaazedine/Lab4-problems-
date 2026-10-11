package student;

public class Person {
    private static int nextId = 1;
    protected int id;
    protected String firstName;
    protected String secondName;
    protected String phone;
    protected String email;

    public Person (){
        this.id = nextId++;
    }

    public Person(String firstName, String secondName, String telephone, String email) {
        this.id = nextId++;
        this.firstName = firstName;
        // add others
        this.secondName = secondName;
        this.phone = telephone;
        this.email = email;
    }

    public int getId() { return id; }             // no setId: id is auto-generated
    public String getsecondName()  { return secondName; }
    public void setsecondName(String l) { this.secondName = l; }
    public String getFirstName() { return firstName; }
    public void setFirstName(String f) { this.firstName = f; }
    public String getPhone() {return phone;}
    public void setPhone(String p){this.phone = p;}
    public String getEmail() {return email;}
    public void setEmail(String e) {this.email = e;}

    @Override

    public String toString(){
        return "Person{id=%d, %s %s, phone=%s, email=%s}".formatted(id, secondName, firstName, phone, email);
    }

    



}




