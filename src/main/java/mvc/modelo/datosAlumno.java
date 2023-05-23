package mvc.modelo;

public class datosAlumno {
    private int ID_Alumno;
    private int Numero_exp;
    private String Nombre;
    private int ID_Proyecto;
    
    public datosAlumno(int ID_Alumno, int Numero_exp, String Nombre, int ID_Proyecto) {
        this.ID_Alumno = ID_Alumno;
        this.Numero_exp = Numero_exp;
        this.Nombre = Nombre;
        this.ID_Proyecto = ID_Proyecto;
    }
    
    public datosAlumno(){
    	
    }
    
    public int getID_Alumno() {
        return ID_Alumno;
    }
    
    public void setID_Alumno(int ID_Alumno) {
        this.ID_Alumno = ID_Alumno;
    }
    
    public int getNumero_exp() {
        return Numero_exp;
    }
    
    public void setNumero_exp(int Numero_exp) {
        this.Numero_exp = Numero_exp;
    }
    
    public String getNombre() {
        return Nombre;
    }
    
    public void setNombre(String Nombre) {
        this.Nombre = Nombre;
    }
    
    public int getID_Proyecto() {
        return ID_Proyecto;
    }
    
    public void setID_Proyecto(int ID_Proyecto) {
        this.ID_Proyecto = ID_Proyecto;
    }
    @Override
    public String toString() {
        return "ID ALUMNO: " + ID_Alumno + " | NºEXPEDIENTE: " + Numero_exp + " | NOMBRE: " + Nombre + " | ID PROYECTO: " + ID_Proyecto ;
    }
}
