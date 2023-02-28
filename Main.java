public class Main {
    public static void main(String[] args) {
        Person saya = new Person();
        saya.nama = "Bima";
        saya.bahasa = "Jawa";

        System.out.println(saya.nama);

        Lingkaran Lingkaran1 = new Lingkaran();
        Lingkaran1.jari2 = 7;
        Lingkaran1.getLuas();
        System.out.println(Lingkaran1.getLuas());

        Lingkaran Lingkaran2 = new Lingkaran(7);
        Lingkaran2.printKeliling();

    }
}