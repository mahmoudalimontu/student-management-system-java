public class GraduateStudent extends Student{
    String thesisTitle;

    public GraduateStudent(){}
    public GraduateStudent(int id,String name,int grade,String email,String thesisTitle)
    {
        super(id,name,grade,email);
        this.thesisTitle=thesisTitle;
    }

    public String getThesisTitle() {
        return thesisTitle;
    }

    public void setThesisTitle(String thesisTitle) {
        this.thesisTitle = thesisTitle;
    }

    @Override
    public void displayInfo() {
        super.displayInfo();
        System.out.println("Thesis Title: "+thesisTitle);
    }
}
