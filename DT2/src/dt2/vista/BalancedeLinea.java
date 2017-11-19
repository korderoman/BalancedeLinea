package dt2.vista;

import java.awt.BorderLayout;

import javax.swing.JPanel;

public class BalancedeLinea extends JPanel {
	BalancedeLineaNorte bnorte;
	BalancedeLineaCentro bcentro;
	BalancedeLineaSur bsur;
	public BalancedeLinea() {
		setLayout( new BorderLayout());
		bnorte= new BalancedeLineaNorte();
		bcentro= new BalancedeLineaCentro();
		bsur= new BalancedeLineaSur(bcentro,bnorte);
		
		add(bnorte,BorderLayout.NORTH);
		add(bcentro,BorderLayout.CENTER);
		add(bsur,BorderLayout.SOUTH);
	}
}
