package dt2.controlador.ControladorBalanceLineaCentro;

import java.awt.event.FocusAdapter;
import java.awt.event.FocusEvent;

import javax.swing.JComboBox;
import javax.swing.JTextField;


public class ControladorNumerodeOperacion extends FocusAdapter{
	JTextField numeroOperariosNeto[], numeroOperacion[], inversion[];
	double opmaquinasPrecios[];
	JComboBox<String>tipos[],categorias[];
	// numeroOperacion[] --> se trabaja con esta variable
	
	
	public ControladorNumerodeOperacion(JTextField numeroOperariosNeto[], JTextField numeroOperacion[],JTextField inversion[],
			double opmaquinasPrecios[],JComboBox<String>tipos[], JComboBox<String> categorias[]	) {
		this.numeroOperariosNeto=numeroOperariosNeto;
		this.numeroOperacion=numeroOperacion;
		this.inversion=inversion;
		this.opmaquinasPrecios=opmaquinasPrecios;
		this.tipos=tipos;
		this.categorias=categorias;
	}
	
	@Override
	public void focusLost(FocusEvent arg0) {
		// TODO Auto-generated method stub
		
	}

}
