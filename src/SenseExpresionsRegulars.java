import java.io.*;

public class SenseExpresionsRegulars {
    public static void main(String[] args) throws IOException {

        File f = new File("santako.txt");
        FileReader fw = new FileReader(f);
        BufferedReader bf = new BufferedReader(fw);

       String p = bf.readLine();
       String papan ="*<]:-DOo";
       String follet="<]:-D";
       String ren=">:o)";



        while (p!=null){
            int papanuel=contarPerLinea(p,papan);
            int reen=contarPerLinea(p,ren);
            int foll=contarPerLinea(p,follet);
            if(papanuel>0)System.out.print("Pare Noel ("+papanuel+") ");
            if(reen>0)System.out.print("Ren ("+reen+") ");
            if(foll-papanuel>0) System.out.print("Follet ("+foll+") ");
            System.out.println("\n");
            p= bf.readLine();
        }
    }
    public static int contarPerLinea(String linea,String comp){
        int t =0;
        if(linea.contains(comp)){
            ++t;
            int i = linea.indexOf(comp);
            return contarPerLinea1(linea.substring(comp.length()+i),comp,t);
        }
        return t;}
    public static int contarPerLinea1(String linea,String comp,int e){
        if(linea.contains(comp)){
            ++e;
            int i = linea.indexOf(comp);
            return contarPerLinea1(linea.substring(comp.length()+i),comp,e);
        }
        return e;}
}
