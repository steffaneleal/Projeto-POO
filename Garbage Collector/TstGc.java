//Stéffane Leal Silva Santos - 2312131


//GarbageCollector
public class TstGc{

	static Leitura l = new Leitura();	

	public static void main(String arg[]){ 
		
		l.entDados("\nEstou no método main - Irá criar G1 - pressione enter para continuar.");
		Garrafa g1 = new Garrafa();
		l.entDados("\nEstou no método main - G1 foi criado - pressione enter para continuar.");
		l.entDados("\nEstou no método main - Vamos para o método criaObj - pressione enter para continuar.");
		criaObj();
		System.gc();
		l.entDados("\nVoltou ao método main - Vamos para o método criaObj.");

	}

	public static void criaObj(){
		l.entDados("\nEstou no método criaObj - Irá criar G2 - pressione enter para continuar.");
		Garrafa g2 = new Garrafa();
		l.entDados("\nEstou no método criaObj - Criou G2 - pressione enter para continuar.");
		l.entDados("\nEstou no método criaObj - Para VOLTAR ao método MAINpressione enter para continuar.");

	}
}
