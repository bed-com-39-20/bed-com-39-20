
//importing  scanner
import java.util.Scanner;

public class ClassTest{
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        //creating a Person object

        System.out.println("Person Class");
        String name = input.nextLine();

        System.out.println("Enter person's address: ");
        String address = input.nextLine();

        System.out.println("Enter person's phoneNumber: ");
        String phoneNumber = input.nextLine();

        System.out.println("Enter person's emailAddress: ");
        String emailAddress = input.nextLine();

        Person person = new Person(name, address, phoneNumber, emailAddress);
        System.out.println();
        System.out.println(person.toString());

        // creating a Student object
        System.out.println("Student Class");
        System.out.println("Enter student's name: ");
        name = input.nextLine();

        System.out.println("Enter student's address: ");
        address = input.nextLine();

        System.out.println("Enter student's phoneNumber: ");
        phoneNumber = input.nextLine();

        System.out.println("Enter student's emailAddress: ");
        emailAddress = input.nextLine();

        System.out.println("Enter student's class status (1 as Freshman, 2 as Sophomore, 3 as Junior, 4 as Senior): ");
        String classStatus = input.nextLine();

        Student student = new Student(name, address, phoneNumber, emailAddress, classStatus);
        System.out.println();
        System.out.println(student.toString());

        // creating an Employee object
        System.out.println("Employee Class");

        System.out.println("Enter employee's name: ");
        name = input.nextLine();

        System.out.println("Enter employee's address: ");
        address = input.nextLine();

        System.out.println("Enter employee's phoneNumber: ");
        phoneNumber = input.nextLine();

        System.out.println("Enter employee's office: ");
        String office = input.nextLine();

        System.out.println("Enter employee's salary: ");
        double salary = input.nextDouble();

        System.out.println("Enter employee's hired year: ");
        int year = input.nextInt();

        System.out.println("Enter employee's hired month: ");
        int month = input.nextInt();

        System.out.println("Enter employee's hired day: ");
        int day = input.nextInt();

        MyDate dateHired = new MyDate(year, month, day);
        System.out.println("Enter employee's emailAddress: ");
        emailAddress = input.nextLine();

        Employee employee = new Employee(name, address, phoneNumber, emailAddress, office, salary, dateHired);
        System.out.println(employee.toString());

        // creating a Faculty object
        System.out.println(".... Faculty Class .....");
        System.out.println("Enter faculty member's name: ");
        name = input.nextLine();

        System.out.println("Enter faculty member's address: ");
        address = input.nextLine();

        System.out.println("Enter faculty member's phoneNumber: ");
        phoneNumber = input.nextLine();

        System.out.println("Enter faculty member's emailAddress: ");
        emailAddress = input.nextLine();

        System.out.println("Enter faculty member's office: ");
        office = input.nextLine();

        System.out.println("Enter faculty member's salary: ");
        salary = input.nextDouble();

        System.out.println("Enter faculty member's hired year: ");
        year = input.nextInt();

        System.out.println("Enter faculty member's hired month: ");
        month = input.nextInt();

        System.out.print("Enter faculty member's hired day: ");
        day = input.nextInt();

        
        System.out.print("Enter faculty member's officeHours: ");
        String officeHours = input.nextLine();

        System.out.println("Enter faculty member's rank: ");
        String rank = input.nextLine();

        Faculty faculty = new Faculty(name, address, phoneNumber, emailAddress, office, salary, dateHired, officeHours,
                rank);
        System.out.println(faculty.toString());

        // creating a Staff object
        System.out.println("Staff Class ");

        System.out.println("Enter staff member's name: ");
        name = input.nextLine();

        System.out.println("Enter staff member's address: ");
        address = input.nextLine();

        System.out.println("Enter staff member's phone number: ");
        phoneNumber = input.nextLine();

        System.out.println("Enter staff member's email address: ");
        emailAddress = input.nextLine();

        System.out.println("Enter staff member's office: ");
        office = input.nextLine();

        System.out.println("Enter staff member's salary: ");
        salary = input.nextDouble();

        System.out.println("Enter staff member's hire year: ");
        year = input.nextInt();

        System.out.println("Enter staff member's hire month: ");
        month = input.nextInt();

        System.out.println("Enter staff member's hire day: ");
        day = input.nextInt();

        dateHired = new MyDate(year, month, day);
        input.nextLine();

        System.out.println("Enter staff member's title: ");
        String title = input.nextLine();

        Staff staff = new Staff(name, address, phoneNumber, emailAddress, office, salary, dateHired, title);
        System.out.println(staff.toString());
    }
    public void inputPersonDetails() {
    }
}
