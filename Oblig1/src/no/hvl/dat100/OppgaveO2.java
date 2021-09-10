package no.hvl.dat100;

import static javax.swing.JOptionPane.*;
import static java.lang.Integer.*;

public class OppgaveO2 {

	public static void main(String[] args) {
		
		for(int i = 1; i <=10; i++) {		
			int sum = parseInt(showInputDialog("Poengsum"));
			if(sum < 0 || sum > 100) {
				showMessageDialog(null, "Ugyldig sum");
				i--;
			} else {
				sjekkKarakter(sum);
			}				
		}
	}
	
	private static void sjekkKarakter(int x) {
		if(x <= 39) {
			System.out.println("F");
		}else if(x <= 49) {
			System.out.println("E");
		}else if(x <= 59) {
			System.out.println("D");
		}else if(x <= 79) {
			System.out.println("C");
		}else if(x <= 89) {
			System.out.println("B");
		}else {
			System.out.println("A");
		}
	}
}