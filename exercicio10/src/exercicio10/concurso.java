package exercicio10;

//Crie um programa que vai receber as notas que uma pessoa tirou nas duas materias de sua prova.

import java.util.Scanner;

public class concurso {

	public static void main(String[] args) {
	Scanner scanner = new Scanner (System.in);
	
	System.out.print("Informe a nota em português :");
	double MateriaUm = scanner.nextDouble();
	
	System.out.print("Informe a nota em matemática :");
	double Materiadois = scanner.nextDouble();
	
	boolean notaInsuficiente = MateriaUm < 60 || Materiadois < 60;
	
	if(notaInsuficiente) {
		System.out.print("Nota insuficiente para conseguir a vaga do concurso.");
	}
	else {
		System.out.print("candidato alcançou nota necessaria para a vaga do concurso.");
	}
	
	scanner.close();

	}

}
