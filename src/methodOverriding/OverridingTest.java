package methodOverriding;

class Bank{
	public void getRateOfInterest(){
		System.out.println("Banks rate of interest");
	}
}

class SBI extends Bank{
	public void getRateOfInterest(){
		System.out.println("SBI rate of interest is : 8 ");
	}
}

class ICICI extends Bank{
	public void getRateOfInterest(){
		System.out.println("ICICI rate of interest is : 9 ");
	}
}

class HDFC extends Bank{
	public void getRateOfInterest(){
		System.out.println("HDFC rate of interest is : 8.5");
	}
}


public class OverridingTest {
	public static void main(String[] args) {
		SBI sbi = new SBI();
		sbi.getRateOfInterest();
		ICICI icici = new ICICI();
		icici.getRateOfInterest();
		HDFC hdfc = new HDFC();
		hdfc.getRateOfInterest();
	}
	

}
