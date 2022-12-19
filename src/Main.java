import java.lang.*;

import static jdk.nashorn.internal.objects.Global.println;

public class Main extends Methods{
    public static void main(String[] args) {
        System.out.println("Hello world!");
        //PRintname();
        Methods print_name =new Methods();//Σε αυτη τη περιπτωση σε μια non static method πρεπει να φτιαξω αντικειμενο!!!!!!!!!!
        print_name.PRintname("panos");
        PRint_age();
        System.out.println("Η τιμη πριν την αλλαγη της τιμης μεσω δημιουργιας αντικειμενου ειναι");
        PRintattributes();
        Methods newobjectofMethodsclass= new Methods();//δημιουργω νεο αντικειμενο!!!!!!
        newobjectofMethodsclass.attributeofclassMethods=6;
        System.out.println("Η τιμη πριν την αλλαγη της τιμης μεσω δημιουργιας αντικειμενου ειναι");
        PRintattributes();
        //constructors
        Constructors newconstructorobject=new Constructors("george",44);
        System.out.println("το ονομα του αντικειμενου απο τον νεο κατασκευαστη ειναι "+newconstructorobject.name);
        System.out.println("η ηλικια  του αντικειμενου απο τον νεο κατασκευαστη ειναι "+newconstructorobject.age);
        Constructors ageconstructor=new Constructors(222222);//εδω καλειται μονο ο κατασκευαστης με μονο ενα ορισμα int age
        System.out.println(ageconstructor.name);
        System.out.println(ageconstructor.age);
        Constructors namecosntructor=new Constructors("f");//εδω καλειται μονο ο κατασκευαστης με μονο ενα ορισμα string name
        System.out.println(namecosntructor.age);
        System.out.println(namecosntructor.name);
        ImplementationofInterface interfaceobj= new ImplementationofInterface();
        System.out.println("ΚΛηση αντικειμενου απο interface method");
        interfaceobj.print_size();
        System.out.println("ΚΛηση αντικειμενου απο interface method");
        interfaceobj.print_words();
        Arrays newarrobj = new Arrays();
        newarrobj.Insertdata();

        System.out.println(newarrobj);
generics <Integer>newobj =new generics<Integer>(22);
        System.out.println(newobj.getobject());

    }
}