package programcao_backend;
import java.util.Scanner;
public class atividade04 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.printf("Qual é o codigo de peça 01? " );
		int codigo = sc.nextInt();

		System.out.printf("Qual é a quantidade? " );
		int quant = sc.nextInt();

		System.out.printf("Qual é o valor unitário de cada peça? " );
		int valor = sc.nextInt();

		System.out.printf("Qual é o codigo de peça 02? " );
		int codigo2 = sc.nextInt();

		System.out.printf("Qual é a quantidade? " );
		int quant2 = sc.nextInt();

		System.out.printf("Qual é o valor unitário de cada peça? " );
		int valor2 = sc.nextInt();

		System.out.println("O valor total é: " + (quant*valor*quant2*valor2));

	}

}
