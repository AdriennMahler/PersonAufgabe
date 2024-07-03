public class Person {

     String vorname;
     String nachname;
     int geburtsjahr;
     int postleitzahl;


    //----------------toString überschreiben---------------------------//

    public String toString(){
        return "Customer " + vorname + " " +nachname + " aus " + postleitzahl +
                " ist in " + geburtsjahr + " geboren ";
    }

    //----------------equals überschreiben-------------------------------//

    public boolean equals(Object obj){
        if(!(obj instanceof Person)){
            return false;
        }
        String vorname1=this.vorname;
        String vorname2=((Person)obj).vorname;
        return vorname1==vorname2;
    }



    //-----------------CONSTRUCTOR NO ARGS WITH THIS___________________//

    public Person(){
        this("Mary", "Klein", 1976, 823456);
    }

    //---------------CONSTRUCTOR ÜBERSCHREIBT FIELDS_________________//


    public Person(int geburtsjahr){
        this("Bob","Marley", geburtsjahr, 99887766);
    }


    //---------------------CONSTRUCTOR ARGUMENTS----------------------//

    public Person(String firstName, String lastName, int geburtsjahr, int postleitzahl){
        vorname=firstName;
        nachname=lastName;
        this.geburtsjahr=geburtsjahr;
        this.postleitzahl=postleitzahl;

    }



//-------------------GETTER METHDODS-----------------------//
    public String getVorname() {
        return vorname;
    }

    public String getNachname() {
        return nachname;
    }

    public int getGeburtsjahr() {
        return geburtsjahr;
    }

    public int getPostleitzahl() {
        return postleitzahl;
    }

    //------------------SETTER METHODS----------------------//

    public void setVorname(String vorname) {
        this.vorname = vorname;
    }

    public void setNachname(String nachname) {
        this.nachname = nachname;
    }

    public void setGeburtsjahr(int geburtsjahr) {
        this.geburtsjahr = geburtsjahr;
    }

    public void setPostleitzahl(int postleitzahl) {
        this.postleitzahl = postleitzahl;
    }

    //----------------MUSTERMANN STATIC METHODE-----------------//

    public static void getMustermann(Person max){

        System.out.println(max.vorname + " " + max.nachname +
                "  Geburtsjahr: " + max.geburtsjahr +" , Plz: " + max.postleitzahl);
    }
}
