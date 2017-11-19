package dt2.vista;


import java.awt.BorderLayout;


import javax.swing.JPanel;


public class InterfazGraficas extends JPanel {
	InterfazGraficoSurBotones botones;
	InterfazGraficaCentroGraficos graficos;
	
	public InterfazGraficas() {
		
		setLayout(new BorderLayout());
		
		graficos= new InterfazGraficaCentroGraficos();
		botones= new InterfazGraficoSurBotones(graficos);
		//auxiliares
		add(new JPanel(),BorderLayout.NORTH);
		add(new JPanel(),BorderLayout.WEST);
		add(new JPanel(),BorderLayout.EAST);
		//fin de auxiliares
		add(graficos,BorderLayout.CENTER);
		add(botones,BorderLayout.SOUTH);
		
	}
}
