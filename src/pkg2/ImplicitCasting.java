package pkg2;

public class ImplicitCasting {

	public static void main(String[] args) {
		
		//byte-short-int-long-float-double
		// converting low size data type to higher size data type
		
		
		
		byte a=102;
		
		int b=a;                                                                   //we can easily convert it without using any operator
		System.out.println(b);
		
		int c=120;
		
		float d=c;
		System.out.println(d);
		
		int e=20;
		float f=10.5f;
		//float h=e;                                  //we have convert int data type to float for addition
		
	float g=e+f;
		
		System.out.println(g);
		
		long x=123000;
		float y=x;
		System.out.println(y);
		
		int p=100;
		String q=String.valueOf(p);
		System.out.println(p+100);
		System.out.println(q+200);
		
		String s="12345";
	     int i=Integer.parseInt(s);
	     System.out.println(i);
		
		
		
		
		
		
		
		
		
		
		
		

	}

}
