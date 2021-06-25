public class Fibonacci {
	
	public static void main (String[] args) {
		
		int a=0, b=1, c;
		for(int i=1; i<=20; i++){
			System.out.print(a+" ");
			c=b+a;
			a=b;
			b=c;
			}
		
	}
}

