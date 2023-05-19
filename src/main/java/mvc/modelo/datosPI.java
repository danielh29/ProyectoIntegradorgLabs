package mvc.modelo;

import java.sql.Date;

public class datosPI {
    //constructor y sus metodos
	int ID_Proyecto;
	String Nombre;
	int Nota_Obtenida;
	Date Ano;
	int Grupo;
	String URL_Proyecto;
	int Curso;
	int ID_Area;
	
	public datosPI (int ID_Proyecto, String Nombre, int Nota_Obtenida, Date Ano, int Grupo, String URL_Proyecto, int Curso, int ID_Area) {
		this.ID_Proyecto = ID_Proyecto;
		this.Nombre = Nombre;
		this.Nota_Obtenida = Nota_Obtenida;
		this.Ano = Ano;
		this.Grupo = Grupo;
		this.URL_Proyecto = URL_Proyecto;
		this.Curso = Curso;
		this.ID_Area = ID_Area;
	}
	
	public datosPI() {
		
	}
	
	public int getID_Proyecto() {
		return ID_Proyecto;
	}

	public void setID_Proyecto(int iD_Proyecto) {
		ID_Proyecto = iD_Proyecto;
	}

	public String getNombre() {
		return Nombre;
	}

	public void setNombre(String nombre) {
		Nombre = nombre;
	}

	public int getNota_Obtenida() {
		return Nota_Obtenida;
	}

	public void setNota_Obtenida(int nota_Obtenida) {
		Nota_Obtenida = nota_Obtenida;
	}

	public Date getAno() {
		return Ano;
	}

	public void setAno(Date ano2) {
		Ano = ano2;
	}

	public int getGrupo() {
		return Grupo;
	}

	public void setGrupo(int grupo) {
		Grupo = grupo;
	}

	public String getURL_Proyecto() {
		return URL_Proyecto;
	}

	public void setURL_Proyecto(String uRL_Proyecto) {
		URL_Proyecto = uRL_Proyecto;
	}

	public int getCurso() {
		return Curso;
	}

	public void setCurso(int curso) {
		Curso = curso;
	}

	public int getID_Area() {
		return ID_Area;
	}

	public void setID_Area(int iD_Area) {
		ID_Area = iD_Area;
	}
	@Override
	public String toString() {
	    return "datosPI{" +
	            "ID_Proyecto=" + ID_Proyecto +
	            ", Nombre='" + Nombre + '\'' +
	            ", Nota_Obtenida=" + Nota_Obtenida +
	            ", Ano=" + Ano +
	            ", Grupo=" + Grupo +
	            ", URL_Proyecto='" + URL_Proyecto + '\'' +
	            ", Curso=" + Curso +
	            ", ID_Area=" + ID_Area +
	            '}';
	}

}
