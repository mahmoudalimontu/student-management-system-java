
void main() {
    Scanner in =new Scanner(System.in);
    ArrayList<Student> students = new ArrayList<>();
    while(true)
    {
        System.out.println("\n===== Student Management System =====");
        System.out.println("1. Add Student");
        System.out.println("2. Display All Students");
        System.out.println("3. Search Student");
        System.out.println("4. Update Student");
        System.out.println("5. Delete Student");
        System.out.println("6. Exit");
        System.out.print("Enter your choice: ");

        int choice = in.nextInt();
        switch (choice) {
            case 1:
                if (addStudent(students, in))
                    System.out.println("Student added successfully.");
                else
                    System.out.println("Student ID already exists.");
                break;

            case 2:
                displayAllStudents(students);
                break;

            case 3:
                System.out.print("Enter Student ID: ");
                int searchId = in.nextInt();

                Student result = searchStudentById(students, searchId);

                if (result != null) {
                    System.out.println("Student found.");
                    result.displayInfo();
                } else {
                    System.out.println("Student not found.");
                }
                break;

            case 4:
                int id, grade;
                String name,email;

                System.out.print("Enter Student ID: ");
                id = in.nextInt();

                System.out.print("Enter Student Name: ");
                in.nextLine(); // to ignore white spaces and '\n'
                name = in.nextLine();

                System.out.print("Enter Student Grade: ");
                grade = in.nextInt();

                System.out.print("Enter Student Email: ");
                in.nextLine();
                email = in.nextLine();

                updateStudent(students, id, name, grade,email);
                break;

            case 5:
                System.out.print("Enter Student ID: ");
                int deleteId = in.nextInt();

                deleteStudent(students, deleteId);
                break;

            case 6:
                System.out.println("Goodbye!");
                return;

            default:
                System.out.println("Invalid choice. Please try again.");
        }
    }

}
// A simple experiment for Polymorphism
void testPolymorphism()
{
    ArrayList<Person> people=new ArrayList<>();
    people.add(new Student(2,"Mohamed Ahmed",13,"MOh@gmail.com"));
    people.add(new Student(1,"Mahmoud Ali",17,"mahmoud1@gmail.com"));
    people.add(new Teacher("Ali Omran","aliomran32@gmail.com","Math",1176.34));

    for(var i:people)
    {
        i.displayInfo();
        System.out.println("\n###########################\n");
    }
}
boolean addStudent(ArrayList<Student> list,Scanner in) {

    int id,grade;
    String name,email;
    System.out.println("Enter Student ID: ");
    id=in.nextInt();
    System.out.println("Enter Student Name: ");
    in.nextLine();
    name=in.nextLine();
    System.out.println("Enter Student Grade: ");
    grade=in.nextInt();
    System.out.println("Enter Student Email: ");
    in.nextLine();
    email=in.nextLine();
    if(searchStudentById(list,id)==null)
    {
        Student added=new Student(id,name,grade,email);
        list.add(added);
        return true;
    }
    return false;
}
void updateStudent(ArrayList<Student>list,int id,String name,int grade,String email)
{
    Student find=searchStudentById(list,id);
    if(find==null)
        System.out.println("Student not found.");
    else
    {
        find.setName(name);
        find.setGrade(grade);
        find.setEmail(email);
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
