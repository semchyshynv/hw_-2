package hw_2;

public class hw_2 {

	public static void main(String[] args) {
		
		//Завдання1
		int a;
		double b;
		float c;
		boolean d;
		char e;
		byte f;
		short g;
		long h;
		
		

		//Завдання 2
		System.out.println("Int  = " + Integer.MAX_VALUE);
		System.out.println("Int  = " + Integer.MIN_VALUE);
		
		System.out.println("Double  = " + Double.MAX_VALUE);
		System.out.println("Double  = " + Double.MIN_VALUE);
		
		System.out.println("Float  = " + Float.MAX_VALUE);
		System.out.println("Float  = " + Float.MIN_VALUE);
		
		System.out.println("Boolean = " + Boolean.TRUE);
		System.out.println("Boolean = " + Boolean.FALSE);
		
		System.out.println("Chat  = " + Character.MAX_RADIX);
		System.out.println("Char  = " + Character.MIN_RADIX);

		System.out.println("Byte  = " + Byte.MAX_VALUE);
		System.out.println("Byte  = " + Byte.MIN_VALUE);
		
		System.out.println("Short  = " + Short.MAX_VALUE);
		System.out.println("Short  = " + Short.MIN_VALUE);
		
		System.out.println("Long  = " + Long.MAX_VALUE);
		System.out.println("Long  = " + Long.MIN_VALUE);
		
		
		
		//Завдання 3
		int[] ar = {3, 4, 7, 2, 7, 11, 5, 12, 15, 13};
		max(ar);
		min(ar);
		}
		
		public static void max(int []a){
		int max = a[0];
		for(int i = 1; i<a.length; i++) {
		if(max<a[i]){max=a[i];}
		}
		System.out.println("Max arrey = " + max);
		}
		
		public static void min(int []a){
		int min = a[0];
		for(int i = 1; i<a.length; i++) {
		if(min>a[i]){min=a[i];}
		}
		System.out.println("Min arrey = " + min);
		}
	}

