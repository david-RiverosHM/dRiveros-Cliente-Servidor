package project1;

public class alumno {
    String sNombre;
    int nEdad;

    public void setSNombre(String sNombre) {
        this.sNombre = sNombre;
    }

    public alumno(String sNombre, int nEdad) {
        super();
        this.sNombre = sNombre;
        this.nEdad = nEdad;
    }

    public String getSNombre() {
        return sNombre;
    }

    public void setNEdad(int nEdad) {
        this.nEdad = nEdad;
    }

    public int getNEdad() {
        return nEdad;
    }

    public alumno() {
        super();
    }
    public String saludoBienvenido(String psNombre){
        return " hola mundo!!!. Bienvenid@" + psNombre;
        
    }
    public static void main(String []args){
        alumno myAlumno =new alumno();
        for (int i = 0; i < 6; i++) {
            System.out.println(i + myAlumno.saludoBienvenido("David"));
       }

    }
}
