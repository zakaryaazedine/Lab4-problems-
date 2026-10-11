package instructor;


public class Subject {
    private int id;
    private String code;
    private String title;
    private Instructor instructor;

    private static int nextId = 1;

    public Subject() {
        id = nextId++;
    }

    public Subject(String code, String title, Instructor instructor) {
        this();
        this.code = code;
        this.title = title;
        this.instructor = instructor;
    }

    public int getId() {
        return id;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public Instructor getInstructor() {
        return instructor;
    }

    public void setInstructor(Instructor instructor) {
        this.instructor = instructor;
    }


    @Override
    public String toString() {
        return "Subject{id=" + id
                + ", code='" + code + '\''
                + ", title='" + title + '\''
                + ", instructor=" + (instructor != null ? instructor.getEmployeeNumber() : null)
                + '}';
    }

    public String normalizedCode(){
        return code.trim().toUpperCase();
    }

    public String properTitle(){
        String[] x = title.split(" ");
        for (int i=0;i<x.length;i++) x[i] = Character.toUpperCase(x[i].charAt(0)) + x[i].substring(1) ;
        return String.join(" ", x);
    }


    public boolean isIntroCourse(){
        if (title == null) return false;
        else return title.toUpperCase().contains("INTRO") || (normalizedCode().startsWith("INTRO-"));
    }

    public String syllabusLine(Instructor instructor) {
        StringBuilder x = new StringBuilder();
        x.append(normalizedCode()).append(" - ").append(properTitle())
                .append(" (Instructor: ")
                .append(instructor.getsecondName()).append(' ').append(instructor.getFirstName())
                .append(')');
        return x.toString();
    }




}