//Stéffane Leal Silva Santos - 2312131

public class Mercado{

	private String empresa = "";
	private String setor = "";
	private int prateleira = 0;
	 
	

	//Método Construtor
	public Mercado(){
		this.empresa = getEmpresa();
		this.setor = getSetor();
		this.prateleira = getPrateleira();
	}



	//Métodos getters 

	public String getEmpresa(){
		return empresa;
	}

	public String getSetor(){
		return setor;
	}

	public int getPrateleira(){
		return prateleira;
	}


	//Métodos setters 
	
	public void setEmpresa(String empresa){
		this.empresa = empresa;
	}

	public void setSetor(String setor){
		this.setor = setor;
	}

	public void setPrateleira(int prateleira){
		if (prateleira > 0){
			this.prateleira = prateleira;
		}else{
			System.out.println("\nA prateleira não pode ser negativa.");
			this.prateleira = 1;
		}		
	}	

}