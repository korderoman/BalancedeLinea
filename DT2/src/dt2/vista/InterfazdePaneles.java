package dt2.vista;

import java.awt.CardLayout;

import javax.swing.JPanel;

public class InterfazdePaneles extends JPanel{
	InterfazdeBalance balance;
	PanelDescripcion descripcion;
	InterfazFlujo flujo;
	InterfazGraficas graficos;
	CardLayout plano;
	public InterfazdePaneles() {
		plano= new CardLayout();
		balance= new InterfazdeBalance();
		descripcion= new PanelDescripcion();
		graficos= new InterfazGraficas();
		flujo= new InterfazFlujo();
		setLayout(plano);
		add(descripcion,"descripcion");
		add(balance,"balance");
		add(flujo,"flujo");
		add(graficos,"graficos");
		
		plano.show(this, "descripcion");
	
	
		
	}
	
}
