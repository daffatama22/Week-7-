public class KaryawanKontrak extends Karyawan {
    private int upahHarian;
    private int jumlahHari;

    public KaryawanKontrak(String nama, int jumlahAnak, int upahHarian, int jumlahHari) {
        super(nama, jumlahAnak);
        this.upahHarian = upahHarian;
        this.jumlahHari = jumlahHari;
    }

    public int getUpahHarian() {
        return upahHarian;
    }

    public int getJumlahHari() {
        return jumlahHari;
    }

    public int getTotalUpah() {
        return (upahHarian * jumlahHari) + getTunjanganAnak();
    }

    public static void main(String[] args) {
        KaryawanTetap karyawanTetap = new KaryawanTetap("Gilang", 2, 5000000);
        System.out.println("Nama: " + karyawanTetap.getNama());
        System.out.println("Jumlah Anak: " + karyawanTetap.getJumlahAnak());
        System.out.println("Gaji Pokok: " + karyawanTetap.getGajiPokok());
        System.out.println("Tunjangan Anak: " + karyawanTetap.getTunjanganAnak());  
    }
}