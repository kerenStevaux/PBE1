package prjCaneta;

import java.util.Scanner;

public class Aplicacao02 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);		
		Livro livro01 = new Livro("Alice no pais das maravilhas","Julio Traqueiro");
		Livro livro02 = new Livro("Quarto de despejo, a vida de uma faveralda","Carolina Maria de Jesus");
		
		System.out.println("Livros disponíveis: ");
		System.out.print("01. ");
		livro01.status();
		System.out.print("02. ");
		livro02.status();
		
		System.out.println("Qual o nome do livro que você gostaria de alugar?");
		int escolha = sc.nextInt();

	}

}
