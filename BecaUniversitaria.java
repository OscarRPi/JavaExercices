import java.util.Scanner;
//package co.edu.utp.misiontic2022.reto1.p45;

public class BecaUniversitaria {

	//--------------------------------------------
	// Atributos
	//--------------------------------------------

	double Monto 	= 0.0;
	double Interes  = 0.0;
	int Tiempo 		= 0;

	double interesSimple 	= 0.0;
	double interesCompuesto = 0.0;
	
	//--------------------------------------------
	// Constructores
	//--------------------------------------------

	//--------------------------------------------
	// Metodos
	//--------------------------------------------

	public BecaUniversitaria (int pTiempo, double pMonto, double pInteres){
		Tiempo 	= pTiempo;
		Monto 	= pMonto;
		Interes = pInteres;
	}

	public BecaUniversitaria (){
	}

	public double calcularInteresSimple() {
		interesSimple = Monto * (Interes/100) * Tiempo;
		return Math.round(interesSimple);
	}

	public double calcularInteresCompuesto() {
		interesCompuesto = Monto * (Math.pow((1+(Interes/100)),Tiempo)-1);
		return Math.round(interesCompuesto);
	}

	public String compararInversion(int pTiempo, double pMonto, double pInteres) {
		double diferencia = 0.0;
		Tiempo 	= pTiempo;
		Monto 	= pMonto;
		Interes = pInteres;
		diferencia = this.calcularInteresCompuesto() - this.calcularInteresSimple();
		return("La diferencia entre la proyección de interés compuesto e interés simple es: $" + diferencia);
	}

	public String compararInversion() {
		return("No se obtuvo diferencia entre las proyecciones, revisar los parámetros de entrada.");
	}

	public static void main(String args[]) {

		//llamados para verificar

		BecaUniversitaria becaUniversitaria = new BecaUniversitaria();
		//BecaUniversitaria becaUniversitaria = new BecaUniversitaria(48,10000,2.0);
		
		System.out.println(becaUniversitaria.calcularInteresSimple());
		System.out.println(becaUniversitaria.calcularInteresCompuesto());
		
		System.out.println(becaUniversitaria.compararInversion(60,13000,1.4));
		//System.out.println(becaUniversitaria.compararInversion(48,10000,2.0));
	}
}
