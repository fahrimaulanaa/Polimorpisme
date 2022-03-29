package Overloading;

public abstract class Induk {

    public void gaji(){
        System.out.println("Gajinya sebesar Rp.1.500.000");
    }

    public void gaji(int gaji){
        System.out.println("Gaji tambahan sebesar Rp." + gaji);
    }

    public void Overloading(){
        System.out.println("Overloading");
    }

    public abstract void nama();
}
