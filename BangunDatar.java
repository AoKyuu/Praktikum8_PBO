package Pertemuan_VIII;

public abstract class BangunDatar {
    String warna;
    
    public BangunDatar(String warna){
        this.warna = warna;
    }
    
    public abstract double hitungLuas();
    
    public void cetakWarna(){
        System.out.println("Warna bangun ini adalah: " + warna);
    }
}
