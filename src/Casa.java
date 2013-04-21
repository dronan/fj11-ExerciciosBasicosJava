public class Casa {
	public static void main (String [] args){
		Casa casa = new Casa();
		casa.porta1 = true;
		casa.porta2 = false;
		casa.porta3 = true;
		
		casa.pinta("Amarela");
		System.out.println("Cor da casa: "+casa.cor);
		
		System.out.println("Portas abertas: "+ casa.quantasPortasEstaoAbertas());
		
	}
	
	boolean porta1;
	boolean porta2;
	boolean porta3;
	String cor;
	
	int quantasPortasEstaoAbertas(){
		
		int x1 = 0;
		int x2 = 0;
		int x3 = 0;
		
		x1 = ((this.porta1 == true) ? 1 : 0);
		x2 = ((this.porta2 == true) ? 1 : 0);
		x3 = ((this.porta3 == true) ? 1 : 0);
		
		return (x1 + x2 + x3);

	}
	
	void pinta(String s){
		this.cor = s;
	}
	
}
