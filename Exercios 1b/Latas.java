package prjExercicio;

import java.util.Scanner;

public class Latas {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
		
		double r, h, v; 
	
		System.out.println("Digite o valor de r");
		r = in.nextDouble();
		System.out.println("Digite o valor de h");
		h = in.nextDouble();
		v = (r*r*h/3.14); 	
		System.out.println("Esse ser� o volume da lata de �leo");
		System.out.println(v);
		in.close();
		
	}

}
