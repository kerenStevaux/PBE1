package prjPokémon;

public class Aplicacao {

	public static void main(String[] args) {
		
		//Instanciamento de classe
		Pokémon pikachu = new Pokémon("Pikachu", "Elétrico", 2, 25);
		Pokémon Arcanine = new Pokémon("Arcanine", "Fogo", 4, 50);
		Pokémon Dugtrio = new Pokémon("Dugtrio", "Terra", 6, 75);
		Pokémon Golduck = new Pokémon("Golduck", "Água", 8, 100);
		Pokémon Persian = new Pokémon("Persian", "Normal", 10, 125);
		
		pikachu.evoluir();
		pikachu.atacar();
		pikachu.exibirInfo();
		
		Arcanine.evoluir();
		Arcanine.atacar();
		Arcanine.exibirInfo();
		
		Dugtrio.evoluir();
		Dugtrio.atacar();
		Dugtrio.exibirInfo();
		
		Golduck.evoluir();
		Golduck.atacar();
		Golduck.exibirInfo();
		
		Persian.evoluir();
		Persian.atacar();
		Persian.exibirInfo();
		
	}

}