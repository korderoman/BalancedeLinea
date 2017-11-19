package dt2.vista;


import java.awt.BorderLayout;
import java.awt.Dimension;
import java.awt.Toolkit;
import javax.swing.JFrame;


public class Descripcion  extends JFrame{
	PanelBotones botones;
	InterfazdePaneles paneles;
	public static void main(String[] args) {
		Descripcion d= new Descripcion();

	}

	public Descripcion(){
		Toolkit t= Toolkit.getDefaultToolkit();
		Dimension p=t.getScreenSize();
		//no puede ser borderlayout pues este sólo acepta una dispocion y deshabilita al setVsible de las opciones.
		//para ello se debe usar un cardlayout
		setLayout(new BorderLayout());
		setTitle("DT2");
		setBounds(p.width/16,p.height/64,1200,700);
		setResizable(true);

		paneles= new InterfazdePaneles();
		
		botones= new PanelBotones(paneles);
		//pagina1 inicio
		
		//pagina2 inicio
		add(paneles,BorderLayout.CENTER);
		add(botones,BorderLayout.SOUTH);
		setVisible(true);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
	}
	

}

