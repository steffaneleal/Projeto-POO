//Stéffane Leal Silva Santos - 2312131

public class Garrafa{

	//Atributos (variáveis globais) encapsulados (private)

		private String formato;	
		private String conteudo;
		private String cor;
		private int capacidade;
		private int preco;	
		private int tipo;
	
		private Mercado merc;


	//Método construtor
	//Polimorfismo por Sobrecarga	

	public Garrafa(){ 
		this.formato = getFormato(); 
		this.conteudo = getConteudo();
		this.cor = getCor();
		this.capacidade = getCapacidade();
		this.preco = getPreco();
		this.tipo = getTipo();
		merc = new Mercado();
	}

	public Garrafa(String formato, String conteudo, String cor, int capacidade, int tipo, Mercado merc){
		this.formato = formato;
		this.conteudo = conteudo;
		this.cor = cor;
		this.capacidade = capacidade;
		this.preco = preco;
		this.merc = merc;
	}
	

	/*
	//Interface
	public void selectTipo(){
		if(tipo == 1){
			System.out.println("A garrafa escolhida e: " +texto1);
		}
		if(tipo == 2){
			System.out.println("A garrafa escolhida e:  " +texto2);
		}	
	}
	*/		


	//Mercado

	public Mercado getMerc(){
		return merc;
	}

	public void setMerc(Mercado merc){
		this.merc = merc;
	}

//	


	//Polimorfismo por Sobrecarga	



	//Métodos getters 

	public String getFormato(){
		return formato;
	}	

	public String getConteudo(){
		return conteudo;
	}

	public String getCor(){
		return cor;
	}		

	public int getCapacidade(){
		return capacidade;
	}
	
	public int getPreco(){
		return preco;
	}	

	public int getTipo(){
		return tipo;
	}	


	//Métodos setters 

	public void setFormato(String formato){
		this.formato = formato;
	}
	
	public void setConteudo(String conteudo){
		this.conteudo = conteudo;
	}

	public void setCor(String cor){
		this.formato = formato;
	}

	public void setCapacidade(int capacidade) throws CapacidadeException{
		int capacidadeMinima = 1;
			if(capacidade >= capacidadeMinima){
				this.capacidade = capacidade;
			}else{
				throw new CapacidadeException();		
			}
	}
	
	public void setPreco(int preco) throws PrecoException{
		int precoMinimo = 2;
	
			if (preco >= precoMinimo){
				this.preco = preco;
			}else{
				throw new PrecoException();
			}
	}

	public void setTipo(int tipo){
		this.tipo = tipo;
	}
}