package ro.mycode.model;

public class Student {
    private String nume;
    private String facultate;

    private int nrMatricol;
    private float medieGenerala;

    public Student (String nume, String facultate, int nrMatricol, float medieGenerala){
        this.nume=nume;
        this.facultate=facultate;
        this.nrMatricol=nrMatricol;
        this.medieGenerala=medieGenerala;
    }


    public String getNume() {
        return nume;
    }

    public void setNume(String nume) {
        this.nume = nume;
    }

    public String getFacultate() {
        return facultate;
    }

    public void setFacultate(String facultate) {
        this.facultate = facultate;
    }

    public float getMedieGenerala() {
        return medieGenerala;
    }

    public void setMedieGenerala(float medieGenerala) {
        this.medieGenerala = medieGenerala;
    }

    public int getNrMatricol() {
        return nrMatricol;
    }

    public String descriereStudent(){
        String text="";
        text+="Numele studentului este: "+this.nume+"\n";
        text+="Facultatea :"+this.facultate+"\n";
        text+="Nr matricol: "+this.nrMatricol+"\n";
        text+="Media generala este: "+this.medieGenerala;
        return text;
    }
}
