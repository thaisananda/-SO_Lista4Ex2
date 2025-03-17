package controller;

public class SomaLinha extends Thread {
	
	private int[] linha;
	private int indiceLinha;
	
	public SomaLinha(int[] linha, int indiceLinha) {
		this.linha = linha;
		this.indiceLinha = indiceLinha;
	}
	
	@Override
	public void run(){
		int soma = 0; 
		for(int valor : linha) {
			soma += valor;
		}
        System.out.println("Linha " + indiceLinha + ": Soma = " + soma);
	}
}
