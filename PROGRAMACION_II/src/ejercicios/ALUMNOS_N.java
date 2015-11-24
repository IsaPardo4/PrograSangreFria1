package ejercicios;

import java.util.Scanner;

public class ALUMNOS_N {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		float sum=0,prom;
		Scanner le=new Scanner(System.in); 
		for(int n=1;n<10;n++) { 
			System.out.println(" ALUMNOS" +n+ " : ");
			sum+=le.nextFloat();

		} prom=sum/10; 
		
System.out.println(" *-* EL PROMEDIO DEL GRUPO ES *-* : "+prom);

System.out.println("");
System.out.println(" ** ** ** ** ** ** ** ** ** ** ** ** ** ** ** ** ");
System.out.println(" GRACIAS POR USAR NUESTRO SISTEMA DE ALUMNOS ");
System.out.println(" ** ** ** ** ** ** ** ** ** ** ** ** ** ** ** ** ");
	}

}
