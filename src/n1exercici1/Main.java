package n1exercici1;

public class Main {
    public static void main(String[] args) {

        Persona persona1 = new Persona("Oscar", "Bierge", 33);
        Persona persona2 = new Persona("Josep", "Aaaa", 60);
        Persona persona3 = new Persona("Maria", "Bbbbb", 58);

        //ara pasem els objectes en diferent ordre
        NoGenericMethods persones = new NoGenericMethods(persona3, persona1, persona2);
        NoGenericMethods persones1 = new NoGenericMethods(persona2, persona1, persona3);

        System.out.println(persones.toString());
        System.out.println(persones1.toString());

    }
}
