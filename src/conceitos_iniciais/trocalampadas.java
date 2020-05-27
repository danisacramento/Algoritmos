package conceitos_iniciais;

public class trocalampadas {
	String distante = "Lâmpada fora de alcance";
	String quente = "Lâmpada quente";
	String pano = "Pegar pano";
	String queimada = "tirar lâmpada queimada";
	String boa = "colocar lâmpada boa";
	
	public void trocalampada(String lampada) {
		if (lampada.equalsIgnoreCase(distante)) {
			System.out.println(distante + ", busque a escada.");
		}else if (lampada.equalsIgnoreCase(quente)) {
			System.out.println(quente + ". "   + pano + " e " + boa );
				
		}
	}
}
