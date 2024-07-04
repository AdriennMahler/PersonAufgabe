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
       /* String vorname1=this.vorname;
        String vorname2=((Person)obj).vorname;
        return vorname1.equals(vorname2);*/
        Person p1=this;
        Person p2= (Person)obj;
        return vorname.equals(p2.vorname)
                && p1.nachname.equals(p2.nachname)
                && p1.geburtsjahr==p2.geburtsjahr
                && p1.postleitzahl == p2.postleitzahl;
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

    //-----------------------GETMUSTERMANN_____________________________________//

    public static Person getMustermann(){
        return new Person("Max", "Mustermann", 1960,12345);
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

    public static void printMustermann(Person max){

        System.out.println(max.vorname + " " + max.nachname +
                "  Geburtsjahr: " + max.geburtsjahr +" , Plz: " + max.postleitzahl);
    }

    //------------BUILDER____________________________________________//

/*
Exception in thread "main" java.lang.StackO

    public static class Builder {

        String vorname;
        String nachname;
        int geburtsjahr;
        int postleitzahl;



        public Builder vorname(String vorname){
            this.vorname=vorname;
            return this;
        }

        public Builder nachname(String nachname){
            this.nachname=nachname;
            return this;
        }
        public Builder geburtsjahr(int geburtsjahr){
            this.geburtsjahr=geburtsjahr;
            return this;
        }
        public Builder postleitzahl(int postleitzahl){
            this.postleitzahl=postleitzahl;
            return this;
        }


        public Person build() {
            return new Person(this);
        }
    }

    private Person(Builder builder) {
        vorname = builder.vorname;
        nachname = builder.nachname;
        geburtsjahr = builder.geburtsjahr;
        postleitzahl = builder.postleitzahl;
    }


Person p = new Person.Builder()
        .vorname("Joe")
        .nachname("Doe")
        .geburtsjahr(1960)
        .postleitzahl(12345)
        .build();
*/

}







