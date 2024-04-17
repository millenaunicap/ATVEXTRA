package HerançaEPolimorfismo;

public class Main {
	
	 public static void main(String[] args) {
		
	        Caixa caixa1 = new Caixa("001", "Objeto comum", 10, 20);
	        CaixaFragil caixa2 = new CaixaFragil("002", "Objeto fragil", 15, 25);
	        Caixa caixa3 = new Caixa("003", "Objeto comum", 18, 2);

	        PilhaDeCaixas pilha = new PilhaDeCaixas(50);
	        
	        
	        pilha.empilhar(caixa1);
	        pilha.empilhar(caixa2);
	        pilha.empilhar(caixa3);
	        
	       

	        /*pilha.desempilhar();
	        pilha.desempilhar();*/
	        
	        
	        pilha.exibirDados();
	    }

}
