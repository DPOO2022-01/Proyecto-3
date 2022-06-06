package proyecto2.InterfazPrincipal;

import java.awt.BorderLayout;

import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.text.ParseException;

import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;


public class PanelDerecha extends JPanel implements ActionListener
{
   
    
    private JTextField txtEjemplo;
    private VentanaProyecto2 ventana;
    private JButton btn1,btn2;
    private JTextField txt1,txt2,txt3;
    private JComboBox<String> ch1;
    
    public PanelDerecha(VentanaProyecto2 ventana)
    {
    	//traer mundo
    	this.ventana=ventana;
    	
    	setSize(220,600);
    	setLayout(new BorderLayout());
    	//setBorder( new TitledBorder( "" ) );
        
    	//Crear sub paneles
        JPanel panelRegistro = new JPanel();
        JPanel panelRegistros = new JPanel();
        add(panelRegistro,BorderLayout.NORTH);
        add(panelRegistros,BorderLayout.SOUTH);
    	
    	//                                                     PANEL REGISTRO
        panelRegistro.setLayout(new GridLayout(13,1));
        
        //elemento-1
        JLabel lbl11 = new JLabel("");
	    panelRegistro.add(lbl11);
        //elemento0
        JLabel lbl1 = new JLabel("Crear nuevo Registro: ");
	    panelRegistro.add(lbl1);
	    //elemento-1
        JLabel lbl12 = new JLabel("");
	    panelRegistro.add(lbl12);
	    //elemento1
        JLabel lbl2 = new JLabel("Descripcion: ");
	    panelRegistro.add(lbl2);
    	//elemento2
        txt1 = new JTextField();
	    panelRegistro.add(txt1);
    	//elemento3
        JLabel lbl3 = new JLabel("Actividad: ");
	    panelRegistro.add(lbl3);
    	//elemento4
	    
	    //               MAJENO DE ERRORES E IMPLEMENTACIÓN DE COMBO BOX
        //JLabel lbl0 = new JLabel("Item 1 ComboBox");
	    ch1=new JComboBox<String>();
	    ch1.addItem("Act1");
	    ch1.addItem("Act2");
	    ch1.addItem("Act3");
	    ch1.addItem("Act4");
	    ch1.addItem("Act5");
	    panelRegistro.add(ch1);
    	
	    
	    //elemento5
        JLabel lbl4 = new JLabel("Fecha Inicio: ");
        panelRegistro.add(lbl4);
    	//elemento6
        txt2 = new JTextField();
	    panelRegistro.add(txt2);
    	//elemento7
        JLabel lbl5 = new JLabel("Fecha Finalización: ");
        panelRegistro.add(lbl5);
    	//elemento8
        txt3= new JTextField();
	    panelRegistro.add(txt3);
    	//elemento9
	    JLabel lbl6 = new JLabel("");
	    panelRegistro.add(lbl6);
    	//elemento10
	    btn1= new JButton("Crear Registro");
	    panelRegistro.add(btn1);
	    btn1.addActionListener(this); //behaviour
	    
    	//                                                     PANEL REGISTROS
	    panelRegistros.setLayout(new GridLayout(3,1));
	    //elemento1
	    JLabel lbl7 = new JLabel("");
	    panelRegistros.add(lbl7);
	    //elemento2
	    btn2= new JButton("Lista de Registros");
	    panelRegistros.add(btn2);
	    //elemento3
	    JLabel lbl8 = new JLabel("");
	    panelRegistros.add(lbl8);
    }    
    
    @Override
    public void actionPerformed( ActionEvent e )
    {
    	//behaviour
    	if (e.getSource()==btn1) {
    		//Crear registro
    		String selected=(String) ch1.getSelectedItem();
    		String descripcion=txt1.getText();
    		String fechaI=txt2.getText();
    		String fechaF=txt3.getText();
    		try {
				ventana.crearRegistro(descripcion,selected,fechaI,fechaF);
			} catch (ParseException e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			}
    		
        }
        else if(e.getSource()==btn2) {
        	//Mostrar lista de registros
        	ventana.mostrarRegistros();
        }
    }
}


/*
@SuppressWarnings("serial")
public class PanelDerecha extends JPanel{
	
	public PanelDerecha() {
		setSize(230,700);
		setLayout( new BorderLayout( ) );
        setBorder( new TitledBorder( "Información de registros" ) );
		
        //Crear sub paneles
        JPanel panelRegistro = new JPanel();
        JPanel panelRegistros = new JPanel();
        add(panelRegistro,BorderLayout.NORTH);
        add(panelRegistros,BorderLayout.SOUTH);
       
        //PANEL REGISTRO
        panelRegistro.setLayout(new GridLayout(8,1));
        panelRegistro.setBorder(new TitledBorder("Creación de registros"));
        //elemento1
        JTextField txtEjemplo= new JTextField( "texto arriba" );
      	txtEjemplo.setEditable( false );
      	panelRegistro.add(txtEjemplo);
        //elemento2      
        JTextField txtEjemplo1= new JTextField( "texto abajo" );
        txtEjemplo1.setEditable( false );
        panelRegistro.add(txtEjemplo1);
        //FALTAN 6 OBJS NO CREADOS
        
        
        
        
		//PANEL REGISTROS
        panelRegistros.setBorder(new TitledBorder("Historial de registros"));
        //elemento 1
        JButton btnHisotialRegistros = new JButton("Ver lista de registros");
		panelRegistros.add(btnHisotialRegistros);
		
		
	}
}
*/