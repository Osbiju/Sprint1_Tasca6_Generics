package n1exercici1;

public class NoGenericMethods {

    private Persona objecte1;
    private Persona objecte2;
    private Persona objecte3;

    public NoGenericMethods(Persona objecte1, Persona objecte2, Persona objecte3) {

        this.objecte1 = objecte1;
        this.objecte2 = objecte2;
        this.objecte3 = objecte3;
    }

    public Persona getObjecte1() {
        return this.objecte1;
    }
    public Persona getObjecte2(){
        return this.objecte2;
    }
    public Persona getObjecte3(){
        return this.objecte3;
    }

    public void setObjecte1(Persona objecte1) {
        this.objecte1 = objecte1;
    }
    public void setObjecte2(Persona objecte2) {
        this.objecte2 = objecte2;
    }
    public void setObjecte3(Persona objecte3) {
        this.objecte3 = objecte3;
    }

    public String toString(){
        return "Metode No Generic: " +
                "\nObjecte1: " + "\n" + this.objecte1 +
                "\nObjecte2: " + "\n" + this.objecte2 +
                "\nObjecte3: " + "\n" + this.objecte3;
    }

}

