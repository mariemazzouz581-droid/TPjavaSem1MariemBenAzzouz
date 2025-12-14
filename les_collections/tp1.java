import java.util.Collection;
import java.util.Collections;
import java.util.Scanner;
import java.util.Iterator;
import java.util.ArrayList;
public class tp1 {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        //Partie A
        //declare une liste
        ArrayList<Integer>notes= new ArrayList<>();
        //saisir n
        int n;
        do{
                System.out.println("donner la taille du n");
                n=sc.nextInt();
            }while(n<=0);
        //ajoute note
        System.out.println("combien de note voulez-vous saisir?");
        for(int i=0; i<n ;i++){
            int note;
            do{
                System.out.println("note"+(i+1)+"(0 a 20):");
                note=sc.nextInt();
            }while (note<0 || note>20) ;
            notes.add(note);
        }
        //affiche les notes
        System.out.println("notes"+notes);

        // moyenn max 
        int max=Collections.max(notes);
        double s=0;
        for(int x: notes)s+=x;
        double moy=s/notes.size();
        System.out.printf("max = %d\n", max);
        System.out.printf("moyenne = %.2f\n", moy);
        // note a suprrimer
        System.out.println("enter un note a supprimer");
        int nts=sc.nextInt();
        if(notes.contains(nts)){
            notes.remove(Integer.valueOf(nts));
            System.out.println("note supprimé");
        }
        else{
            System.out.println("note non trouvée");
        }
        //aprés supprimer
        System.out.println("note  apre supperssion"+notes);
        //tri
        Collections.sort(notes);
        System.out.println("liste trie"+notes);

        // supprimer note >18
        Iterator<Integer> it = notes.iterator();
        it = notes.iterator();
        while(it.hasNext()){
            if(it.next()>18)it.remove();
        }
        System.out.println("liste apre suppresion notes > 18"+notes);
        //rechcerche et modification
        System.out.println("saisir note a recherche");
        int nch=sc.nextInt();
        int index=notes.indexOf(nch); 
        if(index!=-1){
            System.out.println("note trouve"+index);
            System.out.println("entre nouvelle valeur"+index);
            int nv=sc.nextInt();
            notes.set(index,nv);
        }else{
            System.out.println("note non trouve");
        }
        System.out.println("liste des notes mise a jour"+notes);
        //Parie B
        ArrayList<String> etudiansts=new ArrayList<>();
        etudiansts.add("alia");
        etudiansts.add("samira");
        etudiansts.add("amira");
        sc.nextLine();
        System.out.println("entrer le nom de etudiant a ajouter");
        String nom=sc.nextLine() ;
        etudiansts.add(nom);
        //verfier si samira existe
        if(etudiansts.contains("samira")){
            System.out.println("samira existe dans la liste");
        }
        else{
            System.out.println("samira n'existe pas dans la liste");
        }
        //remplacer alia par alia ben salh
        int id=etudiansts.indexOf("alia");
        if(id!=-1)etudiansts.set(id,"alia ben salah");
        //suprimer un etidiant
        System.out.println("saisr nom a suuprimer");
        String nsup=sc.nextLine();
        if(etudiansts.contains(nsup)){
            etudiansts.remove(nsup);
            System.out.println("etudiant supprimé");}
            else{System.out.println("etudant non trouve");}
        //afficher tous les elment
        System.out.println("liste des etudiant");
        for(String e:etudiansts)System.out.println("/"+e);
        //tri les etudiant
        Collections.sort(etudiansts);
        System.out.println("liste trie"+etudiansts);
        //recherch par lettre
        System.out.println("saisir lettre du etuduant recherché");
        String l=sc.nextLine().toLowerCase();
        System.out.println("resultats");
        for(String e: etudiansts){
            if(e.toLowerCase().startsWith(l))System.out.println("/"+e);
        }

        
    }
}
