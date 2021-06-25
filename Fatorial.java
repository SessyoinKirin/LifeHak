public class Fatorial {
	
	public static void main (String[] args) {
		
		int fatorial=1;
		for(int i=10; i>=1; i--){//aqui inverte ordem
			fatorial=1;
			System.out.print(i+": ");
			for(int j=1; j<=i; j++){
				fatorial*=j;
				}
			System.out.print(fatorial+" ");
			System.out.println();
			}
		
	}
}

