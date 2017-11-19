package dt2.vista;

import java.awt.GridLayout;

import javax.swing.JComboBox;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

import dt2.controlador.ControladorBalanceLineaCentro.ControladorCategoria;
import dt2.controlador.ControladorBalanceLineaCentro.ControladorTipoOperacion;
import dt2.controlador.ControladorBalanceLineaSur.ControladorTiempoAsignado;

public class BalancedeLineaCentro  extends JPanel {
	private final String listacategorías[]= {"Ninguna","Máquina","Almacén","Supervisor","Manual"};
	private final String listatipos[]= {"Ninguna","Operación", "Control"};
	
	JComboBox<String>categorias[]= new JComboBox[21];
	JComboBox<String>tipos[]=new JComboBox[21];
	JTextField numeroOperacion[]= new JTextField[21];
	JTextField tAsignado[]= new JTextField[21];
	JLabel numeroOperariosBruto[]= new JLabel[21];
	JTextField numeroOperariosNeto[]=new JTextField[21];
	JTextField turno1[]=new JTextField[21];
	JTextField turno2[]=new JTextField[21];
	JTextField turno3[]=new JTextField[21];
	JTextField inversion[]= new JTextField[21];
	JTextField implementacion[]= new JTextField[21];
	JTextField planilla[]= new JTextField[21];
	
	final double neutro=0;
	final double op1=50000;
	final double op4=100000;
	final double op6=55000;
	final double op7=120000;
	final double op8=40000;
	final double op10=150000;
	final double op13=80000;
	final double c7=20000;
	final double almacen=15000;
	
	double opmaquinasPrecios[]= {neutro,op1,op4,op6,op7,op8,op10,op13,c7,almacen};
	public BalancedeLineaCentro() {
		
		setLayout(new GridLayout(22, 12));
	/************************ DEFINICIONES ******************************************/
		JLabel textoCategoria=new JLabel("Categorías");
		JLabel textoTipo= new JLabel("Tipo");
		JLabel textoNumeroOperacion= new JLabel("#Op");
		JLabel textoTAsignado= new JLabel("T.A");
		JLabel textoOpeB=new JLabel("#OBrutos");
		JLabel textoOpeN= new JLabel("#ONetos");
		JLabel textoTurno1= new JLabel("T1");
		JLabel textoTurno2= new JLabel("T2");
		JLabel textoTurno3= new JLabel("T3");
		JLabel textoInversion= new JLabel("Inversión");
		JLabel textoImplementacion= new JLabel("Implementación");
		JLabel textoPlanilla= new JLabel("Planilla");
		
		JLabel etiquetas[]= {textoCategoria,textoTipo,textoNumeroOperacion,textoTAsignado,textoOpeB,textoOpeN,textoTurno1,textoTurno2,textoTurno3,textoInversion,textoImplementacion, textoPlanilla};
		for(JLabel e:etiquetas) {
			e.setHorizontalAlignment(JLabel.CENTER);
			add(e);
			}
		
		
		for(int i=0;i<21;i++) {
			categorias[i]= new JComboBox<String>(listacategorías);
			categorias[i].setName("categoria"+i);
			tipos[i]=new JComboBox<String>(listatipos);
			tipos[i].setName("tipo"+i);
			numeroOperacion[i]= new JTextField("0.0");
			numeroOperacion[i].setName("numeroOperacion"+i);
			numeroOperacion[i].setHorizontalAlignment(JTextField.CENTER);
			
			
			tAsignado[i]= new JTextField("0.0");
			tAsignado[i].setName("tAsignado"+i);
			tAsignado[i].setHorizontalAlignment(JTextField.CENTER);
			
			numeroOperariosBruto[i]= new JLabel("0.0");
			numeroOperariosBruto[i].setName("numeroOperatiosBruto"+i);
			numeroOperariosBruto[i].setHorizontalAlignment(JTextField.CENTER);
			
			numeroOperariosNeto[i]=new JTextField("0.0");
			numeroOperariosNeto[i].setName("numeroOperariosNeto"+i);
			numeroOperariosNeto[i].setHorizontalAlignment(JTextField.CENTER);
			
			turno1[i]=new JTextField("0.0");
			turno1[i].setName("turno1_"+i);
			turno1[i].setHorizontalAlignment(JTextField.CENTER);
			
			turno2[i]=new JTextField("0.0");
			turno1[i].setName("turno2_"+i);
			turno2[i].setHorizontalAlignment(JTextField.CENTER);
			
			turno3[i]=new JTextField("0.0");
			turno1[i].setName("turno3_"+i);
			turno3[i].setHorizontalAlignment(JTextField.CENTER);
			
			inversion[i]=new JTextField("0.0");
			inversion[i].setName("inversion"+i);
			inversion[i].setHorizontalAlignment(JTextField.CENTER);
			inversion[i].setEditable(false);
			
			implementacion[i]= new JTextField("0.0");
			implementacion[i].setName("implementacion"+i);
			implementacion[i].setHorizontalAlignment(JTextField.CENTER);
			implementacion[i].setEditable(false);
			
			planilla[i]=new JTextField("0.0");
			planilla[i].setName("planilla"+i);
			planilla[i].setHorizontalAlignment(JTextField.CENTER);
			planilla[i].setEditable(false);
			
		
		}
		/****************************CONTROLADORES ***********************************/
		ControladorCategoria controlCategoria= new ControladorCategoria(numeroOperariosNeto, numeroOperacion, inversion, tipos, opmaquinasPrecios);
		for(int i=0;i<categorias.length;i++) {
			categorias[i].addActionListener(controlCategoria);
		}
		ControladorTipoOperacion controlTipoOperacion= new ControladorTipoOperacion(categorias, numeroOperariosNeto, numeroOperacion, inversion, opmaquinasPrecios);
		for(int i=0;i<tipos.length;i++) {
			tipos[i].addActionListener(controlTipoOperacion);
		}
		
		
		/****************************IMPLEMENTACION***************************************/
		for(int i=0; i<21;i++) {
			add(categorias[i]);
			add(tipos[i]);
			add(numeroOperacion[i]);
			add(tAsignado[i]);
			add(numeroOperariosBruto[i]);
			add(numeroOperariosNeto[i]);
			add(turno1[i]);
			add(turno2[i]);
			add(turno3[i]);
			add(inversion[i]);
			add(implementacion[i]);
			add(planilla[i]);
		}
		
		
}
	public JTextField[] gettAsignado() {return tAsignado;};
	public JLabel[] getOperariosBrutos() {return numeroOperariosBruto;};
	public void setOperariosBrutos(double valor,int i) {
		numeroOperariosBruto[i].setText(""+valor);
	}
	


}
