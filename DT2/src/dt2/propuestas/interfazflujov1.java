package dt2.propuestas;

import java.awt.BorderLayout;

import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.SpringLayout;

import dt2.vista.FlujoCentro;
import dt2.vista.FlujoSur;

public class interfazflujov1 extends JPanel{
	FlujoCentro flujoData;
	FlujoSur flujoGrafico;
	JScrollPane barra;
	public interfazflujov1() {
		setLayout(new BorderLayout());
		SpringLayout plano= new SpringLayout();
		setLayout(plano);
		
		flujoData= new FlujoCentro();
		flujoGrafico= new FlujoSur();
		barra= new JScrollPane(flujoData,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_NEVER);
		barra.setPreferredSize(this.getPreferredSize());
		add(barra);
		//add(flujoData);
		//add(flujoGrafico);
		//la posicion del objeto respecto a otro objeto
		/*
		plano.putConstraint(SpringLayout.WEST, flujoData, 15, SpringLayout.WEST, this);
		plano.putConstraint(SpringLayout.NORTH, flujoData, 15, SpringLayout.NORTH, this);
		plano.putConstraint(SpringLayout.WEST, flujoGrafico, 5, SpringLayout.EAST, flujoData);
		plano.putConstraint(SpringLayout.EAST, this, 15, SpringLayout.EAST, flujoGrafico);
		plano.putConstraint(SpringLayout.NORTH, flujoGrafico, 15, SpringLayout.NORTH, this);
		
		plano.putConstraint(SpringLayout.WEST, barra, 15, SpringLayout.WEST, this);
		plano.putConstraint(SpringLayout.EAST, barra, 15, SpringLayout.EAST, this);
		*/
		
	}
	

	}
	
	

