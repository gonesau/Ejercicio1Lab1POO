import lib.Alumno;
public class MainAlumno {
    public static void main (String[] args){
        Alumno objetoAlumno = new Alumno();
        objetoAlumno.setNombre("Omar Fuentes");
        objetoAlumno.setCarnet("FG100222");
        System.out.println("El nombre del estudiante es: "+objetoAlumno.getNombre()+" y su carnet es: " + objetoAlumno.getCarnet());
    }
}
