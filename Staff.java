public class Staff extends Employee{
    private String title;

    public Staff(String name, String address, String phone, String email, String office, double salary, MyDate dateHired, String title) {
        super(name, address, phone, email, office, salary, dateHired);
        this.title = title;
    }
    //getter and setter methods
    public String getTitle(String title) {
        return title;
    } 
    public void setTitle(){
        this.title = title;
    }
    public String toString(){
        return "Staff: " + " name " + " title ";
    }

}