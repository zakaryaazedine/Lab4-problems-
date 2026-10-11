package student;

public class Test {
    public static void main(String[] args) {
        // 4.a Create a couple of majors
        Major m1 = new Major("11", "Engineering");
        Major m2 = new Major("12", "Physics");

        // 4.b Create students (s1, s3 -> default major: Computer Science)
        Student s1 = new Student("Amal", "SAFI", "0600000001", "sa@uni.edu", "22885676");
        Student s2 = new Student("Zakarya", "AZEDINE", "0600000002", "az@uni.edu", "22882706", m1);
        Student s3 = new Student("Samir", "ALAMI", "0600000003", "as@uni.edu", "23585976");
        Student s4 = new Student("Farid", "ALAOUI", "0600000004", "af@uni.edu", "18555676", m2);

        // 4.c Display computer science students
        Student.defaultMajor.displayStudents();

        System.out.println("\n--- getFullNameFormatted ---");
        System.out.println(s1.getFullNameFormatted());

        System.out.println("\n--- toString ---");
        System.out.println(s2);
        System.out.println(m1);

        System.out.println("\n--- findStudentByCNE ---");
        System.out.println("Found: " + Student.defaultMajor.findStudentByCNE("23585976"));
        System.out.println("Not found: " + Student.defaultMajor.findStudentByCNE("00000000"));

        System.out.println("\n--- getStudentCount ---");
        System.out.println("CS students: " + Student.defaultMajor.getStudentCount());

        System.out.println("\n--- getOccupancyRate ---");
        Student.defaultMajor.getOccupancyRate();

        System.out.println("\n--- getStudentListAsString ---");
        System.out.println(Student.defaultMajor.getStudentListAsString());

        System.out.println("\n--- removeStudent ---");
        System.out.println("Remove 22885676: " + Student.defaultMajor.removeStudent("22885676"));
        System.out.println("Remove 22885676 again: " + Student.defaultMajor.removeStudent("22885676"));
        System.out.println("s1 major after removal: " + s1.getMajor());
        Student.defaultMajor.displayStudents();

        System.out.println("\n--- capacity limit ---");
        for (int i = 0; i < 50; i++) {
            new Student("First" + i, "LAST" + i, "06", "t" + i + "@uni.edu", "T" + i, m2);
        }
        System.out.println("Physics students: " + m2.getStudentCount()); // 50
        m2.getOccupancyRate();                                           // 100.0%
    }
}
