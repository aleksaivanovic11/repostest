package PACKAGE;

public class Student {

    public String ime;
    public String prezime;
    public int godine;

    public Student(){}

    public Student(String ime, String prezime, int godine){
        this.ime = ime;
        this.prezime = prezime;
        this.godine = godine;
    }
    public Student(String prezime, String godine){
        this.ime = ime;
        this.prezime = prezime;
    }
    public void ispis(){
        ime = "Zika";
        System.out.println("Ime:" + ime + "Prezime:" + prezime + "Godine:" + godine);
    }

    public String ispis2(){
        String student = "Ime:" + ime + "Prezime:" + prezime + "Godine:" + godine;
        return student;
    }
}
