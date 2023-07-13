package com.dianxin.manager.entity;

public class UserData {
    private String number;
    private int scores;
    private double tcyl;
    private double tcyy;
    private String bdyh;
    private int tcnh;
    private String sfyk;
    private int kdyt;
    private String sfxy;
    private String sfxz;
    private String sfyh;

    public UserData() {
    }

    public String getNumber() {
        return number;
    }

    public void setNumber(String number) {
        this.number = number;
    }

    public int getScores() {
        return scores;
    }

    public void setScores(int scores) {
        this.scores = scores;
    }

    public double getTcyl() {
        return tcyl;
    }

    public void setTcyl(double tcyl) {
        this.tcyl = tcyl;
    }

    public double getTcyy() {
        return tcyy;
    }

    public void setTcyy(double tcyy) {
        this.tcyy = tcyy;
    }

    public String getBdyh() {
        return bdyh;
    }

    public void setBdyh(String bdyh) {
        this.bdyh = bdyh;
    }

    public int getTcnh() {
        return tcnh;
    }

    public void setTcnh(int tcnh) {
        this.tcnh = tcnh;
    }

    public String getSfyk() {
        return sfyk;
    }

    public void setSfyk(String sfyk) {
        this.sfyk = sfyk;
    }

    public int getKdyt() {
        return kdyt;
    }

    public void setKdyt(int kdyt) {
        this.kdyt = kdyt;
    }

    public String getSfxy() {
        return sfxy;
    }

    public void setSfxy(String sfxy) {
        this.sfxy = sfxy;
    }

    public String getSfxz() {
        return sfxz;
    }

    public void setSfxz(String sfxz) {
        this.sfxz = sfxz;
    }

    public String getSfyh() {
        return sfyh;
    }

    public void setSfyh(String sfyh) {
        this.sfyh = sfyh;
    }

    @Override
    public String toString() {
        return "UserData{" +
                "number='" + number + '\'' +
                ", scores=" + scores +
                ", tcyl=" + tcyl +
                ", tcyy=" + tcyy +
                ", bdyh='" + bdyh + '\'' +
                ", tcnh=" + tcnh +
                ", sfyk='" + sfyk + '\'' +
                ", kdyt=" + kdyt +
                ", sfxy='" + sfxy + '\'' +
                ", sfxz='" + sfxz + '\'' +
                ", sfyh='" + sfyh + '\'' +
                '}';
    }
}
