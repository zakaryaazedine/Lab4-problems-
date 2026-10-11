package student;

public class Major {
   private static int nextId = 1;
   private int id;
   private String code;
   private String name;
   private Student[] students = new Student[50];
   private int studentCount = 0;


   public  Major(){
      this.id = nextId++;

   }

   public Major(String code, String name) {
      this.id = nextId++;
      this.code = code;
      this.name = name;

   }

   // Method to add a student
   public void addStudent(Student s) {
      if (studentCount<50 && s!=null) {
         this.students[studentCount] = s;
         studentCount++;
         s.setMajor(this);
      }
   }

   // Getters

   public int getId(){
      return this.id;
   }

   public String getName(){
      return this.name;
   }

   public String getCode(){
      return this.code;
   }
   public void setCode(String code) {
      this.code = code;
   }

   public void setName(String name) {
      this.name = name;
   }


   @Override

   public String toString(){
      return  "Major{id=" + id
              + ", name='" + name
              + ", code='"+ code
              + '}';
   }

   // Display all students in the major
   public void displayStudents() {
      System.out.println("The list of students in the "+ this.name +" major is: ");
      for (int i=0;i<studentCount;i++) System.out.println((i+1)+" "+ students[i].getCne() + " " + students[i].getsecondName() + " "+ students[i].getFirstName());
   }


   public Student findStudentByCNE(String cne){
      for (int i=0;i<studentCount;i++) if (students[i].getCne().equals(cne)) return students[i];
      return null;
   }

   public int getStudentCount(){
      return this.studentCount;
   }

   public boolean removeStudent(String cne){
      if (findStudentByCNE(cne) == null) return false;
      Student x = findStudentByCNE(cne);
      int idx =-1;
      for(int i=0;i<studentCount;i++){
         if (students[i].getCne().equals(cne)) {
            idx = i;
            break;
         }
      }
      x.setMajor(null);
      for (int i=idx;i<studentCount-1;i++) students[i] = students[i+1];
      students[studentCount-1] = null;
      studentCount--;

      return true;

   }


   public void getOccupancyRate(){
      double occ = (double)studentCount / 50;
      String s = this.name + " capacity : 50 student"+ "\nCurrent enrollement : "+ studentCount + " students"+ "\nOccupancy rate = " + (occ*100 ) + "%";
      System.out.println(s);
   }

   public String getStudentListAsString(){
      StringBuilder x = new StringBuilder();
      for (int i=0;i<studentCount;i++) x.append('\n').append(i+1).append( ". ").append(students[i].getFullNameFormatted());
      return x.toString();
   }


}



