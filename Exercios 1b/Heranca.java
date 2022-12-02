package prjExercicio;

import java.util.Scanner;

public class Heranca {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
		
		double heranca , herancaF;
		String f1, f2, f3;

		System.out.println("Digite o valor da Herança");
		heranca = in.nextDouble();
		System.out.println("Digite o nome Do Filho 1");
		f1 = in.next();
		System.out.println("Digite o nome Do Filho 2");
		f2 = in.next();
		System.out.println("Digite o nome Do Filho 3");
		f3 = in.next();
		herancaF = heranca/3;
		System.out.println("Esses Serão os valores que cada filho vai receber ");
		System.out.println(f1 + " " + herancaF);
		System.out.println(f2 + " " + herancaF);
		System.out.println(f3 + " " + herancaF);
		in.close();
	}

}
