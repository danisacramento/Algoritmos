package conceitos_iniciais;

public class trocalampadas {
	String distante = "L�mpada fora de alcance";
	String quente = "L�mpada quente";
	String pano = "Pegar pano";
	String queimada = "tirar l�mpada queimada";
	String boa = "colocar l�mpada boa";
	
	public void trocalampada(String lampada) {
		if (lampada.equalsIgnoreCase(distante)) {
			System.out.println(distante + ", busque a escada.");
		}else if (lampada.equalsIgnoreCase(quente)) {
			System.out.println(quente + ". "   + pano + " e " + boa );
				
		}
	}
}
