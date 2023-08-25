package entidades;

import java.util.ArrayList;
import java.util.List;

public class Voto {
    private Alumno alumno;
    private List<Alumno> votados;

    public Voto() {
    }

    public Voto(Alumno alumno, List<Alumno> votados) {
        this.alumno = alumno;
        this.votados = votados;
    }

    public Alumno getAlumno() {
        return alumno;
    }

    public void setAlumno(Alumno alumno) {
        this.alumno = alumno;
    }

    public List<Alumno> getVotados() {
        if (this.votados == null) this.votados = new ArrayList<>();
        return votados;
    }

    public void setVotados(List<Alumno> votados) {
        this.votados = votados;
    }

    @Override
    public String toString() {
        return "Voto{" +
                "alumno=" + alumno +
                "\n votados=" + votados +
                '}';
    }
}
