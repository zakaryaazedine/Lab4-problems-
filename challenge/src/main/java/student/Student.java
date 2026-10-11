package student;

public class Student extends Person {
   private String cne;
   private Major major;

   public static final Major defaultMajor = new Major("23", "Computer Science");





   public Student(){
      super();
   }

   public Student(String prenom, String nom, String telephone, String email, String cne, Major major) {
      super(prenom,nom,telephone,email);
      this.cne = cne;
      this.major = major;
      if (major!=null) major.addStudent(this);
   }


   public Student(String prenom, String nom, String telephone, String email, String cne) {
      this(prenom,nom,telephone,email,cne,defaultMajor);

   }

   // Getters
   public String getCne() {
      return this.cne;
   }

   public Major getMajor(){
      return this.major;
   }




   // Setters

   public void setCne(String x){
      this.cne = x;
   }

   public void setMajor(Major x){
      this.major = x;
   }



   public String getFullNameFormatted(){
      return String.format("%S, %s", this.secondName, this.firstName);
   }


   @Override
   public String toString(){
      return "Student{id=" + id
              + ", cne='" + cne
              + ", lastName='" + secondName
              + ", firstName='" + firstName
              + ", phone='" + phone
              + ", email='" + email
              + ", major=" + (major != null ? major.getCode() : null)
              + '}';
   }
}
