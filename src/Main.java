import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sn = new Scanner(System.in);

		int opc = 0;
		do {
			
			menu();
			opc=sn.nextInt();
			
      		switch (opc) {
			case 1:
				System.out.println("Introduce un número");
				double numeroSum1 = sn.nextDouble();
				System.out.println("Introduce el segundo número");
				double numeroSum2 = sn.nextDouble();
				double totalSum = Main.sumar2(numeroSum1, numeroSum2);
				System.out.println("La suma total de sus números es:" + totalSum);

			case 2:
				System.out.println("Introduce un número");
				double numeroMult1 = sn.nextDouble();
				System.out.println("Introduce el segundo número");
				double numeroMult2 = sn.nextDouble();
				double totalMult = Main.sumar2(numeroMult1, numeroMult2);
				System.out.println("La suma total de sus números es:" + totalMult);
				System.out.println("Hola");

			}

		} while (opc != 3);

	}

	public static void menu() {

		System.out.println("1.Sumar ");
		System.out.println("2.Multiplicar");

	}

	public static double sumar2(double numero1, double numero2) {

		double total = 0;

		total = numero1 + numero2;

		return total;
	}

	public static double multiplicar2(double numero1, double numero2) {

		double total = 0;

		total = numero1*numero2;

		return total;
	}
	
	public static double restar2(double numero1, double numero2) {

		double total = 0;

		total = numero1-numero2;

		return total;
	}
	public static double dividir2(double numero1, double numero2) {

		double total = 0;

		total = numero1/numero2;

		return total;
	}
}
