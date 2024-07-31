import java.util.Scanner;

public class atv {
	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		
		double v1 = 0, v2 = 0, v3 = 0;
		
		System.out.print("Informe o valor 1: ");
		v1 = ler.nextDouble();
		System.out.print("Informe o valor 2: ");
		v2 = ler.nextDouble();
		System.out.print("Informe o valor 3: ");
		v3 = ler. nextDouble();
		
		if (v1 == v2 && v1 == v3)
			System.out.print(" Todos Iguais");
		else if (v1 > v2 && v1 > v3)
			System.out.print(" O 1° Valor é o Maior " + v1);
		else if (v2 > v3)
			System.out.print(" O 2° Valor é o Maior " + v2);
		else
			System.out.print(" O 3° Valor é o Maior " + v3);
		
		ler.close();
	}

}
