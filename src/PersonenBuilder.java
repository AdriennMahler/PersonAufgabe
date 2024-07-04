public class PersonenBuilder {

   // private Person person = new Person("", "", -1, -1);

   private  String vorname;
   private  String nachname;
   private  int geburtsjahr;
   private  int postleitzahl;



    public PersonenBuilder vorname(String vorname){
        //person.setVorname(vorname);
        this.vorname=vorname;
        return this;
    }

    public PersonenBuilder nachname(String nachname){
       // person.setNachname(nachname);
        this.nachname=nachname;
        return this;
    }

    public PersonenBuilder geburtsjahr(int geburtsjahr){
      //  person.setGeburtsjahr(geburtsjahr);
        this.geburtsjahr=geburtsjahr;
        return this;
    }

    public PersonenBuilder postleitzahl(int postleitzahl){
      //  person.setPostleitzahl(postleitzahl);
        this.postleitzahl=postleitzahl;
        return this;
    }

    public Person build(){

        //hier kann man überprüfen,
        //ob es genug Daten für neue Person gibt

        return new Person(vorname, nachname, geburtsjahr, postleitzahl);
    }
}
