package Pertemuan_VIII;

public class PoliTester {
    public static void main(String[] args) {
        Hewan[] daftarHewan = new Hewan [3];
        daftarHewan[0] = new Hewan();
        daftarHewan[1] = new Kucing();
        daftarHewan[2] = new Anjing();
        
        for (Hewan h : daftarHewan){
            h.bersuara();
        }
    }
}
