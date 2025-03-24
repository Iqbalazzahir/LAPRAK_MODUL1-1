import java.util.List;

public class Main_Pemlan_01 {
    public static void main(String[] args) {
        List<Book> daftarBuku = Book.getDaftarBuku();

        // Menampilkan daftar buku berdasarkan kategori
        String kategoriSaatIni = "";
        for (Book buku : daftarBuku) {
            if (!buku.getKategori().equals(kategoriSaatIni)) {
                kategoriSaatIni = buku.getKategori();
                System.out.println("\nKategori: " + kategoriSaatIni);
                System.out.println("-------------------------");
            }
            buku.displayBuku();
        }

        // method cekTingkatKesamaan
        if (daftarBuku.size() > 1) {
            Book buku1 = daftarBuku.get(0);
            Book buku2 = daftarBuku.get(1);
            System.out.println("Tingkat kesamaan antara \"" + buku1.getJudul() + "\" dan \"" + buku2.getJudul() + "\": " + buku1.cekTingkatKesamaan(buku2) + "%");
        }

        // method copy
        if (!daftarBuku.isEmpty()) {
            Book bukuCopy = daftarBuku.get(0).copy();
            System.out.println("Salinan buku:");
            bukuCopy.displayBuku();
        }
    }
}