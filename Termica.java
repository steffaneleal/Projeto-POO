//Stéffane Leal Silva Santos - 2312131		

public class Termica extends Garrafa{

	//Atributos encapsulados
		
		private int temperaturaMax;
		private String marca;


	//Método construtor
	//Polimorfismo por sobrecarga

	public Termica(){
		this.temperaturaMax = getTemperaturaMax();
		this.marca = getMarca();
	}
	
	public Termica(int temperaturaMax,String marca){
		this.temperaturaMax = temperaturaMax;
		this.marca = marca;
	}


	//Métodos getters
	
	public int getTemperaturaMax(){
		return temperaturaMax;
	}
	
	public String getMarca(){
		return marca;
	}


	//Métodos setters
	
	public void setTemperaturaMax(int temperaturaMax){
		if (temperaturaMax > 0){
			this.temperaturaMax = temperaturaMax;
		}else{
			System.out.println("\nA temperatura não pode ser negativa.");
			this.temperaturaMax = 1;
		}
	}

	public void setMarca(String marca){
		this.marca = marca;
	}


}