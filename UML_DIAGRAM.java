PERSON
-name: String
-address: String
-phoneNumber: String
-emailAddress: String
+Person(name: String, address: String, phoneNumber: String ,emailAddress: String)
+getName():String
+getAddress():String
+getPhoneNumber():String
+getEmailAddress():String

+setName():String
+setAddress(newAddress:String):String
+setPhoneNumber(newPhonNumber:String):String
+setEmailAddress(newEmailAddress:String):String
+toString():String

Student
-status:String
+getStatus():String
+setStatus(newStatus:double)
+toString():String





Employee
-office:String
-Salary:String
-dateHired:MyDate
+getSalary():double
+getDateHired():MyDate
+setSalary(newSalart:double):String
+setDateHired(newDateHired):String

Faculty(Extend Employee)
-officeHour:String
-rank:String
+getOfficeHours():String
+getRank():String
+setOfficeHours(newOficeHours:String):String
+setRank(newRak:String)
toString():String

Staff(Extend Employee)
-title:String
+getTitle()String
+setTitle(newTitle):String
+toString():String

