import java.util.ArrayList;
import java.util.List;

class Book {
    private String judul;
    private String penulis;
    private String kategori;
    private String sinopsis;

    public Book(String judul, String penulis, String kategori, String sinopsis) {
        this.judul = judul;
        this.penulis = penulis;
        this.kategori = kategori;
        this.sinopsis = sinopsis;
    }

    public String getKategori() {
        return kategori;
    }

    public String getJudul() {
        return judul;
    }

    public void displayBuku() {
        System.out.println("Judul    : " + judul);
        System.out.println("Penulis  : " + penulis);
        System.out.println("Sinopsis : " + sinopsis);
        System.out.println("-------------------------");
    }

    public int hitungJumlahKataSinopsis() {
        if (sinopsis == null || sinopsis.trim().isEmpty()) {
            return 0;
        }
        return sinopsis.trim().split("\\s+").length;
    }

    public double cekTingkatKesamaan(Book bukuLain) {
        int kesamaan = 0;
        int totalAtribut = 4;

        if (this.judul.equalsIgnoreCase(bukuLain.judul)) {
            kesamaan++;
        }
        if (this.penulis.equalsIgnoreCase(bukuLain.penulis)) {
            kesamaan++;
        }
        if (this.kategori.equalsIgnoreCase(bukuLain.kategori)) {
            kesamaan++;
        }
        if (this.sinopsis.equalsIgnoreCase(bukuLain.sinopsis)) {
            kesamaan++;
        }

        return (kesamaan / (double) totalAtribut) * 100;
    }

    public Book copy() {
        return new Book(this.judul, this.penulis, this.kategori, this.sinopsis);
    }

    public static List<Book> getDaftarBuku() {
        List<Book> daftarBuku = new ArrayList<>();
        // Teknologi
        daftarBuku.add(new Book("Pengantar Pemrograman Java", "David Flanagan", "Teknologi", "Buku ini membahas dasar-dasar pemrograman Java."));
        daftarBuku.add(new Book("Python untuk Pemula", "Mark Lutz", "Teknologi", "Buku ini memberikan dasar pemrograman Python bagi pemula."));
        daftarBuku.add(new Book("Penerapan Machine Learning", "Sebastian Raschka", "Teknologi", "Buku ini membahas penerapan machine learning."));
        daftarBuku.add(new Book("Prinsip Keamanan Informasi", "William Stallings", "Teknologi", "Menjelaskan dasar-dasar keamanan informasi."));
        daftarBuku.add(new Book("Teknologi Blockchain", "Andreas Antonopoulos", "Teknologi", "Bagaimana teknologi blockchain mengubah industri."));

        // Filsafat
        daftarBuku.add(new Book("Pemikiran Filsuf Yunani", "Bertrand Russell", "Filsafat", "Buku ini membahas pemikiran filsuf-filsuf Yunani."));
        daftarBuku.add(new Book("Pemahaman Eksistensialis", "Albert Camus", "Filsafat", "Membahas eksistensialisme dalam filsafat."));
        daftarBuku.add(new Book("Prinsip Etika", "Peter Singer", "Filsafat", "Buku ini menjelaskan prinsip-prinsip etika."));
        daftarBuku.add(new Book("Filsafat Asia", "Confucius", "Filsafat", "Menggali pemikiran filsafat dari Asia."));
        daftarBuku.add(new Book("Pemikiran Kritis Modern", "Friedrich Nietzsche", "Filsafat", "Membahas kritik Nietzsche terhadap pemikiran modern."));

        // Sejarah
        daftarBuku.add(new Book("Peradaban Dunia", "Yuval Noah Harari", "Sejarah", "Membahas sejarah peradaban manusia."));
        daftarBuku.add(new Book("Peradaban Islam", "Tariq Ramadan", "Sejarah", "Buku ini membahas perkembangan Islam."));
        daftarBuku.add(new Book("Kisah Perang Dunia", "Stephen Ambrose", "Sejarah", "Menganalisis strategi perang dunia."));
        daftarBuku.add(new Book("Era Revolusi Industri", "Eric Hobsbawm", "Sejarah", "Dampak revolusi industri terhadap ekonomi."));
        daftarBuku.add(new Book("Biografi Napoleon", "Andrew Roberts", "Sejarah", "Kehidupan dan karier Napoleon Bonaparte."));

        // Agama
        daftarBuku.add(new Book("Islam di Era Modern", "Hamka", "Agama", "Buku ini membahas perkembangan Islam modern."));
        daftarBuku.add(new Book("Pemahaman Kristiani", "C.S. Lewis", "Agama", "Penjelasan mendalam tentang ajaran Kristiani."));
        daftarBuku.add(new Book("Tafsir Bhagavad Gita", "Swami Vivekananda", "Agama", "Buku tafsir tentang Bhagavad Gita."));
        daftarBuku.add(new Book("Ajaran Talmud", "Adin Steinsaltz", "Agama", "Mengenal ajaran dalam kitab Talmud."));
        daftarBuku.add(new Book("Filosofi Buddha", "Dalai Lama", "Agama", "Konsep dan ajaran dalam filosofi Buddha."));

        // Psikologi
        daftarBuku.add(new Book("Teori Kepribadian", "Carl Jung", "Psikologi", "Menganalisis berbagai teori kepribadian."));
        daftarBuku.add(new Book("Dinamika Sosial", "Malcolm Gladwell", "Psikologi", "Bagaimana interaksi sosial memengaruhi masyarakat."));
        daftarBuku.add(new Book("Mengelola Emosi", "Martin Seligman", "Psikologi", "Strategi untuk mengelola emosi dengan baik."));
        daftarBuku.add(new Book("Dasar Behaviorisme", "Ivan Pavlov", "Psikologi", "Buku ini menjelaskan konsep behaviorisme."));
        daftarBuku.add(new Book("Pengembangan Kognitif", "Steven Pinker", "Psikologi", "Membahas perkembangan kognitif manusia."));

        // Politik
        daftarBuku.add(new Book("Sistem Demokrasi", "Alexis de Tocqueville", "Politik", "Menganalisis sistem demokrasi di dunia."));
        daftarBuku.add(new Book("Seni Strategi Politik", "Sun Tzu", "Politik", "Strategi dalam dunia politik."));
        daftarBuku.add(new Book("Tatanan Dunia", "Henry Kissinger", "Politik", "Buku ini membahas tatanan politik dunia."));
        daftarBuku.add(new Book("Teori Politik Kritis", "Noam Chomsky", "Politik", "Buku ini menganalisis teori politik kritis."));
        daftarBuku.add(new Book("Perubahan Sosial", "Antonio Gramsci", "Politik", "Perubahan sosial dalam politik global."));

        // Fiksi
        daftarBuku.add(new Book("Sekolah Sihir", "Neil Gaiman", "Fiksi", "Cerita fantasi tentang dunia sihir."));
        daftarBuku.add(new Book("Petualangan Fantasi", "George R.R. Martin", "Fiksi", "Kisah petualangan dalam dunia fantasi."));
        daftarBuku.add(new Book("Ekspedisi Ruang Angkasa", "Isaac Asimov", "Fiksi", "Cerita tentang eksplorasi luar angkasa."));
        daftarBuku.add(new Book("Kisah Detektif", "Agatha Christie", "Fiksi", "Novel misteri yang penuh intrik."));
        daftarBuku.add(new Book("Masa Depan Distopia", "Margaret Atwood", "Fiksi", "Membahas dunia dystopian di masa depan."));

        return daftarBuku;
    }
}