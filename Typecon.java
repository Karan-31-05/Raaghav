package week1;

public class Typecon {
	public static void main (String args[])
	{
		int a = 2;
		float b = 2.45f;
		float c = a;  //implicit type conversion
		int d = (int)b;
		
		System.out.println("Widening type conversion(int to float): " + c);
		System.out.println("Narrowing type conversion(float to int): " + d);
	}
}
