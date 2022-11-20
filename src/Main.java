import java.io.File;
import java.io.FileNotFoundException;
import java.util.*;

public class Main {

    public static void main(String[] args) throws FileNotFoundException {

        File file= new File("C:\\\\Users\\\\bucur\\\\Desktop\\\\Facultate\\\\An 2\\\\Semestrul I\\\\L. Analiza Algoritmilor\\\\Wrapping up\\\\src\\\\fisier.txt");
        //INAINTE DE A RULA CODUL TE ROG SCHIMBA LOCATIA LUI fisier.txt CONFORM PC-ULUI PE CARE SE AFLA.
        try (Scanner scan = new Scanner(file)) { //AM PUS TRY DOAR CA SA FIE TOTUL OK FARA WARNING CA AM VAZUT CA MERGE SI FARA SA PUN CATCH(EXCEPTIE).
        	
			String[] Linie = new String[40];
			String[] Date = new String[10];
			int j=0;
			
			for(int i = 0; scan.hasNext(); i++){
				Date[i] = scan.nextLine();
			    StringTokenizer token = new StringTokenizer(Date[i]," ");
			    while(token.hasMoreTokens()) {
			    	Linie[j] = token.nextToken();
			        j++;
			    }
			}
			
			TreeSet<vehicle> ts = new TreeSet<vehicle>();
			int k = 0;
			while(k< Linie.length){
			    vehicle data = new vehicle(Linie[k], Integer.parseInt(Linie[k + 1]), Integer.parseInt(Linie[k + 2]), Linie[k + 3]);
			    ts.add(data);
			    k+=4;
			}
			
			ts.first().dispaly();  ts.last().dispaly();
		}
    }
}