import java.util.Arrays;
public class Ordenacao_de_numeros {
	
	public static void main (String[] args) {
		
		//int[] a = {3, 1, 6, 8, 9}; uma forma de array
		int[] a = new int[(int)(Math.random()*20)+1];
		System.out.print("Vetor A original: ");
		for(int i=0; i<a.length; i++){
			a[i] = (int)(Math.random()*10);
			System.out.print(a[i]+" ");
			}
		System.out.println();
		System.out.println("Vetor A modificada: ");
		Arrays.sort(a);
		for(int i=a.length-1; i>=0; i--){//versao invertida
			System.out.print(a[i]+" ");
			}
		
		
	}
}

