//Stéffane Leal Silva Santos - 2312131


//função main
public class Principal{

	public static void main(String arg[]){ 

		//chamando as classes

		Leitura l = new Leitura();
		Garrafa g = new Garrafa();
		

		//entrada de dados via teclado

		System.out.println("\n\n\nPor favor, informe:");
		g.setFormato(l.entDados("o formato: "));
		g.setConteudo(l.entDados("o conteudo: "));
		g.setCor(l.entDados("a cor: "));



		//Tratamento de Exce��es
		try{
			g.setCapacidade(Integer.parseInt(l.entDados("\nInforme a capacidade da garrafa (em litros).")));
		}
		catch(CapacidadeException ec){
			System.out.println("ERRO!");
			ec.exibeProblema();
		}
		try{
			g.setPreco(Integer.parseInt(l.entDados("Informe o pre�o (em reais).")));
		}
		catch(PrecoException pe){
			System.out.println("ERRO!");
			pe.exibeProblema();
		}


		//Mercado
		g.getMerc().setEmpresa(l.entDados("\na empresa a qual o mercado pertence: "));
		g.getMerc().setSetor(l.entDados("o setor do mercado: "));
		g.getMerc().setPrateleira(Integer.parseInt(l.entDados("a prateleira: ")));
		
	
		//Heran�a + interface	
		Termica termica = new Termica();
		Biodegradavel biodegradavel = new Biodegradavel();
		 
			System.out.println("\n\n\n\nOp��es");
			System.out.println("1 - Termica");
			System.out.println("2 - Biodegradavel");

		int opcao = Integer.parseInt(l.entDados("\nPor favor, escolha o n�mero: "));

		
		switch(opcao){
			case 1:

				g.setTipo(1);
				//entrada

				System.out.println("\n\n\nPor favor, informe: ");
				termica.setTemperaturaMax(Integer.parseInt(l.entDados("\na temperatura que a garrafa mant�m o l�quido: ")));
				termica.setMarca(l.entDados("\na marca da garrafa: "));
	
			//saída
				System.out.println("\n\nOs dados da garrafa térmica:");
				System.out.println("Formato: "+g.getFormato());
				System.out.println("Conteudo: "+g.getConteudo());
				System.out.println("Cor: "+g.getCor());
				System.out.println("Capacidade: "+g.getCapacidade() + "litros");
				System.out.println("Preço: "+g.getPreco() + "reais");

				System.out.println("\nEmpresa do Mercado"+g.getMerc().getEmpresa());
				System.out.println("Setor do produto: "+g.getMerc().getSetor());
				System.out.println("Prateleira: "+g.getMerc().getPrateleira());

				System.out.println("\nTemperatura que a garrafa mantém o líquido: "+termica.getMarca() +"graus Celsius");
				System.out.println("Marca da garrafa: "+termica.getMarca());
				break;

			case 2:
	
				g.setTipo(2);		
				//entrada
			
				System.out.println("\n\nOs dados da garrafa biodegrad�vel:");
				System.out.println("Formato: "+g.getFormato());
				System.out.println("Conteudo: "+g.getConteudo());
				System.out.println("Cor: "+g.getCor());
				System.out.println("Capacidade: "+g.getCapacidade() + "litros");
				System.out.println("Pre�o: "+g.getPreco() + "reais");

				System.out.println("\nEmpresa do Mercado"+g.getMerc().getEmpresa());
				System.out.println("Setor do produto: "+g.getMerc().getSetor());
				System.out.println("Prateleira: "+g.getMerc().getPrateleira());

				System.out.println("Material: "+biodegradavel.getMaterial());
				System.out.println("Tempo de Decomposicao: "+biodegradavel.getTempoDecomposicao());
				break;


			default:
				System.out.println("Nenhuma opção foi escolhida. Obrigada pelo acesso!");
				break;				
		}
		
	}
}
