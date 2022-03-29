package Abstract;

public class Karyawan extends Induk{

    @Override
    //Mengisi method abstract dari Induk
    public void gaji() {
        System.out.println("Gajinya sebesar Rp. 1.000.000");
    }

    public void nama(){
        System.out.println("Nama saya Bambang");
    }

    //Method Overriding jabatan dari class Induk
    public void jabatan(){
        System.out.println("Jabatan saya OB");
    }

    public static void main(String[] args) {

        //Deklarasi objek dari kelas Induk (Karyawan)
        Karyawan karyawan  = new Karyawan();
        karyawan.nama();
        karyawan.jabatan();
        karyawan.gaji();
    }
    
}
