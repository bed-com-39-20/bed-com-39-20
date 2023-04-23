class Student extends Person{
    public static final String FRESHMAN = "freshman";
    public static final String SOPHOMORE = "sophomore";
    public static final String JUNIOR = "junior";
    public static final String SENOIR = "senior";
    private String classStatus;

    Student(String name, String address, String phoneNumber, String emailAddress, String classStatus){
        super(name, address, phoneNumber, emailAddress);
        this.classStatus = classStatus;
    }
    //getter and setter methods
    public String getClassStatus(){
           return classStatus; 
    }
    public void setClassString(String newStatus){
           classStatus = newStatus;
    }
    public String toString() {
        return super.toString() + "\nClass Status: " + classStatus;
    }
} 
