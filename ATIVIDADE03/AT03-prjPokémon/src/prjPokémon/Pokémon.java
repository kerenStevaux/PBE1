package prjPokémon;

public class Pokémon {
	
	//Atributos
	String nome;
	String tipo;
	double nivel;
	int hp;
	
	//Construtores
	public void Pokémon() {
	}
	
	public void Pokémon(String nome, String tipo, double nivel, int hp) {
		this.nome = nome;
		this.tipo = tipo;
		this.nivel = nivel;
		this.hp = hp;
	}
	//Metodos
	public void atacar() {
        System.out.println(nome + " usou um ataque!");
    }
        public void evoluir() {
        System.out.println(nome + " evoluiu!");
    }
        public void exibirInfo(){
        System.out.println();
	System.out.println("Nome: " + this.nome);
        System.out.println("Tipo: " + this.tipo);
        System.out.println("Nível: " + this.nivel);
        System.out.println("HP: " + this.hp);
    }
}
