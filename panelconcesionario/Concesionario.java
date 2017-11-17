package panelconcesionario;
import java.awt.Toolkit;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JTabbedPane;
import javax.swing.WindowConstants;

import clientes.FormularioClientes;
import coches.FormularioCoches;
import informes.FormularioInformes;
import revisiones.FormularioRevisiones;

public class Concesionario 
{
	public Concesionario()
	{
		FormularioClientes objetoFormularioCliente = new FormularioClientes();
		FormularioCoches objetoFormularioCoches = new FormularioCoches();		
		FormularioRevisiones objetoFormularioRevisiones = new FormularioRevisiones();		
		FormularioInformes objetoFormularioInformes = new FormularioInformes();
		
		
	    JFrame panelConcesionario = new JFrame("CONCESIONARIO");
	    panelConcesionario.setIconImage(Toolkit.getDefaultToolkit().getImage(this.getClass()
	    		.getResource("/iconos/concesionario.png")));
	   
	    JTabbedPane pesta�as = new JTabbedPane();
	    pesta�as.add("Clientes", objetoFormularioCliente.panelPrincipal);
	    pesta�as.add("Coches", objetoFormularioCoches.panelPrincipal);
	    pesta�as.add("Revisiones", objetoFormularioRevisiones.panelPrincipal);
	    pesta�as.add("Informes",objetoFormularioInformes.panelPrincipal);
	    pesta�as.addMouseListener(new MouseListener() 
	    {			
			public void mouseReleased(MouseEvent e) {}			
			public void mousePressed(MouseEvent e) {}			
			public void mouseExited(MouseEvent e) {}			
			public void mouseEntered(MouseEvent e) {}
			
			public void mouseClicked(MouseEvent e) //Actualizar comboBox 
			{
				objetoFormularioCoches.cargarComboBox();
				objetoFormularioRevisiones.cargarComboBox();
				objetoFormularioInformes.cargarComboBoxClientes();
				objetoFormularioInformes.cargarComboBoxMatriculas();				
			}
		});
	    pesta�as.setIconAt(0, new ImageIcon(getClass().getResource("/iconos/clientes.png")));
	    pesta�as.setIconAt(1, new ImageIcon(getClass().getResource("/iconos/coches.png")));	
	    pesta�as.setIconAt(2, new ImageIcon(getClass().getResource("/iconos/revisiones.png")));
	    pesta�as.setIconAt(3, new ImageIcon(getClass().getResource("/iconos/informes.png")));	 
	
	    panelConcesionario.getContentPane().add(pesta�as);
	    panelConcesionario.setSize(750, 500);
	    panelConcesionario.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
	    panelConcesionario.setLocationRelativeTo(null);
	    panelConcesionario.setVisible(true);
	}
}
