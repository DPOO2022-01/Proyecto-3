package proyecto2.InterfazPrincipal;

import java.awt.BorderLayout;

import java.awt.GridLayout;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.JTable;
import javax.swing.JTextArea;

public class PanelCentro extends JPanel
{
	public PanelCentro()
	{
		setLayout(new GridLayout(6,2));
		
		//elemento1
		JLabel lbl1 = new JLabel("Proyecto actual: ");
		add(lbl1);
		//elemento2
		JTextArea txt1 = new JTextArea();
		add(txt1);
		//elemento3
		JLabel lbl2 = new JLabel("");
		add(lbl2);
		//elemento4
		JLabel lbl3 = new JLabel("");
		add(lbl3);
		//elemento5
		JLabel lbl4 = new JLabel("Participantes");
		add(lbl4);
		//elemento6
		JTextField txt2 = new JTextField();
		add(txt2);
		//elemento7
		JLabel lbl5 = new JLabel("");
		add(lbl5);
		//elemento8
		JLabel lbl6 = new JLabel("");
		add(lbl6);
		//elemento9
		JLabel lbl7 = new JLabel("Actividades: ");
		add(lbl7);
		//elemento10
		JTable tbl1 = new JTable(5,5);
		add(tbl1);
		//elemento11
		JLabel lbl8 = new JLabel("");
		add(lbl8);
		//elemento12
		JLabel lbl9 = new JLabel("");
		add(lbl9);
	}
}


/*
public class PanelCentro extends JPanel{
	public PanelCentro() {
		setSize(230,700);
		setLayout( new BorderLayout( ) );
	    setBorder( new TitledBorder( " Mostrador de información " ) );
	    
	    setLayout( new GridLayout( 3 , 3 ) );
	    comentado
	    //elemento1
	    JTextField txtEjemplo= new JTextField( " Proyecto Actual " );
        txtEjemplo.setEditable( false );
        add( txtEjemplo );
	    //elemento2
        JTextField txtEjemplo11= new JTextField( " nombre del proyecto " );
        txtEjemplo11.setEditable( false );
        add( txtEjemplo11 );
	    //elemento3
        JTextField txtEjemplo1= new JTextField( " Participantes " );
        txtEjemplo1.setEditable( false );
        add( txtEjemplo1 );
	    //elemento4
        JTextField txtEjemplo12= new JTextField( " item1 de la lista " );
        txtEjemplo12.setEditable( false );
        JTextField txtEjemplo13= new JTextField( " item2 de la lista " );
        txtEjemplo13.setEditable( false );
        
        JList<JTextField> lstEjemplo= new JList<JTextField>();
        lstEjemplo.add(txtEjemplo12);
        lstEjemplo.add(txtEjemplo13);
	    //elemento5
        JTextField txtEjemplo2= new JTextField( " Actividades " );
        txtEjemplo2.setEditable( false );
        add( txtEjemplo2 );
	    //elemento6
	     comentado 
	     
	    
	    //elemeto1
	    JLabel lbl1= new JLabel("Texto 1");
	    add(lbl1);
		//elemeto2
	    JLabel lbl2= new JLabel("Texto 2");
	    add(lbl2);
		//elemeto3
	    JLabel lbl3= new JLabel("Texto 3");
	    add(lbl3);
		//elemeto4
	    JLabel lbl4= new JLabel("Texto 4");
	    add(lbl4);
		//elemeto5
	    JLabel lbl5= new JLabel("Texto 5");
	    add(lbl5);
		//elemeto6
	    JLabel lbl6= new JLabel("Texto 6");
	    add(lbl6);
	    
        
        // PANEL SHOW ACTIVIDADES
	    
        comentado
	    JPanel panelShowActividades= new JPanel();
	    add(panelShowActividades,BorderLayout.SOUTH);
	    
	    panelShowActividades.setLayout(new GridLayout(5,4));
	    panelShowActividades.setBorder( new TitledBorder( "Actividades Disponibles" ));
	    
	    //elemento de tabla 1
	    JTextField txtEjemplo111= new JTextField( " Nombre " );
        txtEjemplo111.setEditable( true );
        panelShowActividades.add( txtEjemplo111 );
		//elemento de tabla 2
        JTextField txtEjemplo112= new JTextField( " Tipo " );
        txtEjemplo112.setEditable( true );
        panelShowActividades.add( txtEjemplo112 );
		//elemento de tabla 3
        JTextField txtEjemplo113= new JTextField( " Descripción " );
        txtEjemplo113.setEditable( true );
        add( txtEjemplo113 );
		//elemento de tabla 4
        JTextField txtEjemplo114= new JTextField( " Participante Asignado " );
        txtEjemplo114.setEditable( true );
        add( txtEjemplo114 );
	    //elemento de tabla 5
        JTextField txtEjemplo115= new JTextField( " null " );
        txtEjemplo115.setEditable( true );
        add( txtEjemplo115 );
        comentado
	    
	    
	}
}*/
