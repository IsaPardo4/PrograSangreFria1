package ejercicios;

import java.util.Scanner;

public class BOLITA {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner (System.in);
		int i,impt,opc = 0,op2 = 0,op1;
		double descuent,tot;
		do
		{
			i=1;
	while (i<=1){
		System.out.println(" INGRESE EL IMPORTE, POR FAVOR : ");
		impt=sc.nextInt();
		System.out.println(" ¿CUÁL ES EL COLOR DE LA BOLITA? \n1.ROJA\n2.AMARILLA\n3.BLANCA");
		op1=sc.nextInt();
		
		switch(op1){
		case 1:
			descuent=impt*0.4;
			tot=impt-descuent;
			System.out.println(" SU  TOTAL DE DESCUENTO DE SU COMPRA A PAGAR ES:$"+tot);
			break;
		case 2:
			descuent=impt*0.25;
			tot=impt-descuent;
			System.out.println(" SU  TOTAL DE DESCUENTO DE SU COMPRA A PAGAR ES :$"+tot);
			break;
		case 3:
			descuent=impt;
			System.out.println("  SU  TOTAL DE DESCUENTO DE SU COMPRA A PAGAR ES:$"+descuent);
			break;
		}
		i++;
	}
	System.out.println(" ** ** ** ** ** ** ** ** ** ** ** ** **");
	System.out.println("  DESEA OTRO CALCULO\n1.SI\n2.NO");
	System.out.println(" ** ** ** ** ** ** ** ** ** ** ** ** ** *");
	op2=sc.nextInt();
		}
		while (op2==1);
		System.out.println("   USTED A DECIDIDO SALIR GRACIAS POR USAR NUESTRO SISTEMA ");
	
	}

}
