import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class ZadanieD {
    public void wykonaj(){
        int liczbaTrójkątów = 0;
        int najdłuższyCiąg = 0;
        int aktualnyCiąg = 0;

        try(BufferedReader br = new BufferedReader(new FileReader("trojki.txt"))){
            String linia;

            while((linia = br.readLine()) != null){
                String[] liczby = linia.split(" ");
                Trojka trojka = new Trojka(Integer.parseInt(liczby[0]), Integer.parseInt(liczby[1]), Integer.parseInt(liczby[2]));

                if(czyTrojkat(trojka)){
                    liczbaTrójkątów++;
                    aktualnyCiąg++;
                }else{

                    if(aktualnyCiąg > najdłuższyCiąg){
                        najdłuższyCiąg = aktualnyCiąg;
                    }
                
                    aktualnyCiąg = 0;
                }
            }

            if(aktualnyCiąg > najdłuższyCiąg){
                najdłuższyCiąg = aktualnyCiąg;
            }

        }catch(IOException e){
            e.printStackTrace();
        }

        System.out.println("Liczba trójek liczb reprezentujących długości boków trójkąta: " + liczbaTrójkątów);
        System.out.println("Długość najdłuższego ciągu trójkątnego: " + najdłuższyCiąg);
    }

    private boolean czyTrojkat(Trojka t){
        int a = t.getA();
        int b = t.getB();
        int c = t.getC();
        return (a + b > c) && (a + c > b) && (b + c > a);
    }
}