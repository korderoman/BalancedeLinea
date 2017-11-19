package dt2.controlador.ControladorBalanceLineaCentro;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JComboBox;
import javax.swing.JTextField;

public class ControladorCategoria implements ActionListener {
	JTextField numeroOperariosNeto[], numeroOperacion[], inversion[];
	double opmaquinasPrecios[];
	JComboBox<String>tipos[];
	
	public ControladorCategoria(JTextField[] numeroOperariosNeto,JTextField[] numeroOperacion,
			JTextField[] inversion,JComboBox<String>tipos[],double opmaquinasPrecios[]) {
		
		this.numeroOperariosNeto=numeroOperariosNeto;
		this.numeroOperacion=numeroOperacion;
		this.inversion=inversion;
		this.tipos=tipos;
		this.opmaquinasPrecios=opmaquinasPrecios;
	}
	
	@Override
	public void actionPerformed(ActionEvent e) {
		JComboBox<String> aux1=(JComboBox<String>) e.getSource();
		/****************** INVERSION *************************/
		//la logica es simple, el evento asume que todas las demás casillas están llenas, sino simplemente marcará
		//cero
		//obteniendo la posicion
		String nombre=aux1.getName();
		char[] aux2=nombre.toCharArray();
		char aux3=aux2[aux2.length-1];
		int posicion=Integer.parseInt(""+aux3);
		//tenemos la posicion.
		//obtenemos el tipo de categoria
		String categoriaSeleccionada=(String) aux1.getSelectedItem();
		if(categoriaSeleccionada.equals("Máquina")) {
			String tipoOperacion=(String) tipos[posicion].getSelectedItem();
			String numOperacion=numeroOperacion[posicion].getText();
			double opNetos=Double.parseDouble(numeroOperariosNeto[posicion].getText());
			double resultado=resultadoInversion(numOperacion, opNetos, tipoOperacion);
			inversion[posicion].setText(""+resultado);
		}
		else {inversion[posicion].setText("0.0");}
		/************************** FIN DE INVERSION ********************************/
	}
	
	private double resultadoInversion(String numOp,double oNetos,String tipo) {
		double  resultado=0;
		int posicion=0;
		if(tipo.equals("Operación")) {
			if(numOp.equals("1")) {posicion=1;}
			else if(numOp.equals("4")) {posicion=2;}
			else if(numOp.equals("6")) {posicion=3;}
			else if(numOp.equals("7")) {posicion=4;}
			else if(numOp.equals("8")) {posicion=5;}
			else if(numOp.equals("10")) {posicion=6;}
			else if(numOp.equals("13")) {posicion=7;}
			else {posicion=0;}
		}
		if(tipo.equals("Control")) {
			if(numOp.equals("7")) {posicion=8;}
			else {posicion=0;}
		}
		if(oNetos>3) {resultado=opmaquinasPrecios[posicion]*(oNetos-2);}
		if(oNetos<=3 && oNetos>0) {resultado=opmaquinasPrecios[posicion];}
		return resultado;
		
	}
	
}
