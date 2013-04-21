//Crie uma porta, abra e feche a mesma, pinte-a de diversas cores, altere suas dimensões e use o método
//estaAberta para verificar se ela está aberta.

public class Porta {
	public static void main(String[] args) {
		Porta porta = new Porta();
		
		porta.cor = "amarelo";
		porta.dimensaoX = 14;
		porta.dimensaoY = 16;
		porta.dimensaoZ = 15;
		porta.pinta("azul");
		
		
		porta.aberta = false;

		porta.abre();
		//porta.fecha();
		
		porta.estaAberta();
			
		
		//System.out.println("step 3 "+porta.aberta);
		
		//System.out.println("Cor atual: "+porta.cor);
		
		System.out.println("dimensao x: " + 	porta.dimensaoX);
		System.out.println("dimensao y: " + 	porta.dimensaoY);
		System.out.println("dimensao z: " + 	porta.dimensaoZ);
		
		
	}

	boolean aberta;
	String cor;
	int dimensaoX;
	int dimensaoY;
	int dimensaoZ;
	
	void abre(){
		this.aberta = true;
	}
	
	void fecha(){
		this.aberta = false;
	}
	
	void pinta(String s){
		this.cor = s;
		System.out.println("Cor alterada para: "+this.cor);
	}
	
	boolean estaAberta(){
		if (this.aberta == true) {
			System.out.println("a porta está aberta");
			return true;
		}else{
			System.out.println("a porta está fechada");
			return false;
		}
	}
	
}
