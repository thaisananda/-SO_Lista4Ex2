package view;

import java.util.Random;

import controller.SomaLinha;

public class Principal1 {
	 
	public static void main(String[] args) {
		int[][] matriz = new int[3][5];
		Random random = new Random();
		
		 for (int i = 0; i < 3; i++) {
	            for (int j = 0; j < 5; j++) {
	                matriz[i][j] = random.nextInt(100);
	            }
	        }
		 for (int i = 0; i < 3; i++) {
	            SomaLinha thread = new SomaLinha(matriz[i], i);
	            thread.start();
	        }
	    }
	}


