package mvc.modelo;

public class datosAreas {
        //constructor y sus metodos
		int ID_Area;
		String DESCRIPCION;
		
		public datosAreas(int ID_Area, String DESCRIPCION) {
			this.ID_Area = ID_Area;
			this.DESCRIPCION = DESCRIPCION;
		}
		
		public datosAreas(){
			
		}
		
		public int getID_Area() {
			return ID_Area;
		}

		public void setID_Area(int iD_Area) {
			ID_Area = iD_Area;
		}

		public String getDESCRIPCION() {
			return DESCRIPCION;
		}

		public void setDESCRIPCION(String dESCRIPCION) {
			DESCRIPCION = dESCRIPCION;
		}
		

}
