package project1.modelo;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.text.ParseException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;


public class EventHandler {

	private static Map<String, Actividad> listActividades = null; //nameAct, Act
	private static Map<String, Actividad> userActividad = null; //userName, Act
	private String name;
	
	public EventHandler(String name) {
		this.name=name;
		listActividades=new HashMap<String, Actividad>();
		userActividad=new HashMap<String, Actividad>();
	}
	public void cargarInformacion(String ruta) throws ParseException 
	{
		
		//Se define en qué forma se guarda la información
		
		//crear proyecto
		Proyecto proyect = new Proyecto();
		//crear Participante inicial, pues este es quien inicializa el proyecto por default
		
		ParticipanteInicial participanteI= new ParticipanteInicial(name);
		participanteI.setProyecto(proyect);
		proyect.setFundador(participanteI);
		//mapa de actividades filtradas por titulo por entrada

		BufferedReader br;
		try {
			br = new BufferedReader(new FileReader(ruta));
			String linea = br.readLine();
			while (linea != null) {
			      String[] substr = linea.split(";");
			      Actividad actividad= new Actividad(substr[0],substr[1],substr[2]);
			      //fechaInicial=input("Ingrese la fecha en formato dd/HH/mm (dia/hora/min)");
			      //actividad.setFechaInicial(fechaInicial);
			      //actividad.setFechaFinal("00/00/00"); //fecha default para la primer vez que se crea una actividad
			      //añadir obj al Map
			      listActividades.put(actividad.getTitle(), actividad);
			      //añadir obj a la lista de actividades que tiene un proyecto
			      proyect.addActividad(actividad);
			      //siguiente linea
			      linea = br.readLine();
			}
			System.out.println("Información cargada correctamente");
		} catch (IOException e) {e.printStackTrace();}
	}
	public void crearParticipantes(String name) {
		ArrayList<Actividad> listActividad= new ArrayList<Actividad>(listActividades.values());
		for (Actividad cadaAct: listActividad) 
		{
			if (!cadaAct.getTieneCreador()) 
			{
				Participante participanteNuevo = new Participante(name);
				cadaAct.setCreador(participanteNuevo);
				cadaAct.setTieneCreador(true);
				userActividad.put(name, cadaAct);
				break;
			}
		}
	}
	public void crearProyecto(String name) {
		Proyecto proyect = new Proyecto();
		ParticipanteInicial participanteI= new ParticipanteInicial(name);
		participanteI.setProyecto(proyect);
		proyect.setFundador(participanteI);
	}
	public void crearRegistro(String descripcion, String actividadName,String fechaI,String fechaF) throws ParseException {
		
		Actividad userAct = listActividades.get(actividadName);
		userAct.setFechaFinal(fechaF);
		userAct.setFechaInicial(fechaI);
		Participante paticipanteAct = userAct.getCreador();
		Registro registroNuevo= new Registro(fechaI, fechaF,userAct);
		paticipanteAct.addRegistro(registroNuevo);
	}
	public void mostrarRegistros() {}
	
	public String getName() {
		return name;
	}
	public Map<String, Actividad> getActividades() 
	{
		return listActividades;
	}
	public Map<String, Actividad> getUserActividades() 
	{
		return userActividad;
	}

}
