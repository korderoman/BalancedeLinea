package dt2.vista;

import java.awt.FlowLayout;

import javax.swing.JButton;

import javax.swing.JPanel;

public class FlujoSur extends JPanel {
	JButton calcular;
	public FlujoSur() {
		setLayout(new FlowLayout());
		calcular= new JButton("Calcular");
		add(calcular);
	}
}
