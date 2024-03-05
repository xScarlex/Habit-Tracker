package HabitTracker;

public class Tareas {

	private int CafeAlc;
	private int CamaYVit;
	private int Stretch;
	private int Leer30;
	private int Recoger;
	private int EstudioTeorico;
	private int EstudioPractico;
	private int Deporte;
	private int Dia;
	private int Mes;
	private int Año;
	private String Observaciones;
	
	public Tareas (int cafeAlc, int camaYVit, int stretch, int leer30, int recoger, int estudioTeorico, int estudioPractico, int deporte, String observaciones, int dia, int mes, int año) {
        this.CafeAlc = cafeAlc;
        this.CamaYVit = camaYVit;
        this.Stretch = stretch;
        this.Leer30 = leer30;
        this.Recoger = recoger;
        this.EstudioTeorico = estudioTeorico;
        this.EstudioPractico = estudioPractico;
        this.Deporte = deporte;
        this.Observaciones = observaciones;
        this.Dia = dia;
        this.Mes = mes;
        this.Año = año;
    }
	
	
	public Tareas() {
		
	}


	public int getStretch() {
		return Stretch;
	}


	public void setStretch(int stretch) {
		Stretch = stretch;
	}


	public int getLeer30() {
		return Leer30;
	}


	public void setLeer30(int leer30) {
		Leer30 = leer30;
	}


	public int getEstudioTeorico() {
		return EstudioTeorico;
	}


	public void setEstudioTeorico(int estudioTeorico) {
		EstudioTeorico = estudioTeorico;
	}


	public int getEstudioPractico() {
		return EstudioPractico;
	}


	public void setEstudioPractico(int estudioPractico) {
		EstudioPractico = estudioPractico;
	}


	public int getDeporte() {
		return Deporte;
	}


	public void setDeporte(int deporte) {
		Deporte = deporte;
	}

	public String getObservaciones() {
		return Observaciones;
	}
	
	public void  setObservaciones(String observaciones) {
		Observaciones = observaciones;
	}


	public int getRecoger() {
		return Recoger;
	}


	public void setRecoger(int recoger) {
		Recoger = recoger;
	}


	public int getDia() {
		return Dia;
	}


	public void setDia(int dia) {
		Dia = dia;
	}


	public int getMes() {
		return Mes;
	}


	public void setMes(int mes) {
		Mes = mes;
	}
	
	public int getAño() {
		return Año;
	}
	public void setAño(int año) {
		Año = año;
	}
}