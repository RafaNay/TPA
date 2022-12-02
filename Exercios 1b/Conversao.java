package prjExercicio;

import java.util.Scanner;

public class Conversao {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
		
		double real, dolar, money; 
		
		System.out.println("Digite o valor do real");
		real = in.nextDouble();
		dolar = 0.21;
		money = (dolar*real);
		System.out.println("O valor convertido em dolar sera:");
		System.out.println(money);
		in.close();
	}

}
