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
    public Student(int id,String name)
    {
        super(name,"");
        this.id=id;
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

    public void displayInfo(boolean showEmail)
    {
        System.out.println("Student ID: "+id);
        System.out.println("Student Name: "+getName());
        System.out.println("Student Grade: "+grade);
        if(showEmail)
            System.out.println("Student Email: "+getEmail());
    }
    @Override
    public void displayInfo()
    {
        displayInfo(true);
    }
}
