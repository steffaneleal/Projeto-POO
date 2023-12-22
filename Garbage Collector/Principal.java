//Stéffane Leal Silva Santos - 2312131


//função main
public class Principal{

	public static void main(String arg[]){ 

		//chamando as classes

		Leitura l = new Leitura();
		Garrafa g1= new Garrafa("plastico","agua",1,new Mercado());

		//g.impDados();

//-----------------------------------------------------------------------------
		//entrada de dados via teclado

		System.out.println("\n\n\nPor favor, informe:");
		//g.getMerc().setSetor(l.entDados("\no setor do mercado: "));
		//g.getMerc().setPrateleira(Integer.parseInt(l.entDados("a prateleira: ")));
		
		//g1 e g2
		g1.setMaterial(l.entDados("o material: "));
		g1.setConteudo(l.entDados("o conteudo: "));
		g1.setCapacidade(Integer.parseInt(l.entDados("a capacidade (em litros): ")));

		Garrafa g2 = new Garrafa(g1);
//-----------------------------------------------------------------------------
		//impressão de dados

		System.out.println("\n\n\t\t\t Informacoes da Garrafa: ");

		//endereços de g1 e g2
		//System.out.println("\nEndereço de G1: "+ g1);
		//System.out.println("\nEndereço de G2: "+ g2);

		//g1
		System.out.println("\nMaterial1: "+ g1.getMaterial());
		System.out.println("Conteudo1: "+ g1.getConteudo());
		System.out.println("Capacidade em litros1: "+ g1.getCapacidade());

		//g2
		System.out.println("\nMaterial2: "+ g2.getMaterial());
		System.out.println("Conteudo2: "+ g2.getConteudo());
		System.out.println("Capacidade em litros2: "+ g2.getCapacidade());

		//g1 e g2 novos valores 
		g1.setMaterial(l.entDados("o material: "));
		g1.setConteudo(l.entDados("o conteudo: "));
		g1.setCapacidade(Integer.parseInt(l.entDados("a capacidade (em litros): ")));


		//impressão dos novos valores de g1 e g2
		System.out.println("\n\nNovos valores das garrafas 1 e 2:");
		
		//g1
		System.out.println("\n\n\nMaterial1: "+ g1.getMaterial());
		System.out.println("Conteudo1: "+ g1.getConteudo());
		System.out.println("Capacidade em litros1: "+ g1.getCapacidade());

		//g2
		System.out.println("\nMaterial2: "+ g2.getMaterial());
		System.out.println("Conteudo2: "+ g2.getConteudo());
		System.out.println("Capacidade em litros2: "+ g2.getCapacidade());


		//System.out.println("Setor: "+ g.getMerc().getSetor());
		//System.out.println("Prateleira: "+ g.getMerc().getPrateleira());

	}
}

/*para ints
	int nomeDaClasse = Integer.parseInt(nomeDaClasse);   
*/