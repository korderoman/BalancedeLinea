package dt2.propuestas;

import java.awt.BorderLayout;
import java.awt.GridLayout;

import javax.swing.JLabel;
import javax.swing.JPanel;

public class flujoDatav1 extends JPanel {
	DataI datai;
		DataC datac;
		public flujoDatav1() {
			setLayout(new BorderLayout());
			
			
			datai= new DataI();
			datac= new DataC();
			
			add(datai,BorderLayout.WEST);
			add(datac,BorderLayout.CENTER);
			
		
		}
		
		private class DataI extends JPanel{
			public DataI() {
				setLayout(new GridLayout(28, 1));
				JLabel totalIngresos= new JLabel("Total Ingresos");
				JLabel maquinas= new JLabel("Máquinas");
				JLabel almacenes= new JLabel("Almacenes");
				JLabel implementacion= new JLabel("Implementación");
				JLabel totalInversion= new JLabel("Total Inversión");
				JLabel cmod=new JLabel("CMOD");
				JLabel cmoi= new JLabel("CMOI");
				JLabel grati= new JLabel("Gratificación");
				JLabel costoDespidos= new JLabel("Costo Despidos");
				JLabel cmp=new JLabel("CMP");
				JLabel stockmp= new JLabel("STOCK MP");
				JLabel gf= new JLabel("GF");
				JLabel transporte= new JLabel("C.Transporte");
				JLabel totalCostos= new JLabel("Total Costos");
				JLabel pagoprestamos= new JLabel("Pago Préstamos");
				JLabel totalEgresos= new JLabel("Total Egresos");
				JLabel saldos= new JLabel("Saldo");
				JLabel provision= new JLabel("Provisión");
				JLabel provisionAcumulada= new JLabel("Prov. Acumulada");
				JLabel saldoBancos= new JLabel("Saldo para Bancos");
				
				JLabel etiquetas[]= {totalIngresos,maquinas,almacenes,implementacion, totalInversion,cmod,cmoi,
									grati,costoDespidos,cmp,stockmp,gf,transporte,totalCostos,pagoprestamos,totalEgresos,
									saldos,provision,provisionAcumulada,saldoBancos};
				for(JLabel e:etiquetas) {add(e);}
			
			}
		}
		
		private class DataC extends JPanel{
			public DataC() {
				setLayout(new GridLayout(28, 120));
			}
		}
}
