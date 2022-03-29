package Overloading;

public class Karyawan extends Induk{
    public static void main(String[] args) {
        Karyawan karyawan = new Karyawan();
        karyawan.nama();
        karyawan.gaji();
        karyawan.gaji(500000);
    }

    @Override
    public void nama() {
        System.out.println("Nama karyawan: Bambang Surya");
    }  

}
