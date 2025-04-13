public class Trojka {
    private int a;
    private int b;
    private int c;

    public Trojka(int a, int b, int c){
        this.a = a;
        this.b = b;
        this.c = c;
    }



    public int getA() {
        return a;
    }

    public int getB() {
        return b;
    }

    public int getC() {
        return c;
    }



    public int sumaCyfr(int liczba){
        int suma = 0;
        while(liczba > 0){
            suma += liczba % 10;
            liczba /= 10;
        }
        return suma;
    }

    public boolean czySumaCyfrRownaC(){
        return sumaCyfr(a) + sumaCyfr(b) == c;
    }

    public boolean czyPierwsze(){
        return isPrime(a) && isPrime(b);
    }

    private boolean isPrime(int num){
        if(num <= 1) return false;

        for(int i = 2; i <= Math.sqrt(num); i++){
            if(num % i == 0) return false;
        }

        return true;
    }

    public boolean czyCEqualsAB(){
        return c == a * b;
    }

    @Override
    public String toString(){
        return a + " " + b + " " + c;
    }
}
