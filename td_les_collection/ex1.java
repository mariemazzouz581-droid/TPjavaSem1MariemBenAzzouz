import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;
import java.util.Iterator;

public class ex1 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        //cree liste
        ArrayList<String> livres=new ArrayList <>();
    
        //saisir taille du liste
        int n;
        do{
            System.out.println("sair taile du liste  n>3");
            n=sc.nextInt();
            sc.nextLine();
        }while(n<=3);
        //remplir une liste
        for(int i=0;i<n;i++){
            System.out.println("saisr le tritre du livre"+(i+1)+":");
            String titre=sc.nextLine();
            livres.add(titre);
        }
        System.out.println("\n liste"+livres);
        //affichage par ordre croisant
        Collections.sort(livres);
        System.out.println("livre par ordre croissant"+livres);
        //suprrimer tus les livres qui commance par A
        Iterator<String> it = livres.iterator();
        while(it.hasNext()) {
            String e = it.next();
            if(e.toUpperCase().startsWith("A")) {it.remove();}}
        System.out.println("\n liste apre supperssin"+livres);
    }
        
}
