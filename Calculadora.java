import java.util.Scanner;
public class Calculadora {
	
	static void soma(int n1, int n2){
		int resultado = n1+n2;
		System.out.println("A soma dos numeros eh: "+resultado);
		}
	
	static void sub(int n1, int n2){
		int resultado = n1-n2;
		System.out.println("A subtracao dos numeros eh: "+resultado);
		}
	
	static void multi(long n1, long n2){
		long resultado = n1*n2;
		System.out.println("A multiplicacao dos numeros eh: "+resultado);
		}
	
	static void dividir(double n1, double n2){
		double resultado = n1/n2;
		System.out.println("A divisao dos numeros eh: "+resultado);
		}
	
	static void erro(){
		System.out.println("Elemento invalido, redigite(+,-,*,/)");
		}
	
	public static void main (String[] args) {
		
		Scanner ler = new Scanner(System.in);
		Scanner leia = new Scanner(System.in);
		int n1, n2, tm;
		char sinal;
		do{
			System.out.print("Digite um valor: ");
			n1 = ler.nextInt();
			System.out.print("Digite outro valor: ");
			n2 = ler.nextInt();
			System.out.print("Digite a sinal: ");
			sinal = leia.nextLine().charAt(0);
			switch(sinal){
				case '+':
					soma(n1, n2);
					break;
				case '-':
					sub(n1, n2);
					break;
				case '*':
					multi(n1, n2);
					break;
				case '/':
					dividir(n1, n2);
					break;
				default:
					erro();
				}
			System.out.print("Digite \'0\' para finalizar programa ou qualquer outra numero para repetir o processo: ");
			tm = ler.nextInt();
			}while(tm != 0 );
		
	}
}

