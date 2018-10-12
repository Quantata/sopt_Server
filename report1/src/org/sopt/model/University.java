package org.sopt.model;

public class University {
    private int uniId; //대학 고유 번호
    private String uniName; //대학 이름
    private String uniCallNum; //대학 전화번호
    private String uniAdr; //대학 주소

    //toString
    @Override
    public String toString() {
        return "University{" +
                "uniIdx=" + uniId +
                ", uniName='" + uniName + '\'' +
                ", uniCallNum='" + uniCallNum + '\'' +
                ", uniAdr='" + uniAdr + '\'' +
                '}';
    }

    //Constructor1
    public University() {
        this.uniId = 123;
        this.uniName = "기본이름";
        this.uniCallNum = "02-4567-8901";
        this.uniAdr = "기본주소";
    }

    //Constructor2
    public University(int uniId, String uniName, String uniCallNum, String uniAdr) {
        this.uniId = uniId;
        this.uniName = uniName;
        this.uniCallNum = uniCallNum;
        this.uniAdr = uniAdr;
    }

    //getter
    public int getUniIdx() {
        return uniId;
    }

    //setter
    public void setUniIdx(int uniId) {
        this.uniId = uniId;
    }

    public String getUniName() {
        return uniName;
    }

    public void setUniName(String uniName) {
        this.uniName = uniName;
    }

    public String getUniCallNum() {
        return uniCallNum;
    }

    public void setUniCallNum(String uniCallNum) {
        this.uniCallNum = uniCallNum;
    }

    public String getUniAdr() {
        return uniAdr;
    }

    public void setUniAdr(String uniAdr) {
        this.uniAdr = uniAdr;
    }
}
