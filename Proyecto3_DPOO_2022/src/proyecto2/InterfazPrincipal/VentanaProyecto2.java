package proyecto2.InterfazPrincipal;

import java.awt.BorderLayout;

import java.awt.Color;
import java.text.ParseException;
import java.util.Date;

import javax.swing.JFrame;
import javax.swing.JOptionPane;

import project1.modelo.Actividad;
import project1.modelo.EventHandler;
import project1.modelo.Participante;
import project1.modelo.ParticipanteInicial;
import project1.modelo.Proyecto;


public class VentanaProyecto2 extends JFrame
{
	private PanelArriba panelArriba;
	private PanelIzquierda panelIzquierda;
	private PanelCentro panelCentro;
	private PanelDerecha panelDerecha;
	private Proyecto proyecto2;
	private EventHandler event;
	String name;
	
	public VentanaProyecto2()
	{
		//traer el mundo 
		proyecto2=new Proyecto();

		name = new JOptionPane().showInputDialog("Ingresen nombre jugador: ");
		event=new EventHandler(name);
		
		setSize( 700, 500 );//700,500
        setDefaultCloseOperation( EXIT_ON_CLOSE );
        setLocationRelativeTo( null );
        setTitle( "Administrador de proyectos " );
        
        panelArriba = new PanelArriba();
        panelArriba.setBackground(Color.cyan);
        add(panelArriba, BorderLayout.NORTH);
        
        panelIzquierda = new PanelIzquierda(this);
        add(panelIzquierda, BorderLayout.WEST);
        
        panelCentro = new PanelCentro();
        add(panelCentro, BorderLayout.CENTER);
        
        panelDerecha = new PanelDerecha(this);
        add(panelDerecha, BorderLayout.EAST);
	}
	
	public static void main (String[] args)
    {
		VentanaProyecto2  ventana = new  VentanaProyecto2( );
        ventana.setVisible( true );
    }
	//metodos
	public void cargarInformacion(String ruta) {
		try {
			event.cargarInformacion(ruta);
		} catch (ParseException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	public void crearParticipante(String name) {
		event.crearParticipantes(name);
	}
	public void crearProyecto(String name) {
		event.crearProyecto(name);
	}
	public void crearRegistro(String descripcion,String actividad, String fechaI,String fechaF) throws ParseException {
		event.crearRegistro(descripcion,actividad,fechaI,fechaF);
	}
	public void mostrarRegistros(){
		event.mostrarRegistros();
	}
	
	
	//metodos de Proyecto
	public String getNombre()
	{
		return proyecto2.getNombre();
	}
	public void setNombre(String nombre)
	{
		proyecto2.setNombre(nombre);
	}
	public Date setFechaInicial(String fechaI) throws ParseException 
	{
		return proyecto2.setFechaFinal(fechaI);
	}
	public Date setFechaFinal(String fechaF) throws ParseException 
	{
		return proyecto2.setFechaFinal(fechaF);
	}
	public ParticipanteInicial getFundador() 
	{
		return proyecto2.getFundador();
	}
	public void setFundador(ParticipanteInicial fundador) 
	{
		proyecto2.setFundador(fundador);
	}
	public void addActividad(Actividad actividad) 
	{
		proyecto2.addActividad(actividad);
	}
	public void addParticipantes(Participante participante) 
	{
		proyecto2.addParticipantes(participante);
	}
	
	
}
