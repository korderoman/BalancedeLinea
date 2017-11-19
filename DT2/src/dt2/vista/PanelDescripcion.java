package dt2.vista;


import java.awt.BorderLayout;

import java.io.File;


import javax.swing.JEditorPane;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
public class PanelDescripcion extends JPanel {
	JEditorPane centro;
	JScrollPane barra;
	InterfazdeBalance interfazdeBalance;
	public PanelDescripcion() {
		setLayout(new BorderLayout());

		try {
			File file= new File("./src/dt2/docs/texto.html");
			centro= new JEditorPane();
			//he aquí el truco de transformación hacia una url
			centro.setPage(file.toURI().toURL());
			
		} catch (Exception e) {e.printStackTrace();}
		centro.setEditable(false);
		barra= new JScrollPane(centro );
		add(barra,BorderLayout.CENTER);
		

	}
}
