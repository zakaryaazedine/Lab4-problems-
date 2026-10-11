package instructor;

public class Test {
    public static void main(String[] args) {
        Instructor ins1 = new Instructor("Kalloubi", "Fahd", "0661234567", "fahd.kalloubi@um6p.ma", " AB 123 ");

        System.out.println("--- Instructor ---");
        System.out.println(ins1);
        System.out.println("1. cleanEmployeeNumber: '" + ins1.cleanEmployeeNumber() + "'");
        System.out.println("4. summaryLine: " + ins1.summaryLine());
        System.out.println("6. toCard:\n" + ins1.toCard());
        System.out.println("8. displayName: " + ins1.displayName());

        Instructor noFirst = new Instructor("Kalloubi", null, "06", "x@um6p.ma", "E1");
        Instructor noLast = new Instructor(null, "Fahd", "06", "x@um6p.ma", "E2");
        Instructor empty = new Instructor();
        System.out.println("displayName (no first name): '" + noFirst.displayName() + "'");
        System.out.println("displayName (no last name): '" + noLast.displayName() + "'");
        System.out.println("displayName (both null): '" + empty.displayName() + "'");

        System.out.println("\n--- Subject ---");
        Subject sub1 = new Subject(" cs-101 ", "introduction to java", ins1);
        Subject sub2 = new Subject("INTRO-200", "databases", ins1);
        Subject sub3 = new Subject("MA-301", "Linear Algebra", ins1);

        System.out.println(sub1);
        System.out.println("2. normalizedCode: '" + sub1.normalizedCode() + "'");
        System.out.println("3. properTitle: '" + sub1.properTitle() + "'");
        System.out.println("5. sub1 isIntroCourse (title has Intro): " + sub1.isIntroCourse());
        System.out.println("5. sub2 isIntroCourse (code INTRO-): " + sub2.isIntroCourse());
        System.out.println("5. sub3 isIntroCourse: " + sub3.isIntroCourse());
        System.out.println("7. syllabusLine: " + sub1.syllabusLine(sub1.getInstructor()));
    }
}
