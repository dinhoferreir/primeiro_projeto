package main;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// SOMA +
		 int numero1 = 20;
		 int numero2 = 10;
		 int resultado = numero1 + numero2;
		 System.out.println("Resultado: " + resultado);
		 
		 float n1 = (float) 20.40;
		 float n2 = (float) 0.40;
		 System.out.println(n1 + n2);
		 
		// SUBTRA��O - 
				 int Vnumero1 = 20;
				 int Vnumero2 = 10;
				 int Vresultado = Vnumero1 - Vnumero2;
				 System.out.println("Resultado: " + Vresultado);
				 float Vn1 = (float) 20.40;
				 float Vn2 = (float) 10.40;
				 System.out.println(Vn1 - Vn2);
		
		// MULTIPLICA��O *
				 int meunum = 10;
				 int meunum1 = 20;
				 System.out.println("Resultado de Multiplica��o: " + (meunum * meunum1));
	
		// DIVIS�O /		 
				 int meunum3 = 10;
				 int mn4 = 2;
				 System.out.println("Resultado de Divis�o: " + (meunum3/mn4));
				 
		// RESTO DA DIVIS�O %
				 System.out.println(numero1%numero2);
				 
				 
				 Scanner teclado = new Scanner (System.in);
				 System.out.println("Digite um n�mero: ");
				 int NU1 = teclado.nextInt();
				 System.out.println("Digite um n�mero: ");
				 int NU2 = teclado.nextInt();
				 System.out.println("Resultado das duas etapas = " + NU1*NU2);
				 teclado.close();
				 
				 
				 
				 
				 
				 
				 
				 
	}

}
