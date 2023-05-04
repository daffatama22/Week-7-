public class Mobil2 {
    private String merk;
    private String warna;

    public Mobil2(String merk, String warna) {
      this.merk = merk;
      this.warna = warna;
    }
  
    public void hidupkanMobil() {
      System.out.println("Mobil dihidupkan");
    }
  
    public void ubahGigi(int gigi) {
      System.out.println("Gigi diubah menjadi " + gigi);
    }
  
    public void matikanMobil() {
      System.out.println("Mobil dimatikan");
    }
}
  
  
  