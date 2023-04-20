class Person {
  private String name;
  private String address;
  private String phoneNumber;
  private String emailAddress;

  Person(String name, String address, String phoneNumber, String emailAddress) {
    this.name = name;
    this.address = address;
    this.phoneNumber = phoneNumber;
    this.emailAddress = emailAddress;
  }

  // getter and setter methods

  //@Override
  public String toString() {
    return "Name: " + name;
  }
}