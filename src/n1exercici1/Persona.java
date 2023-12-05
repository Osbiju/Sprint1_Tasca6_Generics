package n1exercici1;

public class Persona {
    private String nom;
    private String cognom;
    private int edad;

    public Persona (String nom, String cognom, int edad) {
        this.nom = nom;
        this.cognom = cognom;
        this.edad = edad;
    }

    public String getNom(){
        return this.nom;
    }
    public String getCognom(){
        return this.cognom;
    }
    public int getEdad(){
        return this.edad;
    }

    public void setNom(String nom){
        this.nom = nom;
    }

    public void setCognom(String cognom){
        this.cognom = cognom;
    }

    public void setEdad(int edad){
        this.edad = edad;
    }

    public String toString(){

        return "Nom: " + this.nom
                + "\nCognom: " + this.cognom
                + "\nEdad: " + this.edad;
    }


}
