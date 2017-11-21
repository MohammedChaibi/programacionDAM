package juego;

public class jugador {
	
	//aqui declaramos las propiedades del jugador
	private int id;
	private String nombre;
	private String apellido;
	private String apellido2;
	private int edad;
	
	//aqui empezamos los getters y setters de cada propiedad del jugador
	public int getId(){
		return id;
	}
	
	public void setId (int id) {
		this.id = id;
	}
	public String getNombre(){
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	
	public String getApellido() {
		return apellido;
	}
	
	public void setApellido(String apellido) {
		this.apellido = apellido;
	}
	
	public String getApellido2() {
		return apellido2;
	}
	
	public void setApellido2(String apellido2) {
		this.apellido2 = apellido2;
	}
	
	public int getEdad() {
		return edad;
	}
	
	public void setEdad(int edad) {
		this.edad = edad;
	}
	//datos de jugador en tostring
	public String ToString (){
		return this.nombre+"\n"+this.apellido+"\n"+this.edad; 
	}
	 
	 
	

}
