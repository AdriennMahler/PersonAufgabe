public class Main {


    public static void main(String[] args) {

 //----------------------Aufruf getMustermann static method-------------------------//

       System.out.println("Ergebnis static getMethode: " + Person.getMustermann());

//--------------Person Objekt 1 - Mary----------//
        Person mary = new Person();

        System.out.println(mary);  //toString print Mary Objekt instance Variablen

//------------Person Objekt 2 Frank--------------//
        Person frank = new Person(
                "Frank",
                "Sinatra",
                1915,
                11122334
        );
        System.out.println(frank);

//---------------Person Objekt 3 Bob---------------//
        Person bob = new Person(1945);
        System.out.println(bob);

//----------------Person 4 Max-------------------//
        Person max = new Person();
        max.vorname= "Max";
        max.nachname= "Mustermann";
        max.geburtsjahr=1960;
        max.postleitzahl=12345;

        Person.printMustermann(max);

//---------------equals Methode-------------------//
        boolean resultMF = mary.equals(frank);
        System.out.println("Mary=Frank? " + resultMF);
        boolean resultBM = bob.equals(mary);
        System.out.println("Bob=Mary? " + resultBM);
        boolean resultBF = bob.equals(frank);
        System.out.println("Bob=Frank? " + resultBF);
    }
    //------------------BUILDER-------------------------//

 Person a = new PersonenBuilder()
         .vorname("Joe")
         .nachname("Doe")
         .geburtsjahr(1960)
         .postleitzahl(12345)
         .build();

        System.out.println(a);

}