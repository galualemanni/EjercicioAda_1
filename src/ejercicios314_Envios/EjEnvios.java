package ejercicios314_Envios;

import java.util.Scanner;

public class EjEnvios {

	private static final int ZONA_1 = 1;
	private static final int ZONA_2 = 2;
	private static final int ZONA_3 = 3;
	private static final int ZONA_4 = 4;
	private static final int ZONA_5 = 5;
	private static final int VALOR_Z1 = 11;
	private static final int VALOR_Z2 = 10;
	private static final int VALOR_Z3 = 12;
	private static final int VALOR_Z4 = 24;
	private static final int VALOR_Z5 = 27;
	private static final int PESO_MAXIMO = 5000;

	public static void main(String[] args) {

		Scanner sc;
		sc = new Scanner(System.in); // inicializando variable sc

		System.out.println("SISTEMA DE ENVIOS");
		System.out.println("=================");
		System.out.println();
		System.out.println("Ingrese peso del envio (en gramos) ");
		int gramosEnvio = sc.nextInt();// poner el ingreso por teclado
		if (gramosEnvio > PESO_MAXIMO) {
			System.out.println("No puede hacer ese envio por superar los 5kg");
		} else {
			System.out.println("Ingrese codigo de zona: ");
			int codigoZona = sc.nextInt();
			int total;

			switch (codigoZona) {
			case ZONA_1:
				total = VALOR_Z1 * gramosEnvio;
				break;
			case ZONA_2:
				total = VALOR_Z2 * gramosEnvio;
				break;
			case ZONA_3:
				total = VALOR_Z3 * gramosEnvio;
				break;
			case ZONA_4:
				total = VALOR_Z4 * gramosEnvio;
				break;
			case ZONA_5:
				total = VALOR_Z5 * gramosEnvio;
				break;

			default:
				total = 0;
				break;
			}

			System.out.println("El total a pagar es: " + total);
		}
	}

}
