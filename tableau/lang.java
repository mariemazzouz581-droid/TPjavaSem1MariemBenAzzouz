import java.util.*;

public class lang {
    public static void main(String[] args) {
        //cree liste 
        ArrayList<String> langage=new ArrayList<>();
        //ajouter les langage
        langage.add("php");
        langage.add("java");
        langage.add("c++");
        langage.add("python");
        //inser pascale
        langage.add(0,"pascale");
        // recuper 3émee element
        String e3=langage.get(2);
        //aficher
        System.out.println("le 3éme élément est:"+ e3);
        //supprimer php et python
        langage.remove("php");
        langage.remove("python");
        //replacer c++ par c//#
        int r = langage.indexOf("c++"); // chercher l'indice de "C++"
        if (r != -1) {
            langage.set(r, "C#"); // remplacer par "C#"
        }

        System.out.println("Liste  modifie : " + langage);
    }
}
    

