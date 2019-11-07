package pbo1.nim10118017;

/**
 *
 * @author Agung Nurhamidan
 * NAMA                 : Agung Nurhamidan
 * KELAS                : PBO1
 * NIM                  : 10118017
 * Deskripsi Program    : Class ini adalah class turunan dari class Bilangan,
 *                        berfungsi untuk menampilkan selisih bilangan.
 * 
 */
public class SelisihBilangan extends Bilangan {
    public void tampilSelisih() {
        System.out.println("Hasil Selisih " + getX() + " - " + getY() + " = " + (getX() - getY()));
    }
}
