package project1.modelo;


public class ParticipanteInicial extends Participante{
	//atributos + los heredados
	private Proyecto proyecto;
	//Constructor
	public ParticipanteInicial(String nombre) {
		super(nombre);
	}
	//Req funcionales
	//Req no funcionales
	public Proyecto getProyecto() {
		return proyecto;
	}
	public void setProyecto(Proyecto proyecto) {
		this.proyecto = proyecto;
	}
	
}
