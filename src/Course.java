
public class Course {
    private String name,code;
    private Teacher professor;
    public Course()
    {}
    public Course(String name,String code,Teacher professor)
    {
        this.name=name;
        this.code=code;
        this.professor=professor;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }
    public Teacher getProfessor()
    {
        return professor;
    }

    public void setProfessor(Teacher professor) {
        this.professor = professor;
    }

    public void displayInfo()
    {
        System.out.println("Course Name: "+getName());
        System.out.println("Course Code: "+getCode());
        System.out.println("Course Professor: "+professor.getName());
    }
}
