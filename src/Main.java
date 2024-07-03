public class Main {


    public static void main(String[] args) {



//--------------Person Objekt 1 - Mary----------//
        Person Mary = new Person();

        System.out.println(Mary);  //toString print Mary Objekt instance Variablen

//------------Person Objekt 2 Frank--------------//
        Person Frank = new Person(
                "Frank",
                "Sinatra",
                1915,
                11122334
        );
        System.out.println(Frank);

//---------------Person Objekt 3 Bob---------------//
        Person Bob = new Person(1945);
        System.out.println(Bob);

//----------------Person 4 Max-------------------//
        Person max = new Person();
        max.vorname= "Max";
        max.nachname= "Mustermann";
        max.geburtsjahr=1960;
        max.postleitzahl=12345;

        Person.getMustermann(max);

//---------------equals Methode-------------------//
        boolean resultMF = Mary.equals(Frank);
        System.out.println("Mary=Frank? " + resultMF);
        boolean resultBM = Bob.equals(Mary);
        System.out.println("Bob=Mary? " + resultBM);
        boolean resultBF = Bob.equals(Frank);
        System.out.println("Bob=Frank? " + resultBF);
    }

}