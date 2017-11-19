package dt2.controlador.ControladorBalanceLineaCentro;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JComboBox;
import javax.swing.JTextField;

public class ControladorTipoOperacion implements ActionListener {
	JTextField numeroOperariosNeto[], numeroOperacion[], inversion[];
	double opmaquinasPrecios[];
	JComboBox<String>categorias[];
	public ControladorTipoOperacion(JComboBox<String>categorias[],JTextField[] numeroOperariosNeto,JTextField[] numeroOperacion,
									JTextField[] inversion, double opmaquinasPrecios[]) {
		this.categorias=categorias;
		this.numeroOperariosNeto=numeroOperariosNeto;
		this.numeroOperacion=numeroOperacion;
		this.inversion=inversion;
		this.opmaquinasPrecios=opmaquinasPrecios;
		
		
	}
	
	@Override
	public void actionPerformed(ActionEvent e) {
		/**********************INVERSION ****************************/
		//obtenemos la fuente del evento
		JComboBox<String> aux1=(JComboBox<String>) e.getSource();
		//obtenemos la seleccion del combobox
		String operacionSeleccionada=(String) aux1.getSelectedItem();
		//obtenemos el nombre de la fuente del evento
		String nombre=aux1.getName();
		//obtenemos la posicion del elemento
		char[] aux2=nombre.toCharArray();
		char aux3=aux2[aux2.length-1];
		int posicion=Integer.parseInt(""+aux3);
		//categoria seleccionada
		String catSeleccionada=(String) categorias[posicion].getSelectedItem();
		//numero de la operacion
		String numOperacion=numeroOperacion[posicion].getText();
		//numero de operarios netos
		double numOpeNetos=Double.parseDouble(numeroOperariosNeto[posicion].getText());
;
		//definimos el siguiente auxiliar
		double resultado=resultadoInversion(catSeleccionada, numOperacion, numOpeNetos, operacionSeleccionada);
		inversion[posicion].setText(""+resultado);
		
	}
	
	private double resultadoInversion(String catSeleccionada,String numOperacion,double numOpeNetos,String OpeSeleccionada) {
		double resultado=0;
		int posicion=0;
		if(OpeSeleccionada.equals("Operación")) {
			if(catSeleccionada.equals("Máquina")) {
				if(numOperacion.equals("1")) {posicion=1;}
				else if(numOperacion.equals("4")) {posicion=2;}
				else if(numOperacion.equals("6")) {posicion=3;}
				else if(numOperacion.equals("7")) {posicion=4;}
				else if(numOperacion.equals("8")) {posicion=5;}
				else if(numOperacion.equals("10")) {posicion=6;}
				else if(numOperacion.equals("13")) {posicion=7;}
				else {posicion=0;}
		}
		}
		if(OpeSeleccionada.equals("Control")) {
			if(catSeleccionada.equals("Máquina")) {
				if(numOperacion.equals("7")) {posicion=8;}
				else {posicion=0;}
			}
		}
		if(numOpeNetos>3) {resultado=opmaquinasPrecios[posicion]*(numOpeNetos-2);}
		if(numOpeNetos<=3 && numOpeNetos>0) {resultado=opmaquinasPrecios[posicion];}
		
		
		return resultado;
	}

}
