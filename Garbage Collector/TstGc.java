//St�ffane Leal Silva Santos - 2312131


//GarbageCollector
public class TstGc{

	static Leitura l = new Leitura();	

	public static void main(String arg[]){ 
		
		l.entDados("\nEstou no m�todo main - Ir� criar G1 - pressione enter para continuar.");
		Garrafa g1 = new Garrafa();
		l.entDados("\nEstou no m�todo main - G1 foi criado - pressione enter para continuar.");
		l.entDados("\nEstou no m�todo main - Vamos para o m�todo criaObj - pressione enter para continuar.");
		criaObj();
		System.gc();
		l.entDados("\nVoltou ao m�todo main - Vamos para o m�todo criaObj.");

	}

	public static void criaObj(){
		l.entDados("\nEstou no m�todo criaObj - Ir� criar G2 - pressione enter para continuar.");
		Garrafa g2 = new Garrafa();
		l.entDados("\nEstou no m�todo criaObj - Criou G2 - pressione enter para continuar.");
		l.entDados("\nEstou no m�todo criaObj - Para VOLTAR ao m�todo MAINpressione enter para continuar.");

	}
}
