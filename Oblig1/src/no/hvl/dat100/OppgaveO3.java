package no.hvl.dat100;

import static java.lang.Integer.*;
import static javax.swing.JOptionPane.*;

public class OppgaveO3 {

	public static void main(String[] args) {
		
		int n = parseInt(showInputDialog("Poengsum"));
		int verdi = 1;
		
		if(n < 0) {
			showMessageDialog(null, "Ugyldig tall");
		} else {
			for (int i = 1; i <= n; i++) {
				
				verdi *= i;
				
			}
		
		System.out.println(verdi);
		
		}
	}
}
