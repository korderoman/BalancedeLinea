package dt2.vista;

import java.awt.Dimension;
import java.awt.GridLayout;

import javax.swing.JComboBox;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

import dt2.controlador.ControladorBalancedeLineaNorte;

public class BalancedeLineaNorte extends JPanel {
	private final String listaprovincias[]= {"Ninguna","Lima", "Ica", "Piura","Trujillo","Arequipa"};
	
	
	double dias=22;
	double centiminutos=48000;
	
	JComboBox<String>provincias[]=new JComboBox[5];
	JTextField producciones[]= new JTextField[5];
	JTextField precios[]= new JTextField[5];
	JTextField cadencia, produccionTotal;
	public BalancedeLineaNorte() {
		setLayout(new GridLayout(5, 6));
		/************DEFINICIONES ******************************/
		
		JLabel textoprovincia,textotiempo,textoprecio,textoproduccion,textocadencia,textoProduccionTotal;
		
		for(int i=0; i<provincias.length;i++) {
			provincias[i]= new JComboBox<>(listaprovincias);
			provincias[i].setName("provincia"+i);
				}
	
		for(int i=0;i<producciones.length;i++) {
			producciones[i]= new JTextField("0.0");
			producciones[i].setPreferredSize(new Dimension(120, 30));
			producciones[i].setName("produccion"+i);
			producciones[i].setEditable(false);
					
				}
				
		for(int i=0;i<precios.length;i++) {
			precios[i]= new JTextField("0.0");
			precios[i].setPreferredSize(new Dimension(120, 30));
			precios[i].setName("precio"+i);
			precios[i].setEditable(false);
					
				}
		JTextField tiempo= new JTextField(""+centiminutos);
		tiempo.setEditable(false);	
		produccionTotal= new JTextField("0.0");
		produccionTotal.setEditable(false);
		cadencia= new JTextField("0.0");
		cadencia.setEditable(false);
				
		/******************************  *************************************/
		/*********************** CONTROLADORES *******************************/
		ControladorBalancedeLineaNorte control= new ControladorBalancedeLineaNorte(producciones, precios, cadencia, tiempo, centiminutos,produccionTotal);
		for(int i=0;i<provincias.length;i++) {provincias[i].addActionListener(control);}
		/******************************* *****************************************************/
				
		/*** IMPLEMENTACIÓN GRÁFICA **********************/
		textoprovincia= new JLabel("Provincias");
		add(textoprovincia);
		for(int i=0;i<provincias.length;i++) {add(provincias[i]);}
		textoproduccion= new JLabel("Producción: ");
		add(textoproduccion);
		for(int i=0;i<producciones.length;i++) {add(producciones[i]);}
		textoprecio= new JLabel("Precio: ");
		add(textoprecio);	
		for(int i=0;i<precios.length;i++) {add(precios[i]);}
		//tiempo
		textotiempo= new JLabel("Tiempo: ");
		textoProduccionTotal= new JLabel("Producción Total");
		add(textotiempo);
		add(tiempo);
		add(textoProduccionTotal);
		add(produccionTotal);
		for( int i=0;i<2;i++) {	add(new JLabel(" "));}
		//cadencia
		textocadencia= new JLabel("Cadencia: ");
		add(textocadencia);
		add(cadencia);
		for( int i=0;i<4;i++) {	add(new JLabel(" "));}
		/*************************************** ***********************************/
	}
	public JTextField getCandencia() {return cadencia;}
	
}
