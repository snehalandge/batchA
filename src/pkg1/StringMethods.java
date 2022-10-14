package pkg1;

public class StringMethods {

	public static void main(String[] args) {
		
		
		String a=new String("velocity");
		String b=new String("velocity");     //declaration with using new keyword
		
		String c="velocity";
		String d="velocity";                 // declaration without using new keyword
		
		System.out.println(a==b);
		System.out.println(a==c);
		System.out.println(a==d);            //Here we compare the addresses by using ==operator
		System.out.println(b==c);
		System.out.println(b==d);
		System.out.println(c==d);
		
		System.out.println(a.equals(b));
		System.out.println(a.equals(c));     //Here we compare the data with the help of equals method
		System.out.println(a.equals(d));
		System.out.println(b.equals(c));
		System.out.println(b.equals(d));
		System.out.println(c.equals(d));
	
		
		
		

	}

}
