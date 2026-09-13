public class Teacher extends Person{
    private String subject;
    private double salary;
    public Teacher(){}
    public Teacher(String name,String email,String subject,double salary)
    {
        super(name,email);
        this.subject=subject;
        this.salary=salary;
    }

    public String getSubject() {
        return subject;
    }

    public void setSubject(String subject) {
        this.subject = subject;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    @Override
    public void displayInfo()
    {
        System.out.println("Teacher Name: "+getName());
        System.out.println("Teacher Email: "+getEmail());
        System.out.println("Teacher Subject: "+subject);
        System.out.println("Teacher Salary: "+salary);
    }
}
