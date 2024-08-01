package programcao_backend;
import java.util.Scanner;
public class atividade01 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Me informe um número ");
		int numero = sc.nextInt();
		
		System.out.println("Me informe outro número ");
		int outro = sc.nextInt();
		
		System.out.println("A soma dos números é: " + (numero+outro));
		
		sc.close();

	}

}