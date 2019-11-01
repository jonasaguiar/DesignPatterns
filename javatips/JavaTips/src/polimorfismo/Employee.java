package polimorfismo;
public class Employee {
   public String name;
   public String address;
   public int number;
public int SSN;
 
   public Employee(String name, String address, int number) {
      System.out.println("Constructing an Employee");
      this.setName(name);
      this.address = address;
      this.setNumber(number);
   }
 
   public Employee() {
	// TODO Auto-generated constructor stub
}

public void mailCheck() {
      System.out.println("Mailing a check to " + this.getName() + " " + this.address);
   }
 
   public String toString() {
      return getName() + " " + address + " " + getNumber();
   }
 
   public String getName() {
      return name;
   }
 
   public String getAddress() {
      return address;
   }
 
   public void setAddress(String newAddress) {
      address = newAddress;
   }
 
   public int getNumber() {
      return number;
   }

public void setName(String name) {
	this.name = name;
}

public void setNumber(int number) {
	this.number = number;
}
}