
public class TestaEmpresa {

	public static void main(String[] args) {

		Empresa empresa = new Empresa(); // Ativa a classe Empresa
		empresa.empregados = new Funcionario[2]; // Ativa a array empregados, a vinculando a um Funcionario com N posições
		
		Funcionario f1 = new Funcionario(); // Starta um funcionario
		f1.setSalario(300);
		f1.setNome("funcionario 01");
		f1.setEstaNaEmpresa(true);
		empresa.adiciona(f1); // Adiciona na array um funcionario
		
		
		Funcionario f2 = new Funcionario();
		f2.setSalario(200);
		f2.setNome("funcionario 02");
		f2.setEstaNaEmpresa(false);
		empresa.adiciona(f2);
		
		Funcionario f3 = new Funcionario();
		f3.setSalario(1200);
		f3.setEstaNaEmpresa(true);
		f3.setNome("funcionario 03");
		empresa.adiciona(f3);
		
		Funcionario f4 = new Funcionario();
		f4.setSalario(1200);
		f4.setEstaNaEmpresa(true);
		f4.setNome("funcionario 04");
		empresa.adiciona(f4);
		
		empresa.mostraEmpregados();
		
		//empresa.contem(f3);
		
	}

}
