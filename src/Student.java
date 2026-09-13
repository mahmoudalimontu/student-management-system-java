public class Student extends Person {
    private int id;
    private int grade;

    // Constructors
    public Student() {}
    public Student(int id, String name,int grade,String email) {
        super(name,email);
        this.id = id;
        this.grade = grade;
    }
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getGrade() {
        return grade;
    }

    public void setGrade(int grade) {
        this.grade = grade;
    }

    @Override
    public void displayInfo()
    {
        System.out.println("Student ID: "+id);
        System.out.println("Student Name: "+getName());
        System.out.println("Student Grade: "+grade);
        System.out.println("Student Email: "+getEmail());
    }
}
