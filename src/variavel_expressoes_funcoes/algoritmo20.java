package variavel_expressoes_funcoes;

import java.util.Scanner;

public class algoritmo20 {
	public static void main(String[] args) {
		String c, c1, d, d1;
		Scanner teclado = new Scanner(System.in);
		
		System.out.println("Digite a palavra 1");
		c = teclado.next();
		d = c;
		
		System.out.println("Digite a palavra 2");
		c1 = teclado.next();
		//importante verificar a Classe String no Javadoc
		System.out.println("tamanho da 1ª palavra: " + c.length()); 
		System.out.println("concatenar: " + c.concat(c1)); 
		d1 = c.concat(c1);
		
		System.out.println("o conteúdo de d: " + d);
		System.out.println("o conteúdo de d1: " + d1);
		System.out.println("primeiro caractere de c: " + c.charAt(0));
		System.out.println("ultimo caractere de d1: " + d1.charAt(d1.length()-1));
		
		System.out.println("todos menos o primeiro caracter: " + d1.substring(1)); /* o substring serve para pegar
		uma "parte" de uma String. Eu pedi para imprimir a partir do índice 1, ou seja, a partir do segundo caracter*/
		
		
		System.out.println("o terceiro elemento: " + c.charAt(2));
		System.out.println("os três primeiros elementos: " + c.charAt(0) + c.charAt(1) + c.charAt(2));
		System.out.println("os três últimos elementos: " + d1.charAt(d1.length()-3) + d1.charAt(d1.length()-2) + d1.charAt(d1.length()-1));
		
		teclado.close();
		
	}

}
