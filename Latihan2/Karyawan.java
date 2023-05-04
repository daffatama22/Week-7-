public class Karyawan {
    private String nama;
    private int jumlahAnak;
    private int tunjanganAnak;

    public Karyawan(String nama, int jumlahAnak) {
        this.nama = nama;
        this.jumlahAnak = jumlahAnak;
        this.tunjanganAnak = 500000 * jumlahAnak;
    }

    public String getNama() {
        return nama;
    }

    public int getJumlahAnak() {
        return jumlahAnak;
    }

    public int getTunjanganAnak() {
        return tunjanganAnak;
    }
}



