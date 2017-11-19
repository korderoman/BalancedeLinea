package dt2.vista;

import java.awt.BorderLayout;
import java.awt.FlowLayout;

import javax.swing.JPanel;
import javax.swing.JTabbedPane;

public class InterfazdeBalance extends JPanel {
	BalancedeLinea pestanas[]=new BalancedeLinea[5];
	JTabbedPane interfaz;
	public InterfazdeBalance() {
		setLayout(new BorderLayout());
		interfaz= new JTabbedPane();
		for(int i=0;i<pestanas.length;i++) {
			pestanas[i]= new BalancedeLinea();
			interfaz.addTab("Cálculo "+(i+1), pestanas[i]);
		}
		add(interfaz);
		
		

	}
}
