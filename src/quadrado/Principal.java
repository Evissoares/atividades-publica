package quadrado;

import utils.Teclado;

public class Principal {
	public static void main(String[] args) {
		
		double lado1 = Teclado.real("Digite 1� o lado do quadrado");
		double lado2 = Teclado.real("Digite 2� o lado do quadrado");
		double lado3 = Teclado.real("Digite 3� o lado do quadrado");
		double lado4 = Teclado.real("Digite 4� o lado do quadrado");
		
		double somaLados = (lado1 + lado2 + lado3 + lado4) /4;
		
		System.out.println(somaLados == lado1 ? "� um quadrado" : "N�o � um quadrado");
		
		
	}
}
