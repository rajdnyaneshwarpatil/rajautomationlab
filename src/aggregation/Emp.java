package aggregation;

public class Emp {
	
	int id;
	float salary;
	Address address;
	
	Emp(int id, float salary, Address address){
		
		this.id = id;
		this.salary = salary;
		this.address = address;
	}
	
	    public void display(){
		System.out.println(id + " " + salary);
		System.out.println(address.city +" "+ address.state +" "+ address.country );
	}

	public static void main(String[] args) {
		
		Address address1 = new Address("Raver","Maharashtra","India");
		
		Emp E1 = new Emp(01,50000,address1);
		E1.display();

	}

}
