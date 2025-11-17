import java.util.Scanner;

public class DebugExemple5 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("saisir une phrase");
        ph=sc.nextLine();
        String[] mots = phrase.split(" ");
         int nbM = mots.length;
        int Voyelles = 0;
        String largeur = "";
        int i = 0;
while (i < mots.length) {
    String mot = mots[i];
    for (char c : mot.toLowerCase().toCharArray()) {
        if ("aeiouy".indexOf(c) >= 0) {
            Voyelles++;
        }
    }
    }
//if (mot.length() < motLong.length()) debougeur
if (mot.length() > motLong.length()){
        largeur = mot;
    }

    i++;
    System.out.println("Nombre de mots : " + nbM);
    System.out.println("Nombre de voyelles : " +Voyelles);
    System.out.println("Mot le plus long : " + largeur);
}}
