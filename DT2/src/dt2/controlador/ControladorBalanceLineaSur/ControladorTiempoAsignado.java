package dt2.controlador.ControladorBalanceLineaSur;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JLabel;
import javax.swing.JTextField;

import dt2.vista.BalancedeLineaCentro;
import dt2.vista.BalancedeLineaNorte;



public class ControladorTiempoAsignado implements ActionListener {
	JLabel numeroOperariosBruto[];
	BalancedeLineaNorte bnorte;
	BalancedeLineaCentro bcentro;
	public ControladorTiempoAsignado(BalancedeLineaCentro bcentro,BalancedeLineaNorte bnorte) {
		this.bnorte=bnorte;
		this.bcentro=bcentro;
		
	}
	
	@Override
	public void actionPerformed(ActionEvent e) {
			//obtenemos la cadencia
			double cadencia=Double.parseDouble(bnorte.getCandencia().getText());
			//obtenemos los valores de los tiempos
			JTextField[] tiemposAsignados=bcentro.gettAsignado();
			//si la cadencia no es cero;
			double resultadoOpB=0.0;
			if(cadencia!=0) {
				for(int i=0;i<tiemposAsignados.length;i++) {
					double auxi=Double.parseDouble(tiemposAsignados[i].getText())/cadencia;
					resultadoOpB=Math.round(auxi*1000d)/1000d;

					bcentro.setOperariosBrutos(resultadoOpB, i);
					
				}
			}else {
				for(int i=0;i<tiemposAsignados.length;i++) {
					bcentro.setOperariosBrutos(0, i);
				}
			}
		
		
	}
	
}
