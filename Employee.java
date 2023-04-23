class Employee extends Person {
    private String office;
    private double salary;
    private MyDate dateHired;

    Employee(String name,  String address,String phoneNumber, String emailAddress, String office, double salary, MyDate dateHired){
         super(name, address, phoneNumber, emailAddress);
         this.office = office;
         this.salary = salary;
         this.dateHired = dateHired;
    }
    //getter and setter methods
    public double getSalary(){
        return salary;
    }
    public void setSalary(double salary){
        this.salary = salary;
    }
    public MyDate getDateHired(){
        return dateHired;
    }
    public String toString() {
        return super.toString() + "\nOffice: " + office;
    }
}