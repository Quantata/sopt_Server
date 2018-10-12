package org.sopt.model.builder;

import org.sopt.model.University;

public class UniversityBuilder {
    private int uniIdx; //대학 고유 번호
    private String uniName; //대학 이름
    private String uniCallNum; //대학 전화번호
    private String uniAdr; //대학 주소

    public UniversityBuilder setUniIdx(int uniIdx) {
        this.uniIdx = uniIdx;
        return this;
    }

    public UniversityBuilder setUniName(String uniName) {
        this.uniName = uniName;
        return this;
    }

    public UniversityBuilder setUniCallNum(String uniCallNum) {
        this.uniCallNum = uniCallNum;
        return this;
    }

    public UniversityBuilder setUniAdr(String uniAdr) {
        this.uniAdr = uniAdr;
        return this;
    }

    public University build(){
        return new University(this.uniIdx, this.uniName, this.uniCallNum, this.uniAdr);
    }
}
