package controller;

public class NegativoController {

	public NegativoController() {
		super();
	}
	
	public int QtdNegativos(int [] vt, int tamanho, int negativos) {
		//Condição de Parada
		if(tamanho == 0) {
			return negativos;
		}else {
			tamanho--;
			if(vt[tamanho] < 0) {
				negativos++;
			}
			return QtdNegativos(vt, tamanho, negativos);
		}
	}
}
