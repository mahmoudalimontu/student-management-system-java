
void main() {
    Scanner in =new Scanner(System.in);
    ArrayList<Student> students = new ArrayList<>();

    // add
    System.out.println(addStudent(students,in));
    System.out.println(addStudent(students,in));
    System.out.println(addStudent(students,in));
     //print all
    displayAllStudents(students);


     //test search
    System.out.println("Enter id you need find it: ");
    int id=in.nextInt();
    Student find=searchStudentById(students,id);
    if(find==null)
    {
        System.out.println("Student not found");
    }
    else find.displayInfo();

     //test update
    System.out.println("Enter Student ID You want update it: ");
    id=in.nextInt();
    System.out.println("Enter The Updated Student Name: ");
    in.nextLine();
    String name=in.nextLine();
    System.out.println("Enter The Updated Student Grade: ");
    int grade=in.nextInt();
    updateStudent(students,id,name,grade);

     //test delete
    displayAllStudents(students);
    System.out.println("Enter Student ID you want delete it: ");
    id=in.nextInt();
    deleteStudent(students,id);
    displayAllStudents(students);

}
boolean addStudent(ArrayList<Student> list,Scanner in) {

    int id,grade;
    String name;
    System.out.println("Enter Student ID: ");
    id=in.nextInt();
    System.out.println("Enter Student Name: ");
    in.nextLine();
    name=in.nextLine();
    System.out.println("Enter Student Grade: ");
    grade=in.nextInt();
    if(searchStudentById(list,id)==null)
    {
        Student added=new Student(id,name,grade);
        list.add(added);
        return true;
    }
    return false;
}
void updateStudent(ArrayList<Student>list,int id,String name,int grade)
{
    Student find=searchStudentById(list,id);
    if(find==null)
        System.out.println("Student not found.");
    else
    {
        find.setName(name);
        find.setGrade(grade);
        System.out.println("Student updated successfully.");
    }
}
void deleteStudent(ArrayList<Student> list,int id)
{
    Student find=searchStudentById(list,id);
    if(!list.remove(find))
        System.out.println("Student not found for deletion.");
    else System.out.println("Student deleted successfully.");
}
void displayAllStudents(ArrayList<Student> list)
{
    for(var i:list) {
        i.displayInfo();
        System.out.println();
    }
}

Student searchStudentById(ArrayList<Student> list,int idd)
{
    for(var i:list)
    {
        if(i.getId()==idd)
           return i;
    }
    return null;
}
