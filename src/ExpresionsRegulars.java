import java.io.*;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class ExpresionsRegulars {
    public static void main(String[] args) throws IOException {
        File f = new File("santako.txt");
        FileReader fw = new FileReader(f);
        BufferedReader bf = new BufferedReader(fw);

        Pattern papa = Pattern.compile("\\*<]:-DOo");
        Pattern ren = Pattern.compile(">:o\\)");
        Pattern follet = Pattern.compile("<]:-D");


        String p = bf.readLine();
        while (p!=null){
            Matcher mat = papa.matcher(p);
            int papanuel =0;
            int renn =0;
            int foll=0;
            while (mat.find()){
            ++papanuel;
        }
            mat=ren.matcher(p);
            while (mat.find()){
                ++renn;
            }
           mat=follet.matcher(p);
            while (mat.find()){
                ++foll;
            }
            if(papanuel>0)System.out.print("Pare Noel ("+papanuel+") ");
            if(renn>0)System.out.print("Ren ("+renn+") ");
            if(foll-papanuel>0) System.out.print("Follet ("+foll+") ");
            p= bf.readLine();
            System.out.println("\n");


        }

    }
}