//St�ffane Leal Silva Santos - 2312131

public class Biodegradavel extends Garrafa{

	private String material;
	private int tempoDecomposicao;

	
	//M�todo Construtor
	//Polimorfismo por sobrecarga

	public Biodegradavel(){
		this.material = getMaterial();
		this.tempoDecomposicao = getTempoDecomposicao();
	}
	
	public Biodegradavel(String material, int tempoDecomposicao){
		this.material = material;
		this.tempoDecomposicao = tempoDecomposicao;
	}	


	//M�todos getters

	public String getMaterial(){
		return material;
	}
	
	public int getTempoDecomposicao(){
		return tempoDecomposicao;
	}


	//M�todos setters

	public void setMaterial(String material){
		this.material = material;
	}

	public void setTempoDecomposicao(int tempoDecomposicao){
		if (tempoDecomposicao > 0){
			this.tempoDecomposicao = tempoDecomposicao;
		}else{
			System.out.println("\nO tempo de decomposicao n�o pode ser negativo.");
			this.tempoDecomposicao = 1;
		}
	}
}