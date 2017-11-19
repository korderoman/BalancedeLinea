package dt2.vista;

import java.awt.Dimension;
import java.awt.FlowLayout;

import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JLabel;
import javax.swing.JPanel;

import dt2.controlador.ControladorGraficos;

public class InterfazGraficoSurBotones extends JPanel {
	String listaMeses[]= {"1","2","3","4","5","6","7","8","9","10","11","12"};
	String listaAnos[]= {"2012","2013","2014","2015","2016","2017","2018","2019","2020","2021"};
	JComboBox<String>anos,meses;
	JButton ir, volver;
	InterfazGraficaCentroGraficos graficos;
	public InterfazGraficoSurBotones(InterfazGraficaCentroGraficos graficos) {
		setLayout(new FlowLayout());
		JLabel textoano= new JLabel("Años: ");
		JLabel textomes= new JLabel("Mes: ");
		anos= new JComboBox<>(listaAnos);
		meses= new JComboBox<>(listaMeses);
		ir= new JButton("Ir");
		this.graficos=graficos;
		volver= new JButton("Volver");
		ir.setPreferredSize(new Dimension(150, 30));
		volver.setPreferredSize(new Dimension(150, 30));
		ControladorGraficos botones= new ControladorGraficos(graficos);
		ir.addActionListener(botones);
		volver.addActionListener(botones);
		add(textoano);
		add(anos);
		add(textomes);
		add(meses);
		add(ir);
		add(volver);
		
	}
}
