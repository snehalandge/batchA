package pkg2;

public class ExplicitCasting {

	public static void main(String[] args) {
		
		// double-float-long-int-short-byte,narrowing casting
		
		// high size data type conversion in to low size data type
		
		
		
		double a=120.504;//data loss
		                                        // we have to use casting operator for conversion
		                         // co is nothing but the data type in which we have to convert mention in paranthesis 
		                          
		
		int b=(int)a;  
		
		System.out.println(b);
		
		int c=1200; // data changed
		byte d=(byte)c;
		System.out.println(d);
		
		float e=120.5f;
		
		long f=(long)e;
		System.out.println(f);
		
		int k=200;  // data same
		float k1=(float)k;
		
		
		System.out.println("##############################################################");
		
		char x='@'; 
		
		int y=(int)x;
		
		System.out.println(y);                  // when we are converting from char to int we do implicit casting
		
		
		int p=93;                               //from converting int to char we do explicit casting
		
	//	char q=(char)p;
	//	System.out.println(q);
		
		
		double s=10000;
		char t=(char)s;
		System.out.println(t);
		
		byte v=36;
		char z=(char)v;
		System.out.println(z);
		
		
		
		char m='$';
		byte n=(byte)m;
		System.out.println(n);
		
		float s1=120.5f;
		long s2=(long)s1;
		System.out.println(s2);
		
		
	    byte x1=37;
	    char x2=(char)x1;
	    System.out.println(x2);
	 
		
		
		
		
		
		
		
		
		
		
		                                
		

	}

}
