public class Lingkaran {
    double jari2;
    Lingkaran(double jari2){
        this.jari2 = jari2;
    }
    Lingkaran(){

    }
    double getLuas(){
        double Luas = (22/7)*jari2*jari2;
        return Luas;
    }
    void printKeliling(){
        double Keliling = 2*(22/7)*jari2;
        System.out.println(Keliling);
    }
}
