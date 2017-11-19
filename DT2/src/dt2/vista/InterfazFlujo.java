package dt2.vista;





import java.awt.BorderLayout;

import javax.swing.JPanel;
import javax.swing.JScrollPane;



public class InterfazFlujo extends JPanel {
	FlujoCentro flujoCentro;
	FlujoSur flujoSur;
	JScrollPane barra;
	public InterfazFlujo() {
		setLayout(new BorderLayout());
		flujoCentro= new FlujoCentro();
		flujoSur= new FlujoSur();
		//Auxiliares
		JPanel aux1= new JPanel();
		JPanel aux2= new JPanel();
		JPanel aux3= new JPanel();
		//Auxiliares
		
		barra= new JScrollPane(flujoCentro);
		add(barra,BorderLayout.CENTER);
		add(flujoSur,BorderLayout.SOUTH);
		add(aux3,BorderLayout.NORTH);
		add(aux1,BorderLayout.WEST);
		add(aux2,BorderLayout.EAST);
	}
	

	}
	
	


