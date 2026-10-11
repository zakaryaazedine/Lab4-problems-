package instructor;

import student.Person;

public class Instructor extends Person {
    private String employeeNumber;

    public Instructor() {
        super();
    }

    public Instructor(String lastName, String firstName, String phone, String email,
                      String employeeNumber) {
        super( firstName,lastName, phone, email);
        this.employeeNumber = employeeNumber;
    }

    public String getEmployeeNumber() {
        return employeeNumber;
    }

    public void setEmployeeNumber(String employeeNumber) {
        this.employeeNumber = employeeNumber;
    }

    @Override
    public String toString() {
        return "Instructor{id=" + id
                + ", employeeNumber='" + employeeNumber + '\''
                + ", lastName='" + secondName + '\''
                + ", firstName='" + firstName + '\''
                + ", phone='" + phone + '\''
                + ", email='" + email + '\''
                + '}';
    }


    public String cleanEmployeeNumber(){
        if(employeeNumber == null) return null;
        return employeeNumber.replaceAll("\\s+", "");
    }


    public String summaryLine(){
        return String.format("Instructor[employeeNumber=%s, lastName=%s, firstName=%s]", this.employeeNumber, this.firstName,this.secondName);
    }

    public String toCard(){
        StringBuilder x = new StringBuilder();
        x.append("Instructor\n")
                .append("----------\n")
                .append("Employee #: ").append(cleanEmployeeNumber())
                .append("\nName : ").append(secondName).append(", ").append(firstName)
                .append("\nEmail : ").append(email)
                .append("\nPhone : ").append(phone);
        return x.toString();
    }


    public String displayName() {
        StringBuilder x = new StringBuilder();
        if (firstName != null) x.append(firstName);
        if (secondName != null) {
            if (x.length() > 0) x.append(' ');
            x.append(secondName);
        }
        return x.toString();
    }





}