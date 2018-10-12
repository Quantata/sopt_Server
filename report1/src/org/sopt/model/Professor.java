package org.sopt.model;

public class Professor extends Department{
    private int profId;             //교수 고유번호
    private String profName;        //교수 이름
    private String profDept;      //교수 학과
    private String profPhone;       //교수 전화번호
    private String profClass;       //교수 담당과목

    @Override
    public String toString() {
        return "Professor{" +
                "profId=" + profId +
                ", profName='" + profName + '\'' +
                ", profDepart='" + profDept + '\'' +
                ", profPhone='" + profPhone + '\'' +
                ", profClass='" + profClass + '\'' +
                '}';
    }

    public Professor(){
        this.profId = 101;
        this.profName = "하이욤";
        this.profDept = "컴퓨터공학과";
        this.profPhone = "010-2222-2345";
        this.profClass = "자료구조";
    }

    public Professor(int profId, String profName, String profDept, String profPhone, String profClass) {
        this.profId = profId;
        this.profName = profName;
        this.profDept = profDept;
        this.profPhone = profPhone;
        this.profClass = profClass;
    }

    public Professor(int deptId, String deptName, String deptCallNum, String deptType, int profId, String profName, String profDept, String profPhone, String profClass) {
        super(deptId, deptName, deptCallNum, deptType);
        this.profId = profId;
        this.profName = profName;
        this.profDept = profDept;
        this.profPhone = profPhone;
        this.profClass = profClass;
    }

    public Professor(int uniId, String uniName, String uniCallNum, String uniAdr, int deptId, String deptName, String deptCallNum, String deptType, int profId, String profName, String profDept, String profPhone, String profClass) {
        super(uniId, uniName, uniCallNum, uniAdr, deptId, deptName, deptCallNum, deptType);
        this.profId = profId;
        this.profName = profName;
        this.profDept = profDept;
        this.profPhone = profPhone;
        this.profClass = profClass;
    }

    public int getProfId() {
        return profId;
    }

    public void setProfId(int profId) {
        this.profId = profId;
    }

    public String getProfName() {
        return profName;
    }

    public void setProfName(String profName) {
        this.profName = profName;
    }

    public String getProfDept() {
        return profDept;
    }

    public void setProfDepart(String profDept) {
        this.profDept = profDept;
    }

    public String getProfPhone() {
        return profPhone;
    }

    public void setProfPhone(String profPhone) {
        this.profPhone = profPhone;
    }

    public String getProfClass() {
        return profClass;
    }

    public void setProfClass(String profClass) {
        this.profClass = profClass;
    }
}
