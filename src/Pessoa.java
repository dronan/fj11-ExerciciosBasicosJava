
public class Pessoa {

	public static void main(String[] args) {
		int y;
		
		Pessoa pessoa = new Pessoa();
		
		pessoa.nome = "Pessoa";
		pessoa.idade = 13;
		y = pessoa.fazAniversario(pessoa.idade);
		
		System.out.println("Nome: "+ pessoa.nome + "\nIdade: " + pessoa.idade + " anos" + "\nIdade Nova: " + y + " anos " );

	}
	
	String nome;
	int idade;
	int idadeNova;
	
	int fazAniversario(int x){
		return idadeNova = x + 1; 
	}

}
