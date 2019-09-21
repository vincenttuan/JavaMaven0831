package day04_youbike;

public class Youbike {
    private String sno; // 站號
    private String sna; // 站名
    private String ar;  // 地址
    private double lat; // 緯度
    private double lng; // 經度
    private int tot; // 總量
    private int sbi; // 可借數量(有車)
    private int bemp; // 可還數量(空站)
    private double km; // 距離(自訂參數)
    public Youbike() {
    }

    public Youbike(String sno, String sna, String ar, double lat, double lng, int tot, int sbi, int bemp, double km) {
        this.sno = sno;
        this.sna = sna;
        this.ar = ar;
        this.lat = lat;
        this.lng = lng;
        this.tot = tot;
        this.sbi = sbi;
        this.bemp = bemp;
        this.km = km;
    }

    public String getSno() {
        return sno;
    }

    public void setSno(String sno) {
        this.sno = sno;
    }

    public String getSna() {
        return sna;
    }

    public void setSna(String sna) {
        this.sna = sna;
    }

    public String getAr() {
        return ar;
    }

    public void setAr(String ar) {
        this.ar = ar;
    }

    public double getLat() {
        return lat;
    }

    public void setLat(double lat) {
        this.lat = lat;
    }

    public double getLng() {
        return lng;
    }

    public void setLng(double lng) {
        this.lng = lng;
    }

    public int getTot() {
        return tot;
    }

    public void setTot(int tot) {
        this.tot = tot;
    }

    public int getSbi() {
        return sbi;
    }

    public void setSbi(int sbi) {
        this.sbi = sbi;
    }

    public int getBemp() {
        return bemp;
    }

    public void setBemp(int bemp) {
        this.bemp = bemp;
    }

    public double getKm() {
        return km;
    }

    public void setKm(double km) {
        this.km = km;
    }

    @Override
    public String toString() {
        return "Youbike{" + "sno=" + sno + ", sna=" + sna + ", ar=" + ar + ", lat=" + lat + ", lng=" + lng + ", tot=" + tot + ", sbi=" + sbi + ", bemp=" + bemp + ", km=" + km + '}';
    }

    
}
