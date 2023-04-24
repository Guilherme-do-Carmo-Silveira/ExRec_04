package view;

import controller.NegativoController;

public class Main {

	public static void main(String[] args) {
		
		NegativoController control = new NegativoController();
		
		int negativos = 0;
		
		int tamanho = (int) (Math.random() * 5 ) + 2;
		int vt [] =  new int [tamanho];
		
		System.out.println("O tamanho do vetor: " + tamanho);
		System.out.print("Vetor: ");
		
		for(int i = 0; i < tamanho; i++) {
			int valor = (int) (Math.random() * 21 ) + (-10);
			vt[i] = valor;
			System.out.print(vt[i] + "  ");
		}

		int resultado = control.QtdNegativos(vt, tamanho, negativos);
		System.out.println("\nA somatoria de números negativos deu: "  + resultado + " negativos");
	}
}
