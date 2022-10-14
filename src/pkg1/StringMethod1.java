package pkg1;

import java.util.Arrays;

public class StringMethod1 {

	public static void main(String[] args) {
		
		
		String a="Velocity is in Katraj";
		String[] k=a.split(" ");
		
		System.out.println(Arrays.toString(k));
		
		System.out.println(a.equals("Velocity is in Katraj"));
		System.out.println(a.equalsIgnoreCase("velocity is in katraj"));
		System.out.println(a.contains("is"));
		System.out.println(a.toUpperCase());
		System.out.println(a.toLowerCase());
		System.out.println(a.length());
		System.out.println(a.indexOf("i"));
		System.out.println(a.concat(" from pune"));
		System.out.println(a.endsWith("j"));
		System.out.println(a.indexOf("y", 2));
		System.out.println(a.charAt(3));
		System.out.println(a.indexOf("is"));
		System.out.println(a.replace("i", "I"));
		
		
		String b=new String("Logical");
		
		String p=b.intern();
		
		System.out.println(b==p);
		
		
		
		
		

	}

}
