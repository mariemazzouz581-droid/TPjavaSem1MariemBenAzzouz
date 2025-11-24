import java.util.*;

public class app3_list {
    static Scanner sc = new Scanner(System.in);
    //1)lecture
        public static int lectureN(){
            int n;
            do{
                System.out.println("donner la taille du n");
                n=sc.nextInt();
            }while(n<=0);
        
        return n;}
    //2 remplir list
    public static void remplitTab(ArrayList<Integer> t, int n) {
        System.out.println("Saisir " + n + " entiers positifs :");
        for (int i = 0; i<n; i++) {
            int val;
            do {
                System.out.print("t[" + i + "] = ");
                val = sc.nextInt();
            } while (val <= 0);
            t.add(val);
        }
    }//mahi dynamique alh namlo saisir taille we9th namlo condition arrete boucle par quelle condition 
    //pair en list
    public static ArrayList<Integer> creeTpair(ArrayList<Integer> t) {
        ArrayList<Integer> tpair = new ArrayList<>();
        for (int i = 0; i <t.size(); i++) {
            if (t.get(i)%2==0 ){
                tpair.add(t.get(i));;
            }
        }
        return tpair;
    }
    //impair
     public static ArrayList<Integer> creeTimpair(ArrayList<Integer> t) {
        ArrayList<Integer> timpair = new ArrayList<>();
        for (int i = 0; i <t.size(); i++) {
            if (t.get(i)%2!=0 ){
                tpair.add(t.get(i));;
            }
        }
        return timpair;
    }
    //affichage 
    public static void afficherlist(ArrayList<Integer> t) {
        System.out.println(t);
    }
    public static void main(String[] args) {

        int n= lectureN();

        ArrayList<Integer> t = new ArrayList<>();
        remplitTab(t, n);

        ArrayList<Integer> tpair = creeTpair(t);
        ArrayList<Integer> timpair = creeTimpair(t);

        System.out.print("list      : ");
        afficherlist(t);

        System.out.print("list pair : ");
        afficherlist(tpair);

        System.out.print("list impair : ");
        afficherlist(timpair);
    }

}
