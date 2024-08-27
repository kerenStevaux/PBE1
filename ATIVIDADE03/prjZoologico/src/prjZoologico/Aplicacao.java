package prjZoologico;

public class Aplicacao {

	public static void main(String[] args) {
		ClasseAnimal elefante = new ClasseAnimal();
		elefante.atributoNome = "Dumbo";
		elefante.atributoRaca = "Africano";
		elefante.atributoSexo = "Macho";
		elefante.atributoPeso = 170; 
		
		ClasseAnimal girafa = new ClasseAnimal("Girafales", "Russa", "Femea", 50);
		
		SubClasseCarnivoro leao = new SubClasseCarnivoro();
		leao.atributoNome = "Liona";
		leao.atributoRaca = "Australeandro";
		leao.atributoSexo = "Femea";
		leao.atributoPeso = 125;
		
		elefante.exibirInf();
		
		elefante.metodoComer(); 
		
		elefante.exibirInf();
		
		girafa.exibirInf();
	
		

	}
	

}
