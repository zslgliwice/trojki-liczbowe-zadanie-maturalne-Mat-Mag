import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class ZadanieC {

    public void wykonaj(){
        try(BufferedReader br = new BufferedReader(new FileReader("trojki.txt"))){
            String linia;
            Trojka poprzednia = null;

            while((linia = br.readLine()) != null){
                String[] liczby = linia.split(" ");
                Trojka trojka = new Trojka(Integer.parseInt(liczby[0]), Integer.parseInt(liczby[1]), Integer.parseInt(liczby[2]));

                if(poprzednia != null && czyTrojkatProstokatny(poprzednia, trojka)){
                    System.out.println(poprzednia);
                    System.out.println(trojka);
                }

                poprzednia = trojka;
            }

        }catch(IOException e){
            e.printStackTrace();
        }
    }


    private boolean czyTrojkatProstokatny(Trojka t1, Trojka t2){
        int a1 = t1.getA();
        int b1 = t1.getB();
        int c1 = t1.getC();
        int a2 = t2.getA();
        int b2 = t2.getB();
        int c2 = t2.getC();

        return (a1 * a1 + b1 * b1 == c1 * c1) && (a2 * a2 + b2 * b2 == c2 * c2);
    }

}