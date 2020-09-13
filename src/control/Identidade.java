package control;
//extends thread
//arâmetros por construtor
//metodo run()
public class Identidade extends Thread{

	private int id;
	
	public Identidade(int id) {
		this.id = id;
	}

	@Override
	public void run() {
		// So se executa o que esta aqui dentro
		System.out.println("Thread nº "+ id);
	}
	
}
