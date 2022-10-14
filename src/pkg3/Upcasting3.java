package pkg3;

public class Upcasting3 {

	public static void main(String[] args) {
		
		//##############Creating object of class up casting################
		

		upcasting a=new upcasting();
		
		a.Address();
		a.collegeName();
		//################creating object of class Upcasting1###############
		System.out.println("=================================================");
		
		Upcasting1 b=new Upcasting1();
		b.Address();
		b.collegeName();
		b.MobileNumber();
		//################creating object with the help of up casting###############
		System.out.println("====================================================");
		
		upcasting c=new Upcasting1();
		c.Address();
		c.collegeName();
		
		//###############down casting######################
		
		System.out.println("================================================");
		Upcasting1 d=(Upcasting1)c;
		d.collegeName();
		d.Address();
		d.MobileNumber();
		
		
		
		
		
		
		
		
		
	}

}
