package model;

public class customer {
    private String ten;
    private Integer tuoi;
    private  String quequan;

    public String getTen() {
        return ten;
    }

    public void setTen(String ten) {
        this.ten = ten;
    }

    public Integer getTuoi() {
        return tuoi;
    }

    public void setTuoi(Integer tuoi) {
        this.tuoi = tuoi;
    }

    public String getQuequan() {
        return quequan;
    }

    public void setQuequan(String quequan) {
        this.quequan = quequan;
    }

    public customer(String ten, Integer tuoi, String quequan) {
        this.ten = ten;
        this.tuoi = tuoi;
        this.quequan = quequan;
    }
}
