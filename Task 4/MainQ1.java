public class MainQ1 {
    public static void main(String[] args) {
        try {
            StudentQ1 student1 = new StudentQ1(101, "Alice Smith", 20, "Computer Science");
            System.out.println("Student 1 created successfully: " + student1);
        } catch (AgeNotWithinRangeException | NameNotValidException e) {
            System.out.println("Error: " + e.getMessage());
        }

        try {
            StudentQ1 student2 = new StudentQ1(102, "Bob123", 22, "Mathematics");
            System.out.println("Student 2 created successfully: " + student2);
        } catch (AgeNotWithinRangeException | NameNotValidException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}
