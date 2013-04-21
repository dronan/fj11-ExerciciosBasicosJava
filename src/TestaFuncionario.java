
public class TestaFuncionario {

	public static void main(String[] args) {
		/*
		Funcionario f1 = new Funcionario();
		
		f1.nome = "Fiodor";
		f1.departamento = "TI";
		f1.salario = 100;
		f1.rg = "123.456.789-x";
		f1.dataEntrada = "10/10/2000";
		f1.bonifica(50);
		f1.estaNaEmpresa = true;
		f1.demite();
		
		f1.mostra();
		
		
		*/
		/*
		Funcionario f1 = new Funcionario();
		
		f1.nome = "Fiodor";
		f1.salario = 100;		
		
		Funcionario f2 = new Funcionario();
		f2.nome = "Fiodor";
		f2.salario = 100;
		
		if (f1 == f2){
			System.out.println("iguais");
		}else{
			System.out.println("diferentes");
		}
		*/
		
		/*
		Funcionario f1 = new Funcionario();
		
		f1.nome = "Fiodor";
		f1.salario = 100;		
		
		Funcionario f2 = f1;

		if (f1 == f2){
			System.out.println("iguais");
		}else{
			System.out.println("diferentes");
		}
		*/
	
		Funcionario f1 = new Funcionario();
		Data data = new Data();
		
		f1.setDataDeEntrada(data);
		
		f1.setNome("Fiodor");
		f1.setDepartamento("TI");
		f1.setSalario(100);
		f1.setRg("123.456.789-x");
		
		data.dia = 10;
		data.mes = 12;
		data.ano = 2011;
		
		f1.bonifica(50);
		f1.setEstaNaEmpresa(true);
		//f1.demite();
		
		f1.mostraDataDeEntrada();
		
	
	}

}
