
public class Fibonacci {

	public static void main(String[] args) {

		Fibonacci fibo = new Fibonacci();
		int i = fibo.calculaFibonacciTernario(6);
		System.out.println(i);
	}	

	
	public int calculaFibonacci(int x){
		
		if (x == 0) 
			return 0;
		
		
		if (x >= 2) {
			return x = calculaFibonacci(x - 1) + calculaFibonacci (x - 2);
		}else{
			return 1;
		}
	 
	}
	
	
	public int calculaFibonacciTernario(int x){
		return(x <= 2 ? 1 : calculaFibonacci(x - 1) + calculaFibonacci (x - 2));
	}

}
