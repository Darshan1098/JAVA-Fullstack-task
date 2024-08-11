import java.util.regex.Pattern;

public class StudentQ1 {
    private int rollNo;
    private String name;
    private int age;
    private String course;

    // Parameterized constructor
    public StudentQ1(int rollNo, String name, int age, String course)
            throws AgeNotWithinRangeException, NameNotValidException {
        this.rollNo = rollNo;
        this.name = name;
        this.age = age;
        this.course = course;

        // Validate age
        if (age < 15 || age > 21) {
            throw new AgeNotWithinRangeException("Age must be between 15 and 21.");
        }

        // Validate name
        if (!isValidName(name)) {
            throw new NameNotValidException("Name contains invalid characters.");
        }
    }

    // Method to validate the name
    private boolean isValidName(String name) {
        // Name should only contain letters and spaces
        String regex = "^[A-Za-z\\s]+$";
        return Pattern.matches(regex, name);
    }

    // Getters and setters
    public int getRollNo() {
        return rollNo;
    }

    public void setRollNo(int rollNo) {
        this.rollNo = rollNo;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getCourse() {
        return course;
    }

    public void setCourse(String course) {
        this.course = course;
    }

    @Override
    public String toString() {
        return "Student [rollNo=" + rollNo + ", name=" + name + ", age=" + age + ", course=" + course + "]";
    }
}
