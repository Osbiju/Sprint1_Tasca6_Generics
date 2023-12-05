package n1exercici2;

public class Persona {
    private String nom;
    private String cognom;
    private int edat;

    public Persona(String nom, String cognom, int edat) {
        this.nom = nom;
        this.cognom = cognom;
        this.edat = edat;
    }

    public String getNom() {
        return this.nom;
    }
    public String getCognom() {
        return this.cognom;
    }
    public int getEdat() {
        return this.edat;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }
    public void setCognom(String cognom) {
        this.cognom = cognom;
    }
    public void setEdat(int edat) {
        this.edat = edat;
    }

    public String toString() {
        return "Nom: " + this.nom
                + "\nCognom: " + this.cognom
                + "\nEdat: " + this.edat;
    }

}
