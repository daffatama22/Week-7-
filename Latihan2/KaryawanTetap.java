public class KaryawanTetap extends Karyawan {
    private int gajiPokok;

    public KaryawanTetap(String nama, int jumlahAnak, int gajiPokok) {
        super(nama, jumlahAnak);
        this.gajiPokok = gajiPokok;
    }

    public int getGajiPokok() {
        return gajiPokok;
    }

    public int getTotalGaji() {
        return gajiPokok + getTunjanganAnak();
    }
}