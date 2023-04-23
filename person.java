class Person{
     private String name;
     private String address;
     private String phoneNumber;
     private String emailAddress;

  public Person(String name, String address, String phoneNumber, String emailAddress){
     this.name = name;
     this.address = address;
     this.phoneNumber = phoneNumber;
     this.emailAddress = emailAddress;
  }
  // getter and setter methods
  // return name
  public String getName(){
       return name;
  }

  //set a new name
  public void setName(String name){
     this.name = name;
  } 
   //return address
  public String getAddress(){
     return address;
  }
    //set new address
  public void setAddress(String address){
     this.address = address;
  }

  // return phoneNumber
  public String getPhoneNumber(){
      return phoneNumber;
  }
  //set new phoneNumber
  public void setphoneNumber(String phoneNumber){
      this.phoneNumber = phoneNumber;
  }
   //return emailAddress
  public String getemailAddress(){
     return emailAddress;
  }
  // set new emailAdddress
  public void setemailAddress(String emailAddress){
      this.emailAddress = emailAddress;
  }
  public String toString(){
   return "Person : " + name;
  }
}