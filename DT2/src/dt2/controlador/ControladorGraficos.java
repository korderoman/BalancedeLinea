package dt2.controlador;

import java.awt.CardLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import dt2.vista.InterfazGraficaCentroGraficos;


public class ControladorGraficos implements ActionListener {
	InterfazGraficaCentroGraficos graficos;
	
	public ControladorGraficos(InterfazGraficaCentroGraficos graficos) {
		this.graficos=graficos;
	}
	@Override
	public void actionPerformed(ActionEvent e) {
		
		String fuente=e.getActionCommand();
		if(fuente.equals("Volver")) {
			CardLayout c1 =(CardLayout) graficos.getLayout();
			c1.show(graficos, "general");
		}
		if(fuente.equals("Ir")) {
			CardLayout c1 =(CardLayout) graficos.getLayout();
			c1.show(graficos, "detalle");
		}
		
	}

}
