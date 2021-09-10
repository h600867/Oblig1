package no.hvl.dat100;

import static java.lang.Integer.*;
import static javax.swing.JOptionPane.*;

public class OppgaveO1 {

	public static void main(String[] args) {
		
		int bruttoInntekt = parseInt(showInputDialog("Bruttoinntekt"));
		double prosentSkatt = 0;
		double trinnSkatt = 0;
		
		
		if (bruttoInntekt <= 184800) {
			showMessageDialog(null, "Trinnskatten din er " + trinnSkatt + "kr");
		}else if(bruttoInntekt <= 260100) {
			prosentSkatt = 0.017;
			trinnSkatt = bruttoInntekt * prosentSkatt;
			int skatt = (int)(trinnSkatt + 0.5);
			showMessageDialog(null, "Trinnskatten din er " + skatt + "kr");
		}else if(bruttoInntekt <= 651250) {
			prosentSkatt = 0.04;
			trinnSkatt = bruttoInntekt * prosentSkatt;
			int skatt = (int)(trinnSkatt + 0.5);
			showMessageDialog(null, "Trinnskatten din er " + skatt + "kr");
		}else if(bruttoInntekt <= 1021550) {
			prosentSkatt = 0.132;
			trinnSkatt = bruttoInntekt * prosentSkatt;
			int skatt = (int)(trinnSkatt + 0.5);
			showMessageDialog(null, "Trinnskatten din er " + skatt + "kr");
		}else {
			prosentSkatt = 0.162;
			trinnSkatt = bruttoInntekt * prosentSkatt;
			int skatt = (int)(trinnSkatt + 0.5);
			showMessageDialog(null, "Trinnskatten din er " + skatt + "kr");
		}

	}

}
