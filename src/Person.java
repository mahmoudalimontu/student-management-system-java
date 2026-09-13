public class Person {
    private String name,email;
    Person(){}
    Person(String name,String email)
    {
        this.name=name;
        this.email=email;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
    void displayInfo()
    {
        System.out.println("Person Name: "+name);
        System.out.println("Person Email: "+email);
    }
}
