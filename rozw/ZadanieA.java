import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class ZadanieA {

    public void wykonaj(){
        try(BufferedReader br = new BufferedReader(new FileReader("trojki.txt"))){
            String linia;

            while((linia = br.readLine()) != null){
                String[] liczby = linia.split(" ");
                Trojka trojka = new Trojka(Integer.parseInt(liczby[0]), Integer.parseInt(liczby[1]), Integer.parseInt(liczby[2]));
                
                if(trojka.czySumaCyfrRownaC()){
                    System.out.println(trojka);
                }
            }

        }catch(IOException e){
            e.printStackTrace();
        }
    }

}