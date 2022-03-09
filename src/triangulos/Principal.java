package triangulos;

import utils.Teclado;

public class Principal {

	public static void main(String[] args) {

		int lado1 = Teclado.inteiro("Informe o lado do tri�ngulo");
		int lado2 = Teclado.inteiro("Informe o lado do tri�ngulo");
		int lado3 = Teclado.inteiro("Informe o lado do tri�ngulo");

		if (lado1 == lado2 && lado2 == lado3) {
			System.out.println("Equil�tero");
			return;
		}

		if (lado1 != lado2 && lado1 != lado3 && lado2 != lado3) {
			System.out.println("Escaleno");
			return;
		}

		System.out.println("Is�sceles");

	}
}
