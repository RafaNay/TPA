package prjExercicio;

import java.util.Scanner;

public class Desconto {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
		
		double preco, desco, d1, d2;
		
		System.out.println("Digite o valor do Produto");
		preco = in.nextDouble();
		System.out.println("Digite o valor do desconto");
		desco = in.nextDouble();
		d1 = 100-desco;
		d2 = preco*d1/100;
		System.out.println("Essesero o preço com desconto");
		System.out.println(d2);
		in.close();			
	}

}
