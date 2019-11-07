package pbo1.nim10118017;

/**
 *
 * @author Agung Nurhamidan
 * NAMA                 : Agung Nurhamidan
 * KELAS                : PBO1
 * NIM                  : 10118017
 * Deskripsi Program    : Class ini adalah class turunan dari class Bilangan,
 *                        berfungsi untuk menampilkan hasil penjumlahan.
 * 
 */
public class JumlahBilangan extends Bilangan {
    public void tampilHasilJumlah() {
        System.out.println("Hasil perjumlahan = " + (getX() + getY()));
    }
}
