package n1exercici2;

public class GenericMethod {
    public static void main(String[] args) {

        Persona persona1 = new Persona("Oscar", "Bierge",33);

        socUnMetodeGeneric(persona1, "Ordinador", 44);
        socUnMetodeGeneric("Ordinador", 44, persona1);


    }

    public static <T> void socUnMetodeGeneric (T un, T dos, T tres){
        System.out.println("Metode Generic 1: " + un);
        System.out.println("Metode Generic 2: " + dos);
        System.out.println("Metode Generic 3: " + tres);
    }


}
