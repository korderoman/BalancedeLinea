package dt2.vista;

import java.awt.BorderLayout;

import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollPane;

import org.jfree.chart.ChartFactory;
import org.jfree.chart.ChartPanel;
import org.jfree.chart.JFreeChart;
import org.jfree.chart.plot.PlotOrientation;
import org.jfree.data.category.DefaultCategoryDataset;

public class GraficaGeneral extends JPanel {
	JScrollPane barra;
	JPanel graficos;
	String listaMeses[]= {"enero","febrero","marzo","abril","mayo","junio","julio","agosto","setiembre",
							"octubre","noviembre","diciembre"};
	String listaAno[]= {"2012","2013","2014","2015","2016","2017","2018","2019","2020","2021"};
	Double ingresosA1[]= {100.0,150.0,120.0,45.0,114.0,186.0,120.0,119.0,183.0,114.0,116.0,126.0};
	Double ingresosA2[]= {120.0,130.0,100.0,36.0,128.0,153.0,114.0,136.0,153.0,114.0,116.0,126.0};
	Double ingresosA3[]= {110.0,145.0,103.0,152.0,94.0,196.0,128.0,113.0,135.0,114.0,116.0,126.0};
	Double ingresosA4[]= {160.0,156.0,169.0,49.0,65.0,25.0,139.0,128.0,96.126,114.0,116.0,126.0};
	Double ingresosA5[]= {170.0,162.0,186.0,56.0,152.0,28.0,115.0,196.0,162.0,114.0,116.0,126.0};
	Double ingresosA6[]= {180.0,150.0,176.0,57.0,135.0,39.0,125.0,147.0,156.0,114.0,116.0,126.0};
	Double ingresosA7[]= {140.0,114.0,145.0,75.0,187.0,43.0,169.0,169.0,149.0,114.0,116.0,126.0};
	Double ingresosA8[]= {150.0,122.0,124.0,94.0,164.0,128.0,145.0,186.0,194.0,114.0,116.0,126.0};
	Double ingresosA9[]= {135.0,123.0,131.0,125.0,168.0,136.0,168.0,183.0,193.0,114.0,116.0,126.0};
	Double ingresosA10[]= {110.0,111.0,120.0,39.0,185.0,152.0,125.0,156.0,168.0,114.0,116.0,126.0};

	public GraficaGeneral() {
		setLayout(new BorderLayout());
				DefaultCategoryDataset data= new DefaultCategoryDataset();
		
		for(int i=0;i<12;i++) {
			data.addValue(ingresosA1[i],listaMeses[i] , "2012");
			data.addValue(ingresosA2[i],listaMeses[i], "2013" );
			data.addValue(ingresosA3[i],listaMeses[i], "2014" );
			data.addValue(ingresosA4[i],listaMeses[i], "2015" );
			data.addValue(ingresosA5[i],listaMeses[i], "2016" );
			data.addValue(ingresosA6[i], listaMeses[i],"2017" );
			data.addValue(ingresosA7[i],listaMeses[i], "2018" );
			data.addValue(ingresosA8[i],listaMeses[i], "2019" );
			data.addValue(ingresosA9[i],listaMeses[i], "2020");
			data.addValue(ingresosA10[i], listaMeses[i], "2021");
		}
		
		JFreeChart barras= ChartFactory.createBarChart("Ingresos", "Categorías", "Soles", data,PlotOrientation.VERTICAL,true,true,false);
		ChartPanel panel= new ChartPanel(barras);
		barra= new JScrollPane(panel, JScrollPane.VERTICAL_SCROLLBAR_AS_NEEDED, JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
		add(barra,BorderLayout.CENTER);
		
	}
	
	
}

