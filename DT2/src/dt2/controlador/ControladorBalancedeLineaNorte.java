package dt2.controlador;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JComboBox;
import javax.swing.JTextField;

public class ControladorBalancedeLineaNorte implements ActionListener {
	JTextField producciones[], precios[],cadencia,tiempo,produccionTotal;
	double listaprecios[]= {5,5.1};
	double centiminutos;
	
	private final double listaproducciones[]= {700,200,300,400,500};
	public ControladorBalancedeLineaNorte(JTextField producciones[],JTextField[]precios,JTextField cadencia,JTextField tiempo,double centiminutos,JTextField produccionTotal) {
		this.producciones=producciones;
		this.precios=precios;
		this.cadencia=cadencia;
		this.tiempo=tiempo;
		this.centiminutos=centiminutos;
		this.produccionTotal=produccionTotal;
	}
	
	@Override
	public void actionPerformed(ActionEvent e) {
		
		JComboBox<String> f=(JComboBox<String>) e.getSource();
		String nombre=f.getName();//obtenemos el nombre del combobox
		String provincia=(String) f.getSelectedItem();
		/*Ya que los combobox son parte de un array y están definicos como provincia+i=provincia0, provincia1,etc
		 * y los demás componentes como precio, y produccion siguen el mismo ritmo, es más eficiente si obtenemos
		 * la posición de la provincia y que esta posicion sea el medio para modificar el valor de la misma posicion
		 * de los precios y produccion, con ello ahorramos estar realizando un if por cada selección.
		 * */ 
		char letras[]=nombre.toCharArray(); //pasamos a char
		char identificador1=letras[letras.length-1];//obtenemos la ultima posicion
		int pos=Integer.parseInt(""+identificador1);//lo pasamos a entero para que sea usable en la posicion
		if(nombre.equals("provincia"+pos)) {//un solo if que responde a los 5 elementos del array.
			if(provincia.equals("Ninguna")) {precios[pos].setText("0.0");}
			else if(provincia.equals("Lima")) {precios[pos].setText(""+listaprecios[0]);}
			else {precios[pos].setText(""+listaprecios[1]);}
			}
		//Sin embargo para la produccion es un poco distinto
		if(nombre.equals("provincia"+pos)) {
			if(provincia.equals("Ninguna")) {producciones[pos].setText("0.0");}
			if(provincia.equals("Lima")) {producciones[pos].setText(""+listaproducciones[0]);}
			if(provincia.equals("Ica")) {producciones[pos].setText(""+listaproducciones[1]);}
			if(provincia.equals("Trujillo")) {producciones[pos].setText(""+listaproducciones[2]);}
			if(provincia.equals("Piura")) {producciones[pos].setText(""+listaproducciones[3]);}
			if(provincia.equals("Arequipa")) {producciones[pos].setText(""+listaproducciones[4]);}
			
			
		}
		double suma=0.0;
		for(int i=0;i<5;i++) {
			suma+=Double.parseDouble(producciones[i].getText());
		}
		produccionTotal.setText(""+suma);

		if(suma>0) {
			double cadenciaresultado=Math.round((centiminutos/suma)*1000d)/1000d;
			cadencia.setText(""+cadenciaresultado);
		}else {cadencia.setText("0.0");}
		
		
	}
	

}
