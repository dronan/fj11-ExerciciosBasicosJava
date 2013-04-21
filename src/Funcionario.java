public class Funcionario {
	
	private String nome;
	private String departamento;
	private double salario;
	private String dataEntrada;
	private String rg;
	private boolean estaNaEmpresa;
	
	private Data dataDeEntrada;
	
	public String getNome(){
		return this.nome;
	}
	
	public void setNome(String nome){
		this.nome = nome;
	}
	
	public String getDepartamento(){
		return this.departamento;
	}
	
	public void setDepartamento(String departamento){
		this.departamento = departamento;
	}
	
	public double getSalario(){
		return this.salario;
	}
	
	public void setSalario(double salario){
		this.salario = salario;
	}
	
	public String getDataEntrada(){
		return this.dataEntrada;
	}
	
	public void setDataEntrada(String dataEntrada){
		this.dataEntrada = dataEntrada;
	}
	
	public String getRg(){
		return this.rg;
	}
	
	public void setRg(String rg){
		this.rg = rg;
	}
	
	public boolean getEstaNaEmpresa(){
		return this.estaNaEmpresa;
	}
	
	public void setEstaNaEmpresa(boolean estaNaEmpresa){
		this.estaNaEmpresa = estaNaEmpresa;
	}
	
	public Data getDataDeEntrada(){
		return this.dataDeEntrada;
	}
	
	public void setDataDeEntrada(Data dataDeEntrada){
		this.dataDeEntrada = dataDeEntrada;
	}
	
	
	
	public void bonifica(double aumento){
		this.salario += aumento;
	}
	
	public void demite(){
		this.estaNaEmpresa = false;
	}
	
	public void mostra(){
		System.out.println("Nome: "+this.nome+
							"\nDepartamento: "+this.departamento+
							"\nSalario: "+this.salario+
							"\nData de Entrada: "+this.dataEntrada+
							"\nRG: "+this.rg+
							"\nEsta na Empresa? "+this.estaNaEmpresa);

	}
	
	public void mostraDataDeEntrada(){
		System.out.println("Nome: "+this.nome+
							"\nDepartamento: "+this.departamento+
							"\nSalario: "+this.salario+
							"\nData de Entrada: "+this.dataDeEntrada.dia+"/"+this.dataDeEntrada.mes+"/"+this.dataDeEntrada.ano+
							"\nRG: "+this.rg+
							"\nEsta na Empresa? "+this.estaNaEmpresa);

	}
}

class Empresa {
	private String nome;
	private String cnpj;
	private int n = 0;
	public Funcionario[] empregados;

	
	public String getNome(){
		return this.nome;
	}
	
	public void setNome(String nome){
		this.nome = nome;
	}
	
	public String getCnpj(){
		return this.cnpj;
	}
	
	public void setCnpj(String cnpj){
		this.cnpj = cnpj;
	}
	
	public int getN(){
		return n;
	}
	
	public void getN(int n){
		this.n = n;
	}
	/*
	public void setEmpregados(Funcionario[] empregados){
		this.empregados = empregados;
	}
	
	public Funcionario[] getEmpregados(){
		return this.empregados;
	}
	*/
	
	
	public void adiciona(Funcionario f){
		/*if (n < this.empregados.length){
			empregados[n] = f;
			n++;
		}else{
			System.out.println("\nO vetor esta cheio!\n");
		}*/
		
		for (int i = 0; i < this.empregados.length; i++){
			if (empregados[i] == null) {
				this.empregados[i] = f;
				return;
			}
		}
		
		Funcionario[] novaArray = new Funcionario[this.empregados.length + 1]; // Abre uma nova array com o tamanho da array a ser destruida somando 1 ao tamanho
		for (int i = 0; i < this.empregados.length; i++ ){
			novaArray[i] = empregados[i]; // varre 100% a array anterior repassando os valores para a nova
		}
		
		this.empregados = novaArray; // declara a array anterior com os dados da nova array
		
		this.adiciona(f); // adiciona o funcionario 
	}
	
	public boolean contem(Funcionario f){
		boolean esta = false;
		for (int i = 0; i < this.empregados.length; i++){
			if (empregados[i] == f){
				esta = empregados[i].getEstaNaEmpresa();
				break;
			}
		}
		return esta;
	}
	
	public void mostraEmpregados(){
		for(int i = 0; i < this.empregados.length; i++){
			//System.out.println("Funcionario na posicao: " +i+"\nNome: "+empregados[i].nome +"\nSalario: "+empregados[i].salario+"\n");
			empregados[i].mostra();
			System.out.println("\n*******************\n");
		}
	}
	
	
}
