package dt2.vista;


import java.awt.Dimension;
import java.awt.GridLayout;
import java.util.ArrayList;

import javax.swing.JComboBox;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class FlujoCentro extends JPanel {
	String listaMeses[]= {"1","2","3","4","5","6","7","8","9","10","11","12"};
	String listaAnos[]= {"2012","2013","2014","2015","2016","2017","2018","2019","2020","2021"};
	String listaEtiquetas[]= {"Año","Mes","Producción","Saldo Capital","Préstamos","Venta Productos","Venta Maq./Almacen",
								"Total Ingresos", "Máquinas","Almacénes","Implementación","Total Inversión",
								"CMOD","CMOI","Gratificación","Costo despidos","CMP","STOCK MP","GF",
								"C.Transporte","Total Costos","Pago Préstamos","Total Egresos","Saldo",
								"Provisión","Prov. Acumulada","Saldo para Bancos"};
	
	JLabel etiquetas[]= new JLabel[27];
	JComboBox anos[]= new JComboBox[5];
	JComboBox meses[]= new JComboBox[5];
	JTextField produccion[]= new JTextField[5];
	JTextField saldoCapital[]= new JTextField[5];
	JTextField prestamos[]= new JTextField[5];
	JTextField ventas[]= new JTextField[5];
	JTextField ventaMaquinas[]= new JTextField[5];
	JTextField totalIngresos[]= new JTextField[5];
	JTextField maquinas[]= new JTextField[5];
	JTextField almacenes[]= new JTextField[5];
	JTextField implementacion[]= new JTextField[5];
	JTextField totalInversion[]= new JTextField[5];
	JTextField cmod[]= new JTextField[5];
	JTextField cmoi[]= new JTextField[5];
	JTextField gratificacion[]= new JTextField[5];
	JTextField costoDespidos[]= new JTextField[5];
	JTextField cmp[]= new JTextField[5];
	JTextField stockMp[]= new JTextField[5];
	JTextField gf[]= new JTextField[5];
	JTextField cTransporte[]= new JTextField[5];
	JTextField totalCostos[]= new JTextField[5];
	JTextField pagoPrestamos[]= new JTextField[5];
	JTextField totalEgresos[]= new JTextField[5];
	JTextField saldo[]= new JTextField[5];
	JTextField provision[]= new JTextField[5];
	JTextField provisionAcumulada[]= new JTextField[5];
	JTextField saldoparaBancos[]= new JTextField[5];
	
	public FlujoCentro() {
		setLayout(new GridLayout(27,6));
		//recordar que son 27 filas
		Object[] objetos[]= {anos,meses,produccion,saldoCapital,prestamos,ventas,ventaMaquinas,totalIngresos,maquinas,
				almacenes,implementacion,totalInversion,cmod,cmoi,gratificacion,costoDespidos,cmp,stockMp,
				gf,cTransporte,totalCostos,pagoPrestamos,totalEgresos,saldo,provision,provisionAcumulada,saldoparaBancos};
		
		
	
		for(int i=0;i<objetos.length;i++) {
			etiquetas[i]=new JLabel(listaEtiquetas[i]);
			etiquetas[i].setHorizontalAlignment(JLabel.CENTER);
			add(etiquetas[i]);
			for(int j=0;j<5;j++) {
				if(i==0) {objetos[i][j]=new JComboBox<>(listaAnos); add((JComboBox)objetos[i][j]);}
				else if(i==1) {objetos[i][j]=new JComboBox<>(listaMeses); add((JComboBox)objetos[i][j]);}
				else {
				objetos[i][j]=new JTextField("0.0");
				JTextField auxiliar=(JTextField)objetos[i][j];
				if(i==3 || i==7 ||i==11||i>=13) {auxiliar.setEditable(false);}
				auxiliar.setHorizontalAlignment(JTextField.CENTER);
				add(auxiliar);
				}
			}
		}
		
		
}}


