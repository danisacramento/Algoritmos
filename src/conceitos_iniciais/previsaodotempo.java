package conceitos_iniciais;

public class previsaodotempo {
	String sol = "sol";
	String chuva = "chuva";
	
	public void diaensolarado(String tempo) {
		if (tempo.equalsIgnoreCase(sol)) {
			System.out.println("Vou a praia");
		}else{
			System.out.println("Vou estudar\n;" + "almo�ar\n;" + "ver televis�o\n" + "dormir");
		}
	}

}