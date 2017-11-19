package dt2.vista;


import java.awt.CardLayout;

import javax.swing.JPanel;


public class InterfazGraficaCentroGraficos extends JPanel {
	GraficaGeneral graficaGeneral;
	GraficaDetalle graficaDetalle;
	
	public InterfazGraficaCentroGraficos() {
		CardLayout plano= new CardLayout();
		setLayout(plano);
		graficaGeneral= new GraficaGeneral();
		graficaDetalle= new GraficaDetalle();
		add(graficaGeneral, "general");
		add(graficaDetalle, "detalle");
		plano.show(this, "general");
	}
	
}
