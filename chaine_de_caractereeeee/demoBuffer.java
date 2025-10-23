public class demoBuffer {
    public static void main(String[] args) {
        StringBuffer ch1 = new StringBuffer("j");
        StringBuffer ch2 = new StringBuffer();

        ch2 = ch2.append("l");

        System.out.println("ch2 = " + ch2);
        StringBuffer ch_sb = ch1;
        ch_sb=ch_sb.append(" est sensible à la casse");
System.out.println("Contenu de ch_sb: "+ch_sb);

System.out.println("Contenu de chi:" + ch1);

 boolean test = (ch_sb == ch1);

if (test) {

System.out.println("ch_sb et ch1 pointent sur le même objet !");

} else {
System.out.println("ch_sb et ch1 pointent sur des objets différents !");
}



ch2=ch2.append("angage");

System.out.println("ch2 = "+ch2);}}