package dt2.vista;

import java.awt.Dimension;
import java.awt.FlowLayout;

import javax.swing.JButton;
import javax.swing.JPanel;

import dt2.controlador.ControlBotonMenu;

public class PanelBotones extends JPanel {
	private JButton descripcion, balance, flujo,graficos;
	ControlBotonMenu botonesMenu;
	InterfazdePaneles paneles;
	public PanelBotones(InterfazdePaneles paneles) {
		this.paneles=paneles;
		setLayout(new FlowLayout());
		descripcion= new JButton("Descripción");
		balance= new JButton("Balance de Línea");
		flujo= new JButton("Flujo de Caja");
		graficos= new JButton("Gráficas");
		botonesMenu= new ControlBotonMenu(paneles);
		descripcion.setPreferredSize(new Dimension(150, 30));
		balance.setPreferredSize(new Dimension(150, 30));
		flujo.setPreferredSize(new Dimension(150, 30));
		graficos.setPreferredSize(new Dimension(150, 30));
		
		descripcion.addActionListener(botonesMenu);
		balance.addActionListener(botonesMenu);
		flujo.addActionListener(botonesMenu);
		graficos.addActionListener(botonesMenu);
		
		add(descripcion);
		add(balance);
		add(flujo);
		add(graficos);
	}
	
}
