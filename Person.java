public class Person {
    //ATRIBUT
    String nama;
    String gender;
    String address;
    int age;
    String job;
    String bahasa;
    int noktp;

    // METHOD
    void scream(){
        System.out.println("apaan tuh");
    }

    int koreanAge(){
        return age+1;
    }
    String suku(){
        if(bahasa == "Jawa"){
            return "Jawa";
        }
        return "Melayu";
    }


    //CONSTRACTOR
    Person(int umur, String alamat){
        this.age = umur;
        address = alamat;
        job = "Mahasiswa";
    }
    //agar dapat di isi bikin yang kosong
    Person(){

    }
}