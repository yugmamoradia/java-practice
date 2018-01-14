package assignment1;

public class OOPConcept {
    public static void main(String[] args) {
        Application application = new Application();
        application.display();
    }
}

class Application{
    /**Instance Variable*/
    String firstName;
    String lastName;
    int year;
    double salary;

    Application(){
            firstName = "default first name";
            lastName = "default last name";
            year = 1990;
            salary = 100000.00;
    }



    void display(){
        System.out.println("First name : "+firstName);
        System.out.println("Last name: "+lastName);
        System.out.println("Year of birth: "+year);
        System.out.println("salary: "+salary);

    }
}
