public class Constructors extends ImplementationofInterface  {
     String name;
     int age =55;
public Constructors(){//δημιουργια  ενος default κατσακευαστη για να δουλεψει ο παρακατω

}
     public Constructors(String name,int age) {
          this.name = name;//Με το this αναφερομαστε στο αντικειμενο που η κλαση αναφερεται δηλαδη στην αρχικη δηλωση των μεταβλητων
          this.age = age;
     }

      public Constructors(int ageexample){
//System.out.println("hello");
           System.out.println(age);
           this.age=ageexample;//Για παραδειγμα με αυτο το this αν δεν υπηρχε στην δημιουργια του αντικειμενου θα μου επεστρεφε την default τιμη του age δηλαδη 55
     }
     public Constructors (String nameexample){
          //System.out.println("hello");
          System.out.println(name);
          this.name=nameexample;

     }
}
