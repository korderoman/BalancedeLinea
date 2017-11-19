package dt2.vista;

import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.GridLayout;

import javax.swing.BorderFactory;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.border.Border;

import dt2.controlador.ControladorBalanceLineaSur.ControladorTiempoAsignado;

public class BalancedeLineaSur extends JPanel {
	JTextField totalInversion, totalPlanilla,totalImplementacion,totalAlmacen;
	JTextField totales[]= {totalInversion, totalPlanilla,totalImplementacion,totalAlmacen};
	JButton calcularTotales, calcularOpBrutos;
	JPanel izquierda, derecha;
	BalancedeLineaCentro bcentro;
	BalancedeLineaNorte bnorte;
	public BalancedeLineaSur(BalancedeLineaCentro bcentro,BalancedeLineaNorte bnorte) {
		this.bcentro=bcentro;
		this.bnorte=bnorte;
		setLayout(new GridLayout(1, 2));
		Border borde=BorderFactory.createLineBorder(Color.BLACK);
		setBorder(borde);
		izquierda= new JPanel();
		izquierda.setLayout(new FlowLayout());
		calcularOpBrutos= new JButton("Calcular #OBrutos");
		ControladorTiempoAsignado controltA= new ControladorTiempoAsignado(bcentro, bnorte);
		calcularOpBrutos.addActionListener(controltA);
		calcularTotales= new JButton("Calcular Total");
		izquierda.add(calcularOpBrutos);
		izquierda.add(calcularTotales);
		
		derecha= new JPanel();
		derecha.setLayout(new GridLayout(2, 4));
		JLabel textoAlmacen= new JLabel("Total Almacén");
		JLabel textoInversion= new JLabel("Total Inversión");
		JLabel textoPlanilla= new JLabel("Total Planilla");
		JLabel textoImplementacion= new JLabel("Total Implementación");
		JLabel textos[]= {textoAlmacen,textoInversion,textoImplementacion,textoPlanilla};
		for(JLabel e:textos) {
			e.setHorizontalAlignment(JLabel.CENTER);
			derecha.add(e);}
		
		for(JTextField e:totales) {
			e=new JTextField("0.0");
			e.setEditable(false);
			e.setHorizontalAlignment(JTextField.CENTER);
			derecha.add(e);
		}
		
		
		
		
		
		
		
		
		
		
		
		add(izquierda);
		add(derecha);
		

	}
}
